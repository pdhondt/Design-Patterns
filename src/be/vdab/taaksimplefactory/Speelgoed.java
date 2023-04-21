package be.vdab.taaksimplefactory;

import java.math.BigDecimal;

public abstract class Speelgoed {
    private final BigDecimal prijs;

    protected Speelgoed(BigDecimal prijs) {
        this.prijs = prijs;
    }
    abstract void print();

    public BigDecimal getPrijs() {
        return prijs;
    }
}
