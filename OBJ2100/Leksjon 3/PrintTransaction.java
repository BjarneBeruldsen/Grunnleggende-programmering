import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class PrintTransaction {
    public static void main(String[] args) {
        try {
            Scanner leser = new Scanner(new File("transaction.txt"));

            int antTransaksjoner = 0;
            int antSuksess = 0;
            double sumSuksess = 0;
            double størstTransaksjon = 0;
            ArrayList<String> datoer = new ArrayList<>();

            while(leser.hasNextLine()) {
                String linje = leser.nextLine();
                antTransaksjoner++;
                String[] data = linje.split(";");

                if(data.length == 4 ) {
                    String datoTid = data[0];
                    String id = data[1];
                    double beløp = Double.parseDouble(data[2]);
                    String status = data[3];

                    String[] datotidtab = datoTid.split(" ");
                    datoer.add(datotidtab[0]);

                    if(status.trim().equals("SUCCESS")) {
                        antSuksess++;
                        sumSuksess += beløp;
                    }

                    if(beløp > størstTransaksjon) {
                        størstTransaksjon = beløp;
                    }

                    System.out.printf("Tid: %s, Transaksjons-ID:%s, Beløp:%s, Status:%s%n", datoTid, id, beløp, status);
                }
                else {
                    System.err.println("Ugyldig format: " + linje);
                }
            }


            System.out.println("Antall transaksjoner totalt: " + antTransaksjoner); //task1
            System.out.println("Antall suksessfulle transaksjoner: " + antSuksess); //task2
            System.out.printf("Totalsum for suksessfulle transaksjoner: %.2f%n", sumSuksess); //task3
            System.out.printf("Største transaksjon: %.2f%n", størstTransaksjon); //task4

            //Task6:
            //teller opp antall transaksjoner per dag
            String gjeldendeDag = datoer.get(0);
            int antGjeldendeDag = 0;
            for(String dag: datoer) {
                if(dag.equals(gjeldendeDag)) {
                    antGjeldendeDag++;
                }
                else {
                    System.out.println("Ant. Transaksjoner for: " + gjeldendeDag + " : " + antGjeldendeDag);
                    gjeldendeDag = dag;
                    antGjeldendeDag = 1;
                }
            }
            //skriver ut siste dag
            System.out.println("Ant. Transaksjoner for: " + gjeldendeDag + " : " + antGjeldendeDag);
        }
        catch (FileNotFoundException e) {
            System.err.println("Filen ble ikke funnet: " + e.getMessage());
        }
        catch (NumberFormatException nfe) {
            System.err.println("Feil med parsing fra string til double: " + nfe.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException aibe) {
            System.err.println("Feil med splitting av linjen: " + aibe.getMessage());
        }
    }
}