package comportement.templatemethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Import CSV ===");
        DataMiner csvMiner = new CsvDataMiner();
        csvMiner.mine("donnees.csv");

        System.out.println();
        System.out.println("=== Import PDF ===");
        DataMiner pdfMiner = new PdfDataMiner();
        pdfMiner.mine("rapport.pdf");
    }
}
