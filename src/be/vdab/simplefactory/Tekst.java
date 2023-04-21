package be.vdab.simplefactory;

public class Tekst extends Document {
    Tekst(String bestandsnaam) {
        super(bestandsnaam);
    }
    @Override
    void print() {
        System.out.println("Een afdruk van een tekst");
    }
    @Override
    void printPreview() {
        System.out.println("Een afdrukvoorbeeld van een tekst");
    }
}
