package be.vdab.taak2singleton;

import java.util.List;
import java.util.Random;

public enum Magic8Ball {
    INSTANCE;
    private String answer = "Dit is geen antwoord";
    private final List<String> answers = List.of("Zoals ik het zie, ja",
            "Het is zeker",
            "Hoogst waarschijnlijk",
            "Ziet er goed uit",
            "Zonder twijfel",
            "Ja", "Zeker",
            "Je mag er op rekenen",
            "Vraag dit later nog eens",
            "Dat wil je niet weten",
            "Ik kan dit nu niet voorspellen",
            "Concentreer je en stel je vraag opnieuw",
            "Je moet er niet op rekenen",
            "Nee", "Ziet er niet goed uit",
            "Twijfelachtig");
    public String generateAnswer() {
        var random = new Random();
        var newAnswer = answers.get(random.nextInt(answers.size()));
        while (answer.equals(newAnswer)) {
            newAnswer = answers.get(random.nextInt(answers.size()));
        }
        this.answer = newAnswer;
        return newAnswer;
    }
}
