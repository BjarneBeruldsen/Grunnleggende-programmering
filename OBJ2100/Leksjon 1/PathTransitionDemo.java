package com.example.pathtransitiondemo;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class PathTransitionDemo extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //lager pane
        Pane panel = new Pane();

        //lager rektangel
        Rectangle rektangel = new Rectangle(0, 0, 5, 5);
        rektangel.setFill(Color.RED);


        //lager sirkel
        Circle sirkel = new Circle(200, 200, 100);
        sirkel.setFill(Color.WHITE);
        sirkel.setStroke(Color.BLACK);

        //legger til panel
        panel.getChildren().addAll(sirkel, rektangel);

        //lager en ny path
        PathTransition pt = new PathTransition();
        //setter varigheten av en syklus til 4 sekunder
        pt.setDuration(Duration.millis(4000));
        pt.setPath(sirkel);
        pt.setNode(rektangel);
        pt.setOrientation(
                PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT
        );
        pt.setCycleCount(Timeline.INDEFINITE);
        //snur vei når den har gjennomført en syklus
        pt.setAutoReverse(true);
        pt.play();

        sirkel.setOnMousePressed(e -> pt.pause());
        sirkel.setOnMouseReleased(e -> pt.play());

        Scene scene = new Scene(panel, 400, 400);
        stage.setTitle("PathTransitionDemo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}