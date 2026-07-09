package exercice2;

// Produit concret : bouton style Windows
class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("[Windows] Rendu d'un bouton style Fluent Design (rectangulaire).");
    }

    @Override
    public void onClick() {
        System.out.println("[Windows] Clic -> animation ripple Windows.");
    }
}
