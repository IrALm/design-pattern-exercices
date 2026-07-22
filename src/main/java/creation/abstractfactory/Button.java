package creation.abstractfactory;

/*====================================================
  PRODUIT ABSTRAIT : Button
  Le client ne manipule que cette interface, jamais
  WindowsButton ou MacButton directement.
====================================================*/
interface Button {
    void render();
    void onClick();
}
