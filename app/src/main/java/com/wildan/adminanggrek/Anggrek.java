package com.wildan.adminanggrek;

import java.io.Serializable;

public class Anggrek implements Serializable {

    private String Judul, harga;

    public Anggrek(String Judul, String harga){
        this.Judul=Judul;
        this.harga=harga;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}

