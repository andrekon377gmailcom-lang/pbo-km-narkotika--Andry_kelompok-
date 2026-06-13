package com.example.tugasbesar.model;

public abstract class Kasus {

    private String nomorPerkara;

    public Kasus(String nomorPerkara) {
        this.nomorPerkara = nomorPerkara;
    }

    public String getNomorPerkara() {
        return nomorPerkara;
    }

    public abstract String getInfo();
}