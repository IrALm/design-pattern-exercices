package exercice2;

// Produit concret : bouton style macOS
class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("[MacOS] Rendu d'un bouton style Aqua (coins arrondis).");
    }

    @Override
    public void onClick() {
        System.out.println("[MacOS] Clic -> effet de surbrillance macOS.");
    }
}
