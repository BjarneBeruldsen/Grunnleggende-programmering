import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField; 
import javafx.event.ActionEvent;

public class Knappetest extends Application {

  private int antall = 0;
  private Button knapp;  
  private TextField tekstfelt;  

  public void start(Stage vindu) { 
    BorderPane panel = new BorderPane(); 
    BorderPane cp = new  BorderPane(); 
    BorderPane rp = new BorderPane(); 
    panel.setCenter(cp); 
    panel.setRight(rp); 

    //Oppretter knapp med klikk her tekst 
    knapp = new Button("Klikk her!");
    //Kobler knapp sammen med applikasjonen 
    knapp.setOnAction(e -> behandleKlikk(e));
    cp.setTop(knapp); 
    tekstfelt = new TextField(); 
    cp.setLeft(tekstfelt); 
    tekstfelt.setPrefColumnCount(15);
    //Viser komponenter i gitt rekkefølge 
    Scene scene = new Scene(panel);
    vindu.setTitle("Knappetrykking");
    vindu.setScene(scene);
    vindu.show();
  }
  
  //Skriver ut antall klikk i tekstfeltet
  public void behandleKlikk(ActionEvent event) {
    antall++;
    tekstfelt.setText("Antall klikk = " + antall);
  }

  public static void main(String[] args) {
    launch(args);
  }

}