package be.vdab.simplefactory;

public class Presentatie extends Document {
    Presentatie(String bestandsnaam) {
        super(bestandsnaam);
    }
    @Override
    void print() {
        System.out.println("Een afdruk van een presentatie");
    }
    @Override
    void printPreview() {
        System.out.println("Een afdrukvoorbeeld van een presentatie");
    }
}
