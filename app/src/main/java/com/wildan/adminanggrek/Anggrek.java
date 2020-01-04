package com.wildan.adminanggrek;

import java.io.Serializable;

public class Anggrek implements Serializable {

    private String Judul, Gambar;
    private Double harga;

    public Anggrek(String Judul, Double harga){
        this.Judul=Judul;
        this.harga=harga;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getGambar() {
        return Gambar;
    }

    public void setGambar(String gambar) {
        Gambar = gambar;
    }
}

