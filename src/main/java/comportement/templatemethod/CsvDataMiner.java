package comportement.templatemethod;

public class CsvDataMiner extends DataMiner {

    @Override
    protected void extractData() {
        System.out.println("Extraction CSV : lecture des lignes séparées par des virgules.");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV : conversion des lignes en tableau de valeurs.");
    }
}
