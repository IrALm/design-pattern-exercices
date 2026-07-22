package exercice4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReportDocument modeleFinancier = new ReportDocument(
                "Rapport Financier",
                "ACME Corp - Confidentiel",
                List.of("Introduction", "Statistiques", "Conclusion")
        );

        DocumentRegistry registry = new DocumentRegistry();
        registry.addDocument("financier", modeleFinancier);

        ReportDocument documentAlice = (ReportDocument) registry.getDocument("financier");
        ReportDocument documentBob = (ReportDocument) registry.getDocument("financier");

        documentAlice.addSection("Analyse Q3");

        System.out.println("Alice   : " + documentAlice);
        System.out.println("Bob     : " + documentBob);
        System.out.println("Modèle  : " + modeleFinancier);
    }
}
