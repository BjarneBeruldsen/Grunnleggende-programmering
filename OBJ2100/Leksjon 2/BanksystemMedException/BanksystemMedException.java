package com.example.banksystemmedexception;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class BanksystemMedException extends Application {
    //test konto
    Konto k1 = new Konto(1000, 1234);



    private Label status;
    private TextField tfBeløp;
    private TextField tfVisBeløp;
    private TextField tfPin;
    private Button btSjekkPin, btUttak, btSetInn;
    GridPane panel;

    @Override
    public void start(Stage stage) throws IOException {

        //Oppretter panel
        panel = new GridPane();
        panel.setAlignment(Pos.CENTER);
        panel.setHgap(5);
        panel.setVgap(5);

        panel.add(status = new Label(), 0, 0);
        panel.add(new Label("Oppgi PIN-kode: "), 0, 1);
        panel.add(tfPin = new TextField(), 0, 2);
        panel.add(btSjekkPin = new Button("Ok"), 0, 3);

        btSjekkPin.setOnAction(e -> sjekkPin());

        Scene scene = new Scene(panel, 350, 400);
        stage.setScene(scene);
        stage.setTitle("Bank");
        stage.show();
    }

    public void sjekkPin() {
        try {
            int pin = Integer.parseInt(tfPin.getText());
            if(k1.sjekkPin(pin)) {
                nyttVindu();
            }
            else {
                throw new UgyldigPinException("Pin-koden er feil");
            }

        } catch (NumberFormatException  | UgyldigPinException e) {
            System.out.println("Fanget unntak: " + e.getMessage());
            status.setText("Fanget unntak: " + e.getMessage());
        }
    }

    public void nyttVindu() {
        status.setText("");
        panel.add(new Label("Beløp på konto: "), 0, 4);
        panel.add(tfVisBeløp = new TextField(), 0, 5);
        tfVisBeløp.setText(""+k1.getBalanse());
        tfVisBeløp.setEditable(false);

        panel.add(new Label("Gi beløp: "), 0, 6);
        panel.add(tfBeløp = new TextField(), 0, 7);

        panel.add(btUttak = new Button("Uttak"), 0, 8);
        panel.add(btSetInn = new Button("Sett inn"), 1, 8);


        btUttak.setOnAction(e -> behandleKlikk(e));
        btSetInn.setOnAction(e -> behandleKlikk(e));
    }

    public void behandleKlikk(ActionEvent e) {
        status.setText("");
        try {
            int beløp = Integer.parseInt(tfBeløp.getText());
            if (e.getSource() == btUttak) {
                k1.uttak(beløp);
                tfVisBeløp.setText(""+k1.getBalanse());
            } else if (e.getSource() == btSetInn) {
                k1.insetting(beløp);
                tfVisBeløp.setText(""+k1.getBalanse());
            }
        }
        catch (NumberFormatException | UgyldigbeløpException | UgyldigBalanseException er) {
            System.out.println("Fanget unntak: " + er.getMessage());
            status.setText("Fanget unntak: " + er.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}