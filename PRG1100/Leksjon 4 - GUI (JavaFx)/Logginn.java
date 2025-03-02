import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;


public class Logginn extends Application {

	//lager bruker opplysninger 
	final String BRUKERNAVN = "bjarne123321"; 
	final String PASSORD = "passord"; 

	//deklarer elementer som skal bli gjenbrukt 
	private TextField brukernavnFelt; 
	//felt for passord skriving 
	private PasswordField passordFelt; 
	private Button logginn; 
	private Label feilMelding, velkomst; 
	private int antInnlogging;   


	public void start(Stage vindu) {
		//Oppretter panel 
		FlowPane panel = new FlowPane(); 
		panel.setHgap(10); 
		panel.setVgap(10); 

		//Oppretter tekstfelt for brukernavn
		Label brukernavnTekst = new Label("Brukernavn:");  
		brukernavnFelt = new TextField(); 
		brukernavnFelt.setPrefColumnCount(25); 
		brukernavnFelt.setOnAction(e -> logginnSjekk());

		//Oppretter tekstfelt for passord
		Label passordTekst = new Label("Passord:"); 
		passordFelt = new PasswordField(); 
		passordFelt.setPrefColumnCount(25); 
		passordFelt.setOnAction(e -> logginnSjekk());

		//logg inn knapp
		logginn = new Button("Logg inn"); 
		logginn.setOnAction(e -> logginnSjekk()); 

		//feilmelding 
		feilMelding = new Label(); 

		//Oppretter status melding 


		//Legger elementer inn i panel og oppretter scene 
		panel.getChildren().addAll(brukernavnTekst, brukernavnFelt, 	
								   passordTekst, passordFelt, logginn, feilMelding); 

		Scene scene = new Scene(panel); 
		vindu.setScene(scene); 
		vindu.setTitle("Innlogging");
		vindu.show(); 
	}

	//metoder
	public void logginnSjekk() {
		if(brukernavnFelt.getText().equals(BRUKERNAVN) &&
		   passordFelt.getText().equals(PASSORD)) {

		   //Oppretter velkomst vindu 
		   Stage velkommen = new Stage(); 
		   FlowPane panel2 = new FlowPane(); 
		   panel2.setHgap(10); 
		   panel2.setVgap(10); 

		   velkomst = new Label("Velkommen!" + BRUKERNAVN); 
		   panel2.getChildren().addAll(velkomst); 
		   Scene scene2 = new Scene(panel2);
		   velkommen.setScene(scene2); 
		   velkommen.setTitle("Velkomst"); 
		   velkommen.show(); 
			} 
	    else {
		   feilMelding.setText("Feil med brukernavn eller passord!"); 
		   System.out.println("Feil med brukernavn eller passord!"); 
		   antInnlogging++; 
		}
		if(antInnlogging >=3 ) {
			System.exit(0); 
			System.out.println("Grense på 3 forsøk nådd. Programmet lukkes."); 
		}
		
	}

	public static void main(String[] args) {
    launch(args);

  }

}