package com.example.tugasbesar.controller;

import com.example.tugasbesar.DataTidakValidException;
import com.example.tugasbesar.model.Putusan;
import com.example.tugasbesar.repository.KnowledgeRepository;

import java.util.ArrayList;

public class KnowledgeController {

    private final KnowledgeRepository repository =
            new KnowledgeRepository();

    private final String[] golongan = {
            "Golongan I",
            "Golongan II",
            "Golongan III"
    };

    public String[] getGolongan() {
        return golongan;
    }

    public void tambahData(
            String nomor,
            String nama,
            String jenis,
            String putusan)
            throws DataTidakValidException {

        if (nomor.isEmpty() ||
                nama.isEmpty() ||
                jenis.isEmpty() ||
                putusan.isEmpty()) {

            throw new DataTidakValidException(
                    "Data tidak boleh kosong");
        }

        Putusan p =
                new Putusan(
                        nomor,
                        nama,
                        jenis,
                        putusan);

        repository.tambah(p);
    }

    public Putusan cariData(String nomor) {
        return repository.cari(nomor);
    }

    public ArrayList<Putusan> getSemua() {
        return repository.getSemua();
    }
}