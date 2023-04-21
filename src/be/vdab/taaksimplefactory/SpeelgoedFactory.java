package be.vdab.taaksimplefactory;

import java.math.BigDecimal;

public class SpeelgoedFactory {
    Speelgoed create(int leeftijd) {
        return switch (leeftijd) {
            case 0, 1, 2, 3, 4, 5 -> new Pop(BigDecimal.valueOf(15.5));
            case 6, 7, 8, 9, 10, 11, 12 -> new Gezelschapsspel(BigDecimal.valueOf(25.5));
            default -> new Boekenbon(BigDecimal.valueOf(35.5));
        };
    }
}
