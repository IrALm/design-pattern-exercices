package creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class ReportDocument implements DocumentPrototype {

    private final String title;
    private final String header;
    private final List<String> sections;

    public ReportDocument(String title, String header, List<String> sections) {
        System.out.println("Chargement du template '" + title + "' (styles, mise en page, en-tête)...");
        this.title = title;
        this.header = header;
        this.sections = new ArrayList<>(sections);
    }

    private ReportDocument(ReportDocument source) {
        this.title = source.title;
        this.header = source.header;
        this.sections = new ArrayList<>(source.sections);
    }

    @Override
    public ReportDocument clone() {
        return new ReportDocument(this);
    }

    public void addSection(String section) {
        sections.add(section);
    }

    @Override
    public String toString() {
        return title + " | " + header + " | sections=" + sections;
    }
}
