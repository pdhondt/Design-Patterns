package be.vdab.builder;

public class Main {
    public static void main(String[] args) {
        var builder = new Inwoner.InwonerBuilder();
        var inwoner = builder.metVoornaam("Peter")
                .metFamilienaam("D'hondt")
                .metAantalKinderen(2)
                .maakInwoner();
        System.out.println(inwoner);
    }
}
