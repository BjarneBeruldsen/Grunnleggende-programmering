package com.example.timelinedemo;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class TimeLineDemo extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        StackPane panel = new StackPane();
        Text text = new Text(20, 50, "Jeg heter Bjarne");
        text.setFill(Color.RED);
        panel.getChildren().add(text);

        //eventhandler for å endre teksten
        EventHandler<ActionEvent> handling = e -> {
            if (text.getText().length() != 0) {
                text.setText("");
            }
            else {
                text.setText("Jeg heter Bjarne");
            }
        };

        Timeline animasjon = new Timeline(new KeyFrame(Duration.seconds(0.5), handling));
        animasjon.setCycleCount(Timeline.INDEFINITE);
        animasjon.play();

        text.setOnMouseClicked(e -> {
                if(animasjon.getStatus() == Animation.Status.PAUSED) {
                    animasjon.play();
                }
                else {
                    animasjon.pause();
                }
        });

        Scene scene = new Scene(panel, 250, 250);
        stage.setScene(scene);
        stage.setTitle("flashing tekst");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}