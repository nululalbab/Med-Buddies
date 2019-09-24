package com.ulul.medbuddies.model;

public class DataInformation {
    String nama;
    String alamat;
    String no_telp;
    String ttl;
    String jenis_kalamin;
    String sumber_biaya;

    public DataInformation() {
        nama = "";
        alamat = "";
        no_telp = "";
        ttl = "";
        jenis_kalamin = "";
        sumber_biaya = "";
    }

    public DataInformation(String nama, String alamat, String no_telp, String ttl, String jenis_kalamin, String sumber_biaya) {
        this.nama = nama;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.ttl = ttl;
        this.jenis_kalamin = jenis_kalamin;
        this.sumber_biaya = sumber_biaya;
    }

    public String getSumber_biaya() {
        return sumber_biaya;
    }

    public void setSumber_biaya(String sumber_biaya) {
        this.sumber_biaya = sumber_biaya;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getJenis_kalamin() {
        return jenis_kalamin;
    }

    public void setJenis_kalamin(String jenis_kalamin) {
        this.jenis_kalamin = jenis_kalamin;
    }

}
