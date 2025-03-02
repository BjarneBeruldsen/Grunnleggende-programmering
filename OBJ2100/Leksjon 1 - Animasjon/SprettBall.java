
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.w3c.dom.css.Rect;

import java.io.IOException;

public class SprettBall extends Application {
    private final double RADIUS = 20;
    private Pane panel = new Pane();
    private double x = RADIUS, y = RADIUS;
    private double dx = 1, dy = 1;
    private Circle sirkel = new Circle(x, y, RADIUS);
    private Timeline tidslinje;
    private Rectangle rektangel;
    private double rX, rY;
    private Button btNyRunde;


    @Override
    public void start(Stage stage) throws IOException {
        panel.setPrefHeight(425);
        panel.setPrefWidth(450);
        //fyller sirkel
        sirkel.setFill(Color.RED);
        //legger sirkel til panel
        panel.getChildren().add(sirkel);

        //legger til rektangel for å lage spill
        rX = panel.getPrefWidth() / 3;
        System.out.println(rX);
        rY = panel.getPrefHeight() / 4 * 3;
        System.out.println(rY);
        rektangel = new Rectangle(rX, rY, rX, 10);
        rektangel.setFill(Color.BLUE);
        panel.getChildren().add(rektangel);

        //legger til keylytter til panelet
        panel.setOnKeyPressed(e -> behandleTaster(e));


        //lager animasjon
        tidslinje = new Timeline(new KeyFrame(Duration.millis(50), e -> flyttBall()));
        tidslinje.setCycleCount(Timeline.INDEFINITE);
        tidslinje.setRate(10);
        tidslinje.play();


        Scene scene = new Scene(panel);
        panel.requestFocus();
        stage.setScene(scene);
        stage.setTitle("Sprettball");
        stage.show();
    }

    //metode som flytter ball
    public void flyttBall() {
        if(y < RADIUS) {
            dy *= -1;
        }
        else if(x < RADIUS || x > panel.getWidth() - RADIUS) {
            dx *= -1;
        }
        else if(y > rY - rektangel.getHeight() && y < rY + rektangel.getHeight() &&
                x > rektangel.getX() && x < rektangel.getX() + rektangel.getWidth()) {
            dy *= -1;
        }

        if(y > panel.getHeight() - RADIUS) {
            spillSlutt();
        }

        //endrer ballens posisjon
        sirkel.setCenterX(x += dx);
        sirkel.setCenterY(y += dy);
    }

    //metode som øker fart
    public void behandleTaster(KeyEvent e) {
        if(e.getCode() == KeyCode.UP) {
            tidslinje.setRate(tidslinje.getRate() + 1);
        }
        else if(e.getCode() == KeyCode.DOWN) {
            tidslinje.setRate(tidslinje.getRate() - 1);
        }
        else if(e.getCode() == KeyCode.RIGHT) {
            rektangel.setX(rektangel.getX()+10);
        }
        else if(e.getCode() == KeyCode.LEFT) {
            rektangel.setX(rektangel.getX()-10);
        }
    }

    public void spillSlutt() {
        tidslinje.pause();

        Text tekst = new Text("Game over");

        btNyRunde = new Button("Ny runde");
        btNyRunde.setLayoutX(panel.getWidth() / 3);
        btNyRunde.setLayoutY(panel.getHeight() / 4);

        panel.getChildren().addAll(tekst, btNyRunde);

        btNyRunde.setOnAction(e -> {
            tidslinje.play();
            x = RADIUS;
            y = RADIUS;
            btNyRunde.setVisible(false);
        });

    }

    public static void main(String[] args) {
        launch();
    }
}