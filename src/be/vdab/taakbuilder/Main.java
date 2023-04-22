package be.vdab.taakbuilder;

public class Main {
    public static void main(String[] args) {
        var builder = new Coordinaat.CoordinaatBuilder();
        var coordinaat = builder.metX(5)
                .metY(6)
                .metZ(7)
                .maakCoordinaat();
        System.out.println(coordinaat);
    }
}
