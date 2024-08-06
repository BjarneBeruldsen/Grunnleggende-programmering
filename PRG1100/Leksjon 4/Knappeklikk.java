import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField; 
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.io.*;
import java.util.*;

public class Knappeklikk extends Application {

	//deklarer elementer som skal gjenbrukes 
	private int[] antall = {0, 0};
	private Button knapp1, knapp2, knapp3; 
	private TextField tekstfelt1, tekstfelt2;  

	public void start(Stage vindu) {
		//Oppretter panel 
		FlowPane panel = new FlowPane(); 
		panel.setHgap(10);
    	panel.setVgap(10);  
    	Label ledetekst =  new Label("Klikk på en av de to knappene."); 
 
		//Oppretter knapp 1 og tekstfelt 1 
		knapp1 = new Button("Knapp 1"); 
		knapp1.setOnAction(e -> behandleKlikk(e)); 
		tekstfelt1 = new TextField();
		tekstfelt1.setPrefColumnCount(10);

		//Oppretter knapp2 og tekstfelt 2
		knapp2 = new Button("Knapp 2"); 
		knapp2.setOnAction(e -> behandleKlikk(e)); 
		tekstfelt2 = new TextField();
		tekstfelt2.setPrefColumnCount(10);

		//Oppretter knapp som nullstiller verdier i tekstfelt
		knapp3 = new Button("Nullstill"); 
		knapp3.setOnAction(e -> behandleKlikk(e)); 

		//Legger til elementer til panel 
		panel.getChildren().addAll(knapp1, tekstfelt1,  knapp2, tekstfelt2, knapp3); 

		//Hindrer bruker å endre størrelse på vindu 
		vindu.setResizable(false); 

		//Oppretter vindu
		Scene scene = new Scene(panel, 230, 120); 
		vindu.setTitle("Knappeklikk"); 
		vindu.setScene(scene);
		vindu.show(); 
	}
	  //Skriver ut antall klikk i tekstfeltet
  	public void behandleKlikk(ActionEvent e) {
  		if(e.getSource() == knapp1) {
  			antall[0]++; 
    		tekstfelt1.setText("Antall klikk = " + antall[0]);
    	}
    	else if(e.getSource() == knapp2){
    		antall[1]++; 
    		tekstfelt2.setText("Antall klikk = " + antall[1]); 
    	}
    	else if(e.getSource() == knapp3){
    		antall[0] = 0; 
    		antall[1] = 0;
    		tekstfelt1.setText("Antall klikk = " + antall[0]); 
    		tekstfelt2.setText("Antall klikk = " + antall[1]); 
    	}
  	}

	  public static void main(String[] args) {
    launch(args);

  }

}