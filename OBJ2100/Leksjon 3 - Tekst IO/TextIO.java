import java.io.*;

public class TextIO {
    public static void main(String[] args) {
        String[] navnTab = {"Ole", "Knut", "Kari"};
        try {
            BufferedWriter skriver = new BufferedWriter(new FileWriter("tekst.txt"));
            skriver.write("Skriver til en fil. ");
            skriver.write("\nEn ny linje. ");
            for (String navn : navnTab) {
                skriver.write("\n" + navn);
            }
            skriver.close();
        } catch (IOException e) {
            System.err.println("En feil opppstod: " + e.getMessage());
        }
        try {
            BufferedReader leser = new BufferedReader(new FileReader("tekst.txt"));
            String linje;
            while((linje = leser.readLine()) != null) {
                System.out.println(linje);
            }
            System.out.println(leser.readLine());
            leser.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            BufferedWriter skriver = new BufferedWriter(new FileWriter("tekst.txt", true));
            for(int i=0;i<10;i++) {
                skriver.write("\nLinje: " + (i+1) + " som blir lagt til etter forrige tekst");
            }
            skriver.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
