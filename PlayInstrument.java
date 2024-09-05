import java.util.Scanner;

/**
 * PlayInstrument
 */
public class PlayInstrument {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.setType("Guitar");
        a.setPrice(101.5);
        a.print();
        b.print();
        c.print();

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("INSTRUMENT TERMAHAL ADALAH: " + a.getType());
        } else if (b.getPrice() > b.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("INSTURMENT TERMAHAL ADALAH: " + b.getType());
        } else {
            System.out.println("INTRUMENT TERMAHAL ADALAH: " + b.getType());
        }

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("INSTRUMENT TERMURAH ADALAH: " + a.getType());
        } else if (b.getPrice() < b.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("INSTURMEN TERMURAH ADALAH: " + b.getType());
        } else {
            System.out.println("INTRUMENT TERMURAH ADALAH: " + c.getType());
        }

    }

}