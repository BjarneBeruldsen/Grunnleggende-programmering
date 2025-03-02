import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField; 
import javafx.scene.control.TextArea; 
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.io.*;
import java.util.*;
import static java.lang.System.out;
import javafx.stage.FileChooser;
import javafx.scene.text.Font;
import java.io.File;

public class Teksteditor extends Application {

	private TextField filnavn; 
	private Button åpne, lagre; 
	//deklarerer skriveområde
	private TextArea skriveområde; 
	private Label melding; 

	public void start(Stage vindu) {
		//TOP
		//oppretter label 
		Label fil = new Label("Fil:"); 

		//Oppretter tekstfelt for filnavn; 
		filnavn = new TextField(); 
		filnavn.setPrefColumnCount(6); 

		//Oppretter knapper 
		åpne = new Button("Åpne");
		lagre = new Button("Lagre");

		//kobler til metoder
		åpne.setOnAction(e -> åpneFil()); 
		lagre.setOnAction(e -> skrivFil()); 

		//Oppretter topp-panel 
		FlowPane topp = new FlowPane(); 
		topp.setHgap(10); 
		topp.getChildren().addAll(fil, filnavn, åpne, lagre);

		BorderPane panel = new BorderPane(); 
		panel.setTop(topp); 

		//CENTER
		//Oppretter skriveområdet 
		skriveområde = new TextArea(); 
		skriveområde.setPrefColumnCount(20);
		skriveområde.setPrefRowCount(20); 

		//Setter automatisk linjeskift
		skriveområde.setWrapText(true);  

		//setter programkodevennlig font i skriveområdet
		Font font = new Font("Courier new", 12);
		skriveområde.setFont(font);  

		//setter skriveområdet i center 
		panel.setCenter(skriveområde); 

		//BOTTOM 
		Label status = new Label("Satus: "); 
		melding = new Label(); 
		
		FlowPane bunn = new FlowPane(); 
		bunn.setHgap(10); 
		bunn.getChildren().addAll(status, melding); 
		panel.setBottom(bunn); 

		//Setter opp scene 
		Scene scene = new Scene(panel, 400, 400); 
		vindu.setTitle("Teksteditor"); 
		vindu.setScene(scene); 
		vindu.show(); 

	}  	

	//Metode for åpnng av fil 
	public void åpneFil() {
		String status = "Filen er åpnet ok!"; 
		try {
			FileChooser filvelger = new FileChooser(); 
			File fil = filvelger.showOpenDialog(null); 
			if(fil != null) {
				out.println("Valgt fil: " + fil.getAbsolutePath()); 
			}
			else {
				out.println("Du angret deg!"); 
			}
			Scanner leser = new Scanner(fil); 
			String innTekst = ""; 
			while(leser.hasNextLine()) {
				String linje = leser.nextLine(); 
				innTekst += linje + '\n'; 
			}
			leser.close(); 
			skriveområde.setText(innTekst);
		}
		catch(Exception e){
			status = "Feil med åpning av fil!"; 
		} 
		melding.setText(status); 
	}



	public void lesFil() {
		String status = "Filen er åpnet ok!"; 
		try{
			String fil = filnavn.getText(); 
			FileReader innlink = new FileReader(fil); 
			BufferedReader leser = new BufferedReader(innlink); 
			String innTekst = ""; 
			String linje = leser.readLine(); 
			while(linje != null) {
				innTekst += linje + '\n'; 
				linje = leser.readLine(); 
			}
			leser.close(); 
			skriveområde.setText(innTekst); 
		}
		catch(Exception e){
			status = "Feil med åpning av fil!"; 
		}
		melding.setText(status); 
	}

	public void skrivFil() {
		String status = "Teksten er lagret ok!"; 
		try{
			String fil = filnavn.getText(); 
			PrintWriter skriver = new PrintWriter(fil); 
			skriver.println(skriveområde.getText()); 
			skriver.close(); 
		}
		catch(Exception e){
			status = "Feil med lagring av tekst!"; 
		}
		melding.setText(status); 
	}

	public static void main(String[] args) {
    launch(args);
	}

}