/*Programmet omregner NOK til ønsker valuta
 *ved hjelp av inntxt, knapp og nedtrekksliste
 *og lyttere for alle disse elementene slik at 
 *omregningen alltid blir utført
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField; 
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import java.io.*;
import java.util.*;

import static java.lang.Double.*;  


public class Valutaomregning extends Application {

	private String[] valuta = {"EUR", "USD", "GPD"}; 
	private double[] valutaKurs = {11.47, 10.48, 13.46}; 
	private Button beregn; 
	private TextField inn, ut; 
	private ComboBox<String> liste; 

	public void start(Stage vindu) {
		//Oppretter panel
		FlowPane panel = new FlowPane(); 
		panel.setHgap(10); 
		panel.setVgap(10); 
		Label ledetekst = new Label("Valutakalkulator");

		//skriv inn verdi
		inn = new TextField(); 
		inn.setPrefColumnCount(6);
		inn.setOnAction(e -> omregning());  

		//Oppretter nedtrekksliste
		liste = new ComboBox<String>(); 
		liste.getItems().addAll(valuta); 
		//Setter startverdi til Euro 
		liste.setValue("EUR"); 
		liste.setOnAction(e -> omregning()); 

		//Oppretter beregningsknapp
		beregn = new Button("="); 
		beregn.setOnAction(e -> omregning()); 

		//skriver ut verdi 
	    ut = new TextField(); 
		ut.setPrefColumnCount(6);
		//Gjør at bruker ikke kan endre på denne teksten 
		ut.setEditable(false); 

		//legger elementer til panel 
		panel.getChildren().addAll(inn, liste, beregn, ut, new Label("NKR")); 
		Scene scene = new Scene(panel, 700, 100); 
		vindu.setScene(scene); 
		vindu.show(); 

	}

	//metode for omregning 
	private void omregning() {
		try {
			//finner posisjon til valgt verdi
			int pos = liste.getSelectionModel()
						   .getSelectedIndex(); 
			//omgjør input verdi til int			   
			double verdi = parseDouble(inn.getText()); 

			//valuta omregning 
			double sum = verdi * valutaKurs[pos];

			//Skriver ut avrundet resultat
			ut.setText("" + Math.round(sum) + ".00");  
						   	
		}
		catch (Exception e){
			ut.setText("Feil med omregning!"); 
		}
	}

	  public static void main(String[] args) {
    launch(args);

  }

}