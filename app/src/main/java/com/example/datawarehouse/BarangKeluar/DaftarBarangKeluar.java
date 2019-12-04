package com.example.datawarehouse.BarangKeluar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.datawarehouse.MainActivity;
import com.example.datawarehouse.R;

public class DaftarBarangKeluar extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_barang_keluar);

        Toolbar myToolbar = findViewById(R.id.toolbarBk);
        myToolbar.setNavigationIcon(getResources().getDrawable(R.drawable.arrow_back));
        setSupportActionBar(myToolbar);

        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaftarBarangKeluar.this, MainActivity.class));
                finish();
            }
        });

        actionBar = getSupportActionBar();
        actionBar.setTitle("Daftar Barang Keluar");
    }
}
