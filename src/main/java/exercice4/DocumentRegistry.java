package exercice4;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {

    private final Map<String, DocumentPrototype> templates = new HashMap<>();

    public void addDocument(String type, DocumentPrototype template) {
        templates.put(type, template);
    }

    public DocumentPrototype getDocument(String type) {
        DocumentPrototype template = templates.get(type);
        if (template == null) {
            throw new IllegalArgumentException("Aucun template enregistré pour le type : " + type);
        }
        return template.clone();
    }
}
