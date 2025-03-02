import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField; 
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class Innlogging extends Application {

	public void start(Stage vindu) {
		//Oppretter panel som organiserer gui komponenter 
		FlowPane panel = new FlowPane(); 

		//setter luft mellom komponenter 
		panel.setHgap(10); 

		//Oppretter etikett og tekstfelt
		Label etikett = new Label("Brukernavn: "); 
		//Endrer stil på etikett
		etikett.setStyle("-fx-border-color:black;" + 
						 "-fx-padding: 5px"); 
		TextField brukernavn = new TextField(); 
		brukernavn.setPrefColumnCount(25); 

		//Sørger for å legge etikett og tekstfelt som barn inn i panelet 
		panel.getChildren().add(etikett); 
		panel.getChildren().add(brukernavn); 

		//Oppretter vindu
		Scene scene = new Scene(panel, 230, 80); 
		vindu.setScene(scene); 

		//Lager tekst på toppen av vinduet 
		vindu.setTitle("Innlogging"); 

		//Gjør vinduet synlig. 
		vindu.show(); 
	}

	  public static void main(String[] args) {
    launch(args);

  }

}