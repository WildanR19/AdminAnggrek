package com.wildan.adminanggrek.crud;

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

public class AnggrekAdapter extends RecyclerView.Adapter<AnggrekAdapter.AnggrekViewHolder> {
    private List<Anggrek> AnggrekList = new ArrayList<>();
    RecyclerItemClickListener clickListener;
    //Locale localeID = new Locale("in", "ID");
    //NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

    public AnggrekAdapter(List<Anggrek> AnggrekList) {
        this.AnggrekList = AnggrekList;
    }

    @Override
    public AnggrekViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new AnggrekViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AnggrekViewHolder holder, final int position) {

        holder.txt_resultnama.setText(AnggrekList.get(position).getNama());
        holder.txt_resultharga.setText(AnggrekList.get(position).getHarga());

        DBHandler dbHandler = new DBHandler(this);
        holder.btn_hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.remove(position);
                Anggrek.remove(position);
                notifyItemRemoved(position);
                dbHandler.hapusDataAnggrek(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return AnggrekList.size();
    }

    public static class AnggrekViewHolder extends RecyclerView.ViewHolder {

        TextView txt_resultnama, txt_resultharga, btn_hapus;

        public AnggrekViewHolder(View itemView) {
            super(itemView);
            btn_hapus = (TextView) itemView.findViewById(R.id.btn_hapus);
            txt_resultnama = (TextView) itemView.findViewById(R.id.nama);
            txt_resultharga = (TextView) itemView.findViewById(R.id.harga);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}