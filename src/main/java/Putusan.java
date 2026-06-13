package com.example.tugasbesar.model;

public class Putusan extends Kasus {

    private String namaTerdakwa;
    private String jenisNarkotika;
    private String putusanHakim;

    public Putusan(
            String nomorPerkara,
            String namaTerdakwa,
            String jenisNarkotika,
            String putusanHakim) {

        super(nomorPerkara);

        this.namaTerdakwa = namaTerdakwa;
        this.jenisNarkotika = jenisNarkotika;
        this.putusanHakim = putusanHakim;
    }

    public String getNamaTerdakwa() {
        return namaTerdakwa;
    }

    public String getJenisNarkotika() {
        return jenisNarkotika;
    }

    public String getPutusanHakim() {
        return putusanHakim;
    }

    @Override
    public String getInfo() {
        return "Kasus Narkotika";
    }
}