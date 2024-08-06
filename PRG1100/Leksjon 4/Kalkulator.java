import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;


public class Kalkulator extends Application {
	//elementer som skal gjenbrukes
	private TextField tall1Felt, tall2Felt, svarFelt; 
	private Button pluss, minus, gange, dele, nullstill;  
	private double tall1, tall2, svar; 

	public void start(Stage vindu) {
		//Oppretter panel 
		FlowPane top = new FlowPane(); 
		top.setHgap(10); 
		top.setVgap(10); 
		top.setAlignment(Pos.CENTER); 

		//Tall 1 tekstfelt 
		Label tall1Tekst = new Label("Tall 1: "); 
		tall1Felt = new TextField(); 
		tall1Felt.setPrefColumnCount(8);

		//Tall 2 tekstfelt 
		Label tall2Tekst = new Label("Tall 2: "); 
		tall2Felt = new TextField(); 
		tall2Felt.setPrefColumnCount(8); 

		//Oppretter panel for å plassere elementer
		top.getChildren().addAll(tall1Tekst, tall1Felt, tall2Tekst, tall2Felt); 
		BorderPane panel = new BorderPane(); 
		panel.setTop(top); 


		//Oppretter knapper 
		Label operasjonTekst = new Label("Operasjon: "); 
		pluss = new Button("+"); 
		pluss.setOnAction(e -> behandleKlikk(e)); 

		minus = new Button("-");
		minus.setOnAction(e -> behandleKlikk(e));

		gange = new Button("*"); 
		gange.setOnAction(e -> behandleKlikk(e));

		dele = new Button("/"); 
		dele.setOnAction(e -> behandleKlikk(e)); 

		//setter operasjoner i midten 
		FlowPane midten = new FlowPane(); 
		midten.setHgap(10); 
		midten.setVgap(10); 
		midten.setAlignment(Pos.CENTER);
		midten.getChildren().addAll(operasjonTekst, pluss, minus, gange, dele);
		panel.setCenter(midten);  

		
		//Svar tekstfelt
		Label svarTekst = new Label("Svar: "); 
		svarFelt = new TextField(); 
		svarFelt.setPrefColumnCount(10); 

		//knapp for nullstilling 
		nullstill = new Button("Nullstill"); 
		nullstill.setOnAction(e -> behandleKlikk(e)); 

		//setter svarfelt nederst 
		FlowPane bunn = new FlowPane(); 
		bunn.setHgap(10); 
		bunn.setVgap(10); 
		bunn.setAlignment(Pos.CENTER); 
		bunn.getChildren().addAll(svarTekst, svarFelt, nullstill); 
		panel.setBottom(bunn); 



		//Legger elementer til panel og scene 
		Scene scene = new Scene(panel); 
		vindu.setScene(scene); 
		vindu.setTitle("Kalkulator"); 
		vindu.show(); 
	}

	//metoder
	public void behandleKlikk(ActionEvent e) {
		try {
			//henter tall fra tekstfelt 
			tall1 = parseInt(tall1Felt.getText()); 
			tall2 = parseInt(tall2Felt.getText()); 
			if(e.getSource() == pluss) {
				svar = tall1 + tall2; 
			}
			else if(e.getSource() == minus) {
				svar = tall1 - tall2; 
			}
			else if(e.getSource() == gange) {
				svar = tall1 * tall2; 
			}
			else if(e.getSource() == dele) {
				svar = tall1 / tall2; 
			}

			svarFelt.setText(""+avrund(svar)); 

			if(e.getSource() == nullstill) {
				svarFelt.setText(""); 
				tall1Felt.setText(""); 
				tall2Felt.setText(""); 
			}
		}
		catch (Exception ex) {
			System.out.println("Feil med beregning!"); 
		}
	}
	//metode som avrunder til nærmeste heltatll
	public int avrund(double tall) {
		return (int)(tall + 0.5); 
	}

	public static void main(String[] args) {
    launch(args);

  }

}