package com.wildan.adminanggrek;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;;
import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.anggrekViewHolder> {
    private ArrayList<Anggrek> anggreks;

    public RecycleAdapter(ArrayList<Anggrek> anggreks){
        this.anggreks=anggreks;
    }

    @Override
    public anggrekViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new anggrekViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecycleAdapter.anggrekViewHolder holder, int position) {
        holder.jdl.setText(anggreks.get(position).getJudul());
        holder.hrg.setText(anggreks.get(position).getHarga());
    }

    @Override
    public int getItemCount() {
        return (anggreks != null) ? anggreks.size() : 0;
    }

    public class anggrekViewHolder extends RecyclerView.ViewHolder {
        TextView jdl,hrg;
        Button btn;
        Context konteks;
        public String KEY_JDL = "judul";
        public String KEY_HRG = "harga";

        public anggrekViewHolder(View itemView) {
            super(itemView);
            jdl = (TextView) itemView.findViewById(R.id.Judul);
            hrg = (TextView) itemView.findViewById(R.id.harga);
            btn = (Button) itemView.findViewById(R.id.book);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    konteks = v.getContext();
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION){
                        Intent i = new Intent(konteks, CrudActivity.class);
                        i.putExtra(KEY_JDL, anggreks.get(position).getJudul());
                        i.putExtra(KEY_HRG, anggreks.get(position).getHarga());
                        konteks.startActivity(i);
                    }
                }
            });

        }
    }
}


