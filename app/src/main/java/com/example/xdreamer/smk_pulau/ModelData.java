package com.example.xdreamer.smk_pulau;

public class ModelData{
    private int gambarKota;
    private String namaKota;
    private String provinsiKota;
    private String deskripsiKota;

    public ModelData(int gambarKota, String namaKota, String provinsiKota, String deskripsiKota) {
        this.gambarKota = gambarKota;
        this.namaKota = namaKota;
        this.provinsiKota = provinsiKota;
        this.deskripsiKota = deskripsiKota;
    }

    public int getGambarKota() {
        return gambarKota;
    }

    public void setGambarKota(int gambarKota) {
        this.gambarKota = gambarKota;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }

    public String getProvinsiKota() {
        return provinsiKota;
    }

    public void setProvinsiKota(String provinsiKota) {
        this.provinsiKota = provinsiKota;
    }

    public String getDeskripsiKota() {
        return deskripsiKota;
    }

    public void setDeskripsiKota(String deskripsiKota) {
        this.deskripsiKota = deskripsiKota;
    }
}
