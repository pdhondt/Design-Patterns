package be.vdab.taak1singleton;

public class Main {
    public static void main(String[] args) {
        var versnellingsbak = Versnellingsbak.INSTANCE;
        versnellingsbak.schakelHoger();
        versnellingsbak.schakelHoger();
        versnellingsbak.schakelHoger();
        versnellingsbak.schakelHoger();
        versnellingsbak.schakelHoger();
        versnellingsbak.schakelHoger();
        versnellingsbak.schakelLager();
        versnellingsbak.schakelLager();
        versnellingsbak.schakelLager();
        versnellingsbak.schakelLager();
        versnellingsbak.schakelLager();
        versnellingsbak.schakelLager();
        versnellingsbak.schakelAchteruit();
    }
}
