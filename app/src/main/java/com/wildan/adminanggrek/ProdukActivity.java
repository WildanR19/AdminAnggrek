package com.wildan.adminanggrek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProdukActivity extends AppCompatActivity {

    private RecycleAdapter rAdapter;
    private ArrayList<Anggrek> anggreks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);

        getSupportActionBar().setTitle("List Produk");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.produk);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ProdukActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        ambdata();
        rAdapter = new RecycleAdapter(anggreks);
        recyclerView.setAdapter(rAdapter);
    }

    public void ambdata() {
        anggreks = new ArrayList<>();
        anggreks.add(new Anggrek("Anggrek Bulan","100000"));
        anggreks.add(new Anggrek("Anggrek Vanda","600000"));
        anggreks.add(new Anggrek("Anggrek Putih","400000"));
        anggreks.add(new Anggrek("Anggrek Ungu","400000"));
        anggreks.add(new Anggrek("Anggrek Dendrobium Secund", "650000"));
        anggreks.add(new Anggrek("Anggrek Candy Strip", "250000"));
    }

}
