package exercice2;

/*====================================================
  ABSTRACT FACTORY
  Déclare une famille de produits liés (Button + Checkbox)
  sans préciser leurs classes concrètes.
====================================================*/
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
