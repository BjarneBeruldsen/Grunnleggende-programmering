/*Programmet leser inn tall og summerer ved trykk
 *på pluss knappen.
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;


public class Summering extends Application {
	private TextField tallFelt, sumUt; 
	private Button summer, nullstill; 
	private int sum = 0; 

	public void start(Stage vindu) {
		//lager panel 
		FlowPane panel = new FlowPane(); 
		//Avstand mellom elementer 
		panel.setHgap(10); 
		panel.setVgap(10); 

		//tekstfelt for innlesing av tall 
		Label tallTekst = new Label("Tall: "); 
		tallFelt = new TextField(); 
		tallFelt.setPrefColumnCount(10);
		tallFelt.setOnAction(e -> behandling(e)); 

		//tekstfelt til sum 
		Label sumTekst = new Label(" Sum: "); 
		sumUt = new TextField(); 
		sumUt.setPrefColumnCount(10); 

		//Knapper som summerer og nullstiller
		summer = new Button(" + ");  
		summer.setOnAction(e -> behandling(e)); 

		nullstill = new Button(" Nullstill "); 
		nullstill.setOnAction(e -> behandling(e)); 

		//legget til panel 
		panel.getChildren().addAll(tallTekst, tallFelt, summer, sumTekst, sumUt, nullstill);
		panel.setAlignment(Pos.CENTER);  

		//lager vindu 
		Scene scene = new Scene(panel); 
		vindu.setScene(scene); 
		vindu.setTitle("Summering"); 
		vindu.show(); 
	}

	//hendelsesmetode (lytter) 
	public void behandling(ActionEvent e) {
		//summerer skrevet tall. 
		if(e.getSource() == summer) {
			int tall = parseInt(tallFelt.getText()); 
			sum += tall; 
			sumUt.setText(""+sum); 
		}

		if(e.getSource() == nullstill) {
			tallFelt.setText(null); 
			sumUt.setText(null); 
			sum = 0; 
		} 
	}

	public static void main(String[] args) {
    launch(args);

  }

}