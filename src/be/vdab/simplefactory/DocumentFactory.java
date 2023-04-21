package be.vdab.simplefactory;

public class DocumentFactory {
    Document open(String bestandsnaam) {
        var extensie = bestandsnaam.substring(bestandsnaam.length() - 4);
        return switch (extensie) {
            case "docx" -> new Tekst(bestandsnaam);
            case "xlsx" -> new Rekenblad(bestandsnaam);
            case "pptx" -> new Presentatie(bestandsnaam);
            default -> throw new IllegalArgumentException();
        };
    }
}
