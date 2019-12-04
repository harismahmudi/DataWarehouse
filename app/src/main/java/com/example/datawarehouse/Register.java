package com.example.datawarehouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    private TextView namaReg, userReg, passReg, klikDisini;
    private Button daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        namaReg = findViewById(R.id.txt_namaReg);
        userReg = findViewById(R.id.txt_usernameReg);
        passReg = findViewById(R.id.txt_passwordReg);
        daftar = findViewById(R.id.buttonDaftar);
        klikDisini = findViewById(R.id.klikDisini2);

        klikDisini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLogin = new Intent(Register.this, Login.class);
                startActivity(iLogin);
            }
        });

    }
}
