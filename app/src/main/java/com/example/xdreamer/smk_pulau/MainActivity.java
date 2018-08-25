package com.example.xdreamer.smk_pulau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterKota adapterKota;
    private List<ModelData> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        listData = new ArrayList<>();

        DataList();

        adapterKota = new AdapterKota(listData, new AdapterKota.ClickListerner() {
            @Override
            public void onClick(ModelData modelData) {
                Intent i = new Intent(MainActivity.this,data_deskripsi.class);
                i.putExtra("gambarKota", modelData.getGambarKota());
                i.putExtra("namaKota", modelData.getNamaKota());
                i.putExtra("provinsiKota", modelData.getProvinsiKota());
                i.putExtra("deskripsiKota", modelData.getDeskripsiKota());
                startActivityForResult(i,1);
            }
        });

        GridLayoutManager glm = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(glm);
        recyclerView.setAdapter(adapterKota);
    }

    public void DataList(){

        listData.add(new ModelData(R.mipmap.ic_bandung,"Bandung", "Jawa Barat", "Kota Bandung merupakan kota metropolitan terbesar di Provinsi Jawa Barat, sekaligus menjadi ibu kota provinsi tersebut. Kota ini terletak 140 km sebelah tenggara Jakarta, dan merupakan kota terbesar di wilayah Pulau Jawa bagian selatan."));
        listData.add(new ModelData(R.mipmap.ic_semarang,"Semarang", "Jawa Tengah", "Kota Semarang adalah ibukota Provinsi Jawa Tengah, Indonesia sekaligus kota metropolitan terbesar kelima di Indonesia sesudah Jakarta, Surabaya, Medan, dan Bandung."));
        listData.add(new ModelData(R.mipmap.ic_sby,"Surabaya", "Jawa Timur", "Kota Surabaya adalah ibu kota Provinsi Jawa Timur, Indonesia, sekaligus kota metropolitan terbesar di provinsi tersebut. Surabaya merupakan kota terbesar kedua di Indonesia setelah Jakarta."));
        listData.add(new ModelData(R.mipmap.ic_denpasar,"Denpasar", "Bali", "Kota Denpasar adalah ibu kota Provinsi Bali, Indonesia. Pertumbuhan industri pariwisata di Pulau Bali mendorong Kota Denpasar menjadi pusat kegiatan bisnis."));
        listData.add(new ModelData(R.mipmap.ic_jayapura,"Jayapura", "Papua", "Kota Jayapura adalah ibu kota provinsi Papua, Indonesia. Kota ini merupakan ibu kota provinsi yang terletak paling timur di Indonesia. Kota ini terletak di teluk Jayapura."));
        listData.add(new ModelData(R.mipmap.ic_medan,"Medan", "Sumatera Utara", "Kota Medan adalah ibu kota provinsi Sumatera Utara, Indonesia. Kota ini merupakan kota terbesar ketiga di Indonesia setelah Jakarta dan Surabaya, serta kota terbesar di luar Pulau Jawa."));
        listData.add(new ModelData(R.mipmap.ic_pekanbaru,"Pekanbaru", "Riau", "Kota Pekanbaru adalah ibu kota dan kota terbesar di provinsi Riau, Indonesia. Kota ini merupakan salah satu sentra ekonomi terbesar di bagian timur Pulau Sumatera."));
        listData.add(new ModelData(R.mipmap.ic_bandarlampung,"Bandar Lampung", "Lampung", "Kota Bandar Lampung adalah sebuah kota di Indonesia sekaligus ibukota dan kota terbesar di Provinsi Lampung."));
        listData.add(new ModelData(R.mipmap.ic_bandaaceh,"Banda Aceh", "Aceh", "Kota Banda Aceh adalah salah satu kota yang berada di Aceh dan menjadi ibukota Provinsi Aceh, Indonesia. Sebagai pusat pemerintahan, Banda Aceh menjadi pusat kegiatan ekonomi, politik, sosial dan budaya."));
    }

}