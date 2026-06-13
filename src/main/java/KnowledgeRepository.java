package com.example.tugasbesar.repository;

import com.example.tugasbesar.model.Putusan;

import java.util.ArrayList;

public class KnowledgeRepository {

    private final ArrayList<Putusan> data =
            new ArrayList<>();

    public void tambah(Putusan putusan) {
        data.add(putusan);
    }

    public ArrayList<Putusan> getSemua() {
        return data;
    }

    public Putusan cari(String nomor) {

        for (Putusan p : data) {

            if (p.getNomorPerkara()
                    .equalsIgnoreCase(nomor)) {

                return p;
            }
        }

        return null;
    }
}