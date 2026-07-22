package creation.abstractfactory;

/*====================================================
  CLIENT
  Ne dépend que des abstractions GUIFactory, Button et
  Checkbox. Il ne connaît jamais WindowsButton, MacButton,
  WindowsCheckbox ou MacCheckbox : le découplage est total.
  La fabrique reçue garantit que tous les éléments créés
  appartiennent à la même famille (même OS).
====================================================*/
class Application {

    private final Button button;
    private final Checkbox checkbox;

    Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    void creerUI() {
        button.render();
        checkbox.render();
    }

    void simulerInteraction() {
        button.onClick();
        checkbox.toggle();
    }
}
