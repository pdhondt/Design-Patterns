package be.vdab.simplefactory;

public class Rekenblad extends Document {
    Rekenblad(String bestandsnaam) {
        super(bestandsnaam);
    }
    @Override
    void print() {
        System.out.println("Een afdruk van een rekenblad");
    }
    @Override
    void printPreview() {
        System.out.println("Een afdrukvoorbeeld van een rekenblad");
    }
}
