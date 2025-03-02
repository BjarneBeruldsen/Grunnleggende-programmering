package com.example.bildeanimasjon;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.paint.Color;

import java.awt.*;
import java.io.IOException;

public class BildeAnimasjon extends Application {
    private PathTransition pt;
    private Pane panel;
    private boolean isVisible;
    private Text tekst;
    @Override
    public void start(Stage stage) throws IOException {
        panel = new Pane();
        Image bilde = new Image("https://media.licdn.com/dms/image/v2/D4D03AQG14ftyl-kWQw/profile-displayphoto-shrink_200_200/profile-displayphoto-shrink_200_200/0/1722859989615?e=2147483647&v=beta&t=xMZbSOXaq0t3yyuKIJS-OELf_gsBAp8hiQjL3JeYcJ0");
        ImageView bildeVisning = new ImageView(bilde);

        //Lager transition
        pt = new PathTransition(Duration.millis(3000), new Rectangle(100, 100, 500, 400), bildeVisning);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.play();
        panel.getChildren().add(bildeVisning);
        bildeVisning.setOnMousePressed( e -> behandleKlikk(e));

        //Eventhandler for å endre fjerne/legge til bilde hvert sekund
        EventHandler<ActionEvent> eventHandler = e -> {
            isVisible = !isVisible;
            bildeVisning.setVisible(isVisible);
        };

        Timeline animasjon = new Timeline(new KeyFrame(Duration.millis(500), eventHandler));
        animasjon.setCycleCount(Timeline.INDEFINITE);
        animasjon.play();

        tekst = new Text(250, 670, "Prøv å trykk på Bjarne!");
        tekst.setFont(new Font("Times New Roman", 20));
        tekst.setStroke(Color.RED);
        panel.getChildren().add(tekst);

        Scene scene = new Scene(panel, 700, 700);
        stage.setTitle("Klikk på Bjarne");
        stage.setScene(scene);
        stage.show();
    }


    //metode for behanlding av klikk på Bjarne
    public void behandleKlikk(MouseEvent e) {
        pt.pause();
        Text tekst2 = new Text(250, 50, "Gratulerer du klarte det!");
        tekst2.setFont(new Font("Times New Roman", 20));
        tekst2.setStroke(Color.GREEN);
        panel.getChildren().add(tekst2);
        panel.getChildren().remove(tekst);
    }


    public static void main(String[] args) {
        launch();
    }
}