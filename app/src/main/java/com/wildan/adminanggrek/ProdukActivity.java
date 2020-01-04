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
    private int gbr[] = {R.drawable.anggrek1, R.drawable.anggrek2, R.drawable.anggrek3, R.drawable.anggrek4,R.drawable.anggrek5,R.drawable.anggrek6};

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
        anggreks.add(new Anggrek("Anggrek Bulan", (double) 100000));
        anggreks.add(new Anggrek("Anggrek Vanda", (double) 600000));
        anggreks.add(new Anggrek("Anggrek Putih", (double) 400000));
        anggreks.add(new Anggrek("Anggrek Ungu", (double) 400000));
        anggreks.add(new Anggrek("Anggrek Dendrobium Secund", (double) 650000));
        anggreks.add(new Anggrek("Anggrek Candy Strip", (double) 250000));
    }

}
