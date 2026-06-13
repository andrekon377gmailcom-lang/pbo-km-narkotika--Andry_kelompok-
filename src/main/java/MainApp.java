package com.example.tugasbesar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    private final MainController controller =
            new MainController();

    @Override
    public void start(Stage stage) {

        TextField tfNomor =
                new TextField();

        tfNomor.setPromptText(
                "Nomor Perkara");

        TextField tfNama =
                new TextField();

        tfNama.setPromptText(
                "Nama Terdakwa");

        ComboBox<String> cbJenis =
                new ComboBox<>();

        cbJenis.getItems().addAll(
                controller.getController()
                        .getGolongan());

        TextField tfPutusan =
                new TextField();

        tfPutusan.setPromptText(
                "Putusan Hakim");

        Button btnSimpan =
                new Button("Simpan");

        Button btnCari =
                new Button("Cari");

        TextArea hasil =
                new TextArea();

        btnSimpan.setOnAction(e -> {

            try {

                controller.getController()
                        .tambahData(
                                tfNomor.getText(),
                                tfNama.getText(),
                                cbJenis.getValue(),
                                tfPutusan.getText());

                hasil.setText(
                        controller.tampilkanSemua());

            } catch (Exception ex) {

                hasil.setText(
                        ex.getMessage());
            }
        });

        btnCari.setOnAction(e -> {

            var data =
                    controller.getController()
                            .cariData(
                                    tfNomor.getText());

            if (data != null) {

                hasil.setText(
                        data.getNamaTerdakwa()
                                + "\n"
                                + data.getJenisNarkotika()
                                + "\n"
                                + data.getPutusanHakim());
            }
        });

        VBox root = new VBox(
                10,
                tfNomor,
                tfNama,
                cbJenis,
                tfPutusan,
                btnSimpan,
                btnCari,
                hasil
        );

        root.setPadding(
                new Insets(10));

        Scene scene =
                new Scene(root, 500, 500);

        stage.setTitle(
                "Sistem Putusan Narkotika");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}