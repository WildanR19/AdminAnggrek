package com.wildan.adminanggrek.crud;

public class Anggrek {
    private int id;
    private String nama;
    private String harga;

    public Anggrek(String nama, String harga, int id) {
        this.nama = nama;
        this.harga = harga;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga(){
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
