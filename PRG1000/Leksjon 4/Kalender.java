/* Demonstrasjon av topp-ned-programmering.
 * Programmet skriver ut en kalender for et
 * innlest årstall som 12 månedskalendere.
 */
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kalender {

  public static void main(String[] args) {
    int år = parseInt(showInputDialog("Årstall:"));
    årskalender(år);
  }

  private static void årskalender(int år) {
    out.println("År " + år);
    for (int mnr=1; mnr<=12; mnr++) {
      månedskalender(år, mnr);
    }
  }

  private static void månedskalender(int år, int mnr) {
    out.println();
    out.println(månedsnavn(mnr));

    out.print("Uke  ");
    out.print("Man  ");
    out.print("Tir  ");
    out.print("Ons  ");
    out.print("Tor  ");
    out.print("Fre  ");
    out.print("Lør  ");
    out.print("Søn  ");
    out.println();

    int startUke = startUke(år, mnr);
    int sluttUke = sluttUke(år, mnr);

    if (startUke>sluttUke) { // De første dagene i jan
      ukekalender(år-1, 12, startUke);
      startUke = 1;
    }

    for (int ukenr=startUke; ukenr<=sluttUke; ukenr++) {
      ukekalender(år, mnr, ukenr);
    }
  }

  private static void ukekalender(int år, int mnr, int unr) {
    out.println();
    out.print(format(unr) + "   ");
    for (int dnr=1; dnr<=7; dnr++) {
      int dagNr = dagNr(år, mnr, unr, dnr);
      out.print(format(dagNr) + "   ");
    }
    out.println();
  }

  private static int startUke(int år, int mnr) {
    Calendar c = Calendar.getInstance();
    c.set(Calendar.YEAR, år);
    c.set(Calendar.MONTH, mnr-1); // Starter på 0...
    c.set(Calendar.DAY_OF_MONTH, 1);
    c.clear(Calendar.WEEK_OF_YEAR);
    int ukenr = c.get(Calendar.WEEK_OF_YEAR);
    return ukenr;
  }

  private static int sluttUke(int år, int mnr) {
    Calendar c = Calendar.getInstance();
    c.set(Calendar.YEAR, år);
    c.set(Calendar.MONTH, mnr-1);
    c.set(Calendar.DAY_OF_MONTH, antallDager(år, mnr));
    c.clear(Calendar.WEEK_OF_YEAR);
    int ukenr = c.get(Calendar.WEEK_OF_YEAR);
    return ukenr;
  }

  private static int dagNr(int år, int mnr, int unr, int dnr) {
    Calendar c = Calendar.getInstance();
    c.clear(Calendar.DAY_OF_MONTH);
    c.set(Calendar.YEAR, år);
    c.set(Calendar.MONTH, mnr-1);
    c.set(Calendar.WEEK_OF_YEAR, unr);
    c.set(Calendar.DAY_OF_WEEK, dnr+1); // søndag=1
    int dagnr = c.get(Calendar.DAY_OF_MONTH);
    return dagnr;
  }

  private static String månedsnavn(int mnr) {
    switch (mnr) {
      case  1: return "Januar";
      case  2: return "Februar";
      case  3: return "Mars";
      case  4: return "April";
      case  5: return "Mai";
      case  6: return "Juni";
      case  7: return "Juli";
      case  8: return "August";
      case  9: return "September";
      case 10: return "Oktober";
      case 11: return "November";
      case 12: return "Desember";
    }
    return "";
  }

  private static int antallDager(int år, int m) {
    int d = 31; // jan, mar, mai, jul, aug, okt, des
    if ( m == 4 || m == 6 || m == 9 || m == 11 )
      d = 30; // apr, jun, sep, nov
    else if ( m == 2 ) { // feb
      if ( skuddår(år) )
        d = 29;
      else
        d = 28;
    }
    return d;
  }

  private static boolean skuddår(int år) {
    return ( (år%4==0 && år%100!=0) || (år%400 == 0) );
  }

  private static String format(int n) {
    String s = n + "";
    if ( n<10 )
      s = " " + n;
    return s;
  }

  private static void test1() {
    Calendar c = Calendar.getInstance();
    c.set(Calendar.YEAR, 2011);
    c.set(Calendar.MONTH, 0);
    c.set(Calendar.DAY_OF_MONTH, 3);
    c.clear(Calendar.WEEK_OF_YEAR);
    int ukenr = c.get(Calendar.WEEK_OF_YEAR);
    out.println("UKENR: " + ukenr);
  }

  private static void test2() {
    Calendar c = Calendar.getInstance();
    c.clear(Calendar.DAY_OF_MONTH);
    c.set(Calendar.YEAR, 2011);
    c.set(Calendar.MONTH, 0);
    c.set(Calendar.WEEK_OF_YEAR, 1);
    c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

    int dagnr = c.get(Calendar.DAY_OF_MONTH);
    out.println("DAG I UKA: " + dagnr);
  }
}