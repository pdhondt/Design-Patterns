package be.vdab.taak1singleton;

public enum Versnellingsbak {
    INSTANCE;
    private int versnelling;
    void schakelHoger() {
        System.out.println("Huidige versnelling: " + versnelling);
        if (versnelling < 5) {
            versnelling++;
            System.out.println("Omhoog geschakeld naar versnelling: " + versnelling);
        } else {
            System.out.println("Vijfde versnelling is de hoogste!");
        }

    }
    void schakelLager() {
        System.out.println("Huidige versnelling: " + versnelling);
        if (versnelling > 0) {
            versnelling--;
            System.out.println("Omlaag geschakeld naar versnelling: " + versnelling);
        } else {
            System.out.println("Lager dan neutraal gaat niet!");
        }

    }
    void schakelAchteruit() {
        if (versnelling == 0) {
            System.out.println("Achteruit geschakeld ");
        } else {
            System.out.println("Vanuit versnelling " + versnelling + " kan niet achteruit geschakeld worden!");
        }
    }
}
