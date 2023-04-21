package be.vdab.taaksimplefactory;

import java.math.BigDecimal;

public class Boekenbon extends Speelgoed {
    Boekenbon(BigDecimal prijs) {
        super(prijs);
    }
    @Override
    void print() {
        System.out.println("Ouder dan 12, jij krijgt een boekenbon");
    }
}
