package com.wildan.adminanggrek.crud;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;;
import com.wildan.adminanggrek.R;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AnggrekAdapter extends RecyclerView.Adapter<MyHolder> {
    //private List<Anggrek> AnggrekList = new ArrayList<>();
    ArrayList<Anggrek> AnggrekList;
    Context c;
    //Locale localeID = new Locale("in", "ID");
    //NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

    public AnggrekAdapter(Context context, ArrayList<Anggrek> AnggrekList) {
        this.c=context;
        this.AnggrekList = AnggrekList;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.nama.setText(AnggrekList.get(position).getNama());
        holder.harga.setText(AnggrekList.get(position).getHarga());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                Intent i = new Intent(c,EditProduk.class);

                i.putExtra("NAMA", AnggrekList.get(pos).getNama());
                i.putExtra("HARGA", AnggrekList.get(pos).getHarga());
                i.putExtra("ID", AnggrekList.get(pos).getId());

                c.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return AnggrekList.size();
    }
}