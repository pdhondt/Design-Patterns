package be.vdab.taaksimplefactory;

import java.math.BigDecimal;

public class Gezelschapsspel extends Speelgoed {
    Gezelschapsspel(BigDecimal prijs) {
        super(prijs);
    }
    @Override
    void print() {
        System.out.println("Tussen 6 en 12 jaar oud, jij krijgt een gezelschapsspel");
    }
}
