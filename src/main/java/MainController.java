package com.example.tugasbesar;

import com.example.tugasbesar.controller.KnowledgeController;
import com.example.tugasbesar.model.Putusan;

public class MainController {

    private final KnowledgeController controller =
            new KnowledgeController();

    public KnowledgeController getController() {
        return controller;
    }

    public String tampilkanSemua() {

        StringBuilder sb =
                new StringBuilder();

        for (Putusan p :
                controller.getSemua()) {

            sb.append("Nomor: ")
                    .append(p.getNomorPerkara())
                    .append("\n");

            sb.append("Nama: ")
                    .append(p.getNamaTerdakwa())
                    .append("\n");

            sb.append("Jenis: ")
                    .append(p.getJenisNarkotika())
                    .append("\n");

            sb.append("Putusan: ")
                    .append(p.getPutusanHakim())
                    .append("\n");

            sb.append("-----------------\n");
        }

        return sb.toString();
    }
}