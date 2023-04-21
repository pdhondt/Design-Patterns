package be.vdab.simplefactory;

public class Main {
    public static void main(String[] args) {
        var factory = new DocumentFactory();
        var document1 = factory.open("tekst.docx");
        document1.printPreview();
        document1.print();
        var document2 = factory.open("presentatie.pptx");
        document2.printPreview();
        document2.print();
    }
}
