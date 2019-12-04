package com.example.datawarehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {

    private LinearLayout loginHome;
    private LinearLayout registerHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        loginHome = findViewById(R.id.buttonLog);
        registerHome = findViewById(R.id.buttonReg);

        loginHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLogin = new Intent(Home.this, Login.class);
                startActivity(iLogin);
            }
        });

        registerHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iRegister = new Intent(Home.this, Register.class);
                startActivity(iRegister);
            }
        });

    }
}
