package exercice2;

// Produit concret : case à cocher style Windows
class WindowsCheckbox implements Checkbox {

    private boolean coche = false;

    @Override
    public void render() {
        System.out.println("[Windows] Rendu d'une checkbox carrée style Fluent Design.");
    }

    @Override
    public void toggle() {
        coche = !coche;
        System.out.println("[Windows] Checkbox " + (coche ? "cochée" : "décochée") + ".");
    }
}
