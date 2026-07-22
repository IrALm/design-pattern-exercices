package creation.abstractfactory;

// Produit concret : case à cocher style macOS
class MacCheckbox implements Checkbox {

    private boolean coche = false;

    @Override
    public void render() {
        System.out.println("[MacOS] Rendu d'une checkbox arrondie style Aqua.");
    }

    @Override
    public void toggle() {
        coche = !coche;
        System.out.println("[MacOS] Checkbox " + (coche ? "cochée" : "décochée") + ".");
    }
}
