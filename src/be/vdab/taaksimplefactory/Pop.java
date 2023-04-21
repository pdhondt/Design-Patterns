package be.vdab.taaksimplefactory;

import java.math.BigDecimal;

public class Pop extends Speelgoed {
    Pop(BigDecimal prijs) {
        super(prijs);
    }
    @Override
    void print() {
        System.out.println("Jonger dan 6, jij krijgt een pop");
    }
}
