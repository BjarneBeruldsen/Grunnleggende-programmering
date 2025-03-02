public class Husrekke extends EasyGraphics {

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
    makeWindow("Husrekke");

    tegnHusrekke(5, 20, 200, 60, 40, 10);
  }

  private void tegnHusrekke(int antallHus,
                            int startX, int startY,
                            int bredde, int høyde, int avstand) {
    for (int husNr=1; husNr<=antallHus; husNr++) {
      tegnHus(startX, startY, bredde, høyde);
      startX = startX + bredde + avstand;
    }
  }
}