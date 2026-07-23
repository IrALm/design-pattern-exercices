package comportement.templatemethod;

public class PdfDataMiner extends DataMiner {

    @Override
    protected void extractData() {
        System.out.println("Extraction PDF : lecture du flux binaire/texte.");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing PDF : analyse des blocs de texte.");
    }
}
