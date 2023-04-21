package be.vdab.taaksimplefactory;

public class Main {
    public static void main(String[] args) {
        var factory = new SpeelgoedFactory();
        var speelgoed1 = factory.create(4);
        speelgoed1.print();
        System.out.println("Prijs: " + speelgoed1.getPrijs());
        var speelgoed2 = factory.create(8);
        speelgoed2.print();
        System.out.println("Prijs: " + speelgoed2.getPrijs());
        var speelgoed3 = factory.create(13);
        speelgoed3.print();
        System.out.println("Prijs: " + speelgoed3.getPrijs());
    }
}
