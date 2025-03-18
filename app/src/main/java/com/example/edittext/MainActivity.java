package com.example.edittext;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView idTextView;
    private TextView pwTextView;
    private TextView phoneTextView;
    private EditText eidText;
    private EditText epwText;
    private EditText ephoneText;
    private Button ebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ebutton = (Button) findViewById(R.id.button);
        eidText = (EditText) findViewById(R.id.edittextid);
        epwText = (EditText) findViewById(R.id.edittextpw);
        ephoneText = (EditText) findViewById(R.id.edittextphone);
        idTextView = (TextView) findViewById(R.id.textViewid);
        pwTextView = (TextView) findViewById(R.id.textViewpw);
        phoneTextView = (TextView) findViewById(R.id.textViewphone);

    }

    public void onClicked(View view) {
        String id = eidText.getText().toString();
        idTextView.setText("아이디: " + id);
        String pw = epwText.getText().toString();
        pwTextView.setText("패스워드: " + pw);
        String phone = ephoneText.getText().toString();
        phoneTextView.setText("전화 번호: "+ phone);

    }
}