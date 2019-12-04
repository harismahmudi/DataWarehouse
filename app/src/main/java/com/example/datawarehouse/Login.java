package com.example.datawarehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private TextView usernameLog, passwordLog, klikDisini;
    private Button buttonLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameLog = findViewById(R.id.txt_usernameLog);
        passwordLog = findViewById(R.id.txt_passwordLog);
        klikDisini = findViewById(R.id.klikDisini);
        buttonLog = findViewById(R.id.buttonLog);

        klikDisini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iklikDisini = new Intent(Login.this, Register.class);
                startActivity(iklikDisini);
            }
        });

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameLog.getText().toString();
                String password = passwordLog.getText().toString();

                if ("user".equals(username) && "pass".equals(password)) {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Username atau password salah", Toast.LENGTH_LONG);
                }
            }
        });
    }
}
