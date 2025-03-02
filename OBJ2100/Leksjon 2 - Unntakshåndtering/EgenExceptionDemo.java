public class EgenExceptionDemo {
    public static void main(String[] args) {
        try {
            TrekantEgenException trekant1 = new TrekantEgenException(100, 100, 100);
            TrekantEgenException trekant2 = new TrekantEgenException(100, 99, 200);
        }
        catch (UgyligTrekantException e) {
            System.out.println("Fanget unntak: " + e.getMessage());
        }
    }
}

//trekant med egen exception
class TrekantEgenException {
    private int side1, side2, side3;

    //konstruktør
    public TrekantEgenException(int side1, int side2, int side3) throws UgyligTrekantException {
        setSider(side1, side2, side3);
    }

    public void setSider(int side1, int side2, int side3) {
        if(side1 + side2 < side3) {
            throw new UgyligTrekantException(side1, side2, side3);
        }
        else if(side2 + side3 < side1) {
            throw new UgyligTrekantException(side1, side2, side3);
        }
        else if(side1 + side3 < side2) {
            throw new UgyligTrekantException(side1, side2, side3);
        }
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }
}



class UgyligTrekantException extends RuntimeException {
    private int side1, side2, side3;
    public UgyligTrekantException(int side1, int side2, int side3) {
        super("Ugyldig side lengder: " + side1 + " " + side2 + " " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}