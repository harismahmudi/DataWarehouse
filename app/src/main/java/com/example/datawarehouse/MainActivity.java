package com.example.datawarehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.datawarehouse.BarangKeluar.DaftarBarangKeluar;
import com.example.datawarehouse.BarangMasuk.DaftarBarangMasuk;
import com.example.datawarehouse.Pegawai.DaftarPegawai;

public class MainActivity extends AppCompatActivity {

    private LinearLayout pegawai;
    private LinearLayout barangMasuk;
    private LinearLayout barangKeluar;
    private TextView keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pegawai = findViewById(R.id.pegawai);
        barangMasuk = findViewById(R.id.barangMasuk);
        barangKeluar = findViewById(R.id.barangKeluar);
        keluar = findViewById(R.id.keluar);

        pegawai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPegawai = new Intent(MainActivity.this, DaftarPegawai.class);
                startActivity(iPegawai);
            }
        });

        barangMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBarangM = new Intent(MainActivity.this, DaftarBarangMasuk.class);
                startActivity(iBarangM);
            }
        });

        barangKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBarangK = new Intent(MainActivity.this, DaftarBarangKeluar.class);
                startActivity(iBarangK);
            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iKeluar = new Intent(MainActivity.this, Home.class);
                startActivity(iKeluar);
                finish();
            }
        });
    }
}
