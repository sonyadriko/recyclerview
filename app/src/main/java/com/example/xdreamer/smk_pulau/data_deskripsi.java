package com.example.xdreamer.smk_pulau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class data_deskripsi extends AppCompatActivity {

    private ImageView imageView;
    private TextView namaKota,provinsiKota,deskripsiKota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_deskripsi);

        imageView = findViewById(R.id.imageView);
        namaKota = findViewById(R.id.textNamaKota);
        provinsiKota = findViewById(R.id.textProvinsi);
        deskripsiKota = findViewById(R.id.textDeskripsi);

        Intent i = getIntent();
        int gambar = i.getIntExtra("gambarKota",R.mipmap.ic_launcher_round);
        String nama = i.getStringExtra("namaKota");
        String provinsi = i.getStringExtra("provinsiKota");
        String deskripsi = i.getStringExtra("deskripsiKota");

        imageView.setImageResource(gambar);
        namaKota.setText(nama);
        provinsiKota.setText(provinsi);
        deskripsiKota.setText(deskripsi);

    }
}
