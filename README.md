# exercice_poo

Dépôt d'exercices Java : POO de base, puis design patterns du GoF.

**Auteur :** Aganze Lwaboshi Moise

## Organisation

Le code source est sous `src/main/java/`, organisé par catégorie :

```
src/main/java/
├── poo/                        # Exercices de POO de base (pas un pattern)
├── creation/<pattern>/         # Patterns créationnels
├── structure/<pattern>/        # Patterns structurels
└── comportement/<pattern>/     # Patterns comportementaux
```

- Chaque `<pattern>` est un nom de pattern GoF en anglais, minuscules,
  sans séparateur (`singleton`, `abstractfactory`, `templatemethod`...).
- Chaque exercice a son propre point d'entrée `<package>.Main`.
- `pom.xml` (`<mainClass>`) pointe vers l'exercice le plus récent —
  changez-le pour lancer un autre exercice via `mvn package`.

## Exercices présents

| Catégorie | Package | Pattern |
|---|---|---|
| POO | `poo` | — (héritage, encapsulation, polymorphisme) |
| Création | `creation.abstractfactory` | Abstract Factory + Factory Method |
| Création | `creation.singleton` | Singleton |
| Création | `creation.prototype` | Prototype |
| Structure | `structure.composite` | Composite |
| Structure | `structure.adapter` | Adapter |
| Structure | `structure.proxy` | Proxy |
| Structure | `structure.bridge` | Bridge |
| Structure | `structure.decorator` | Decorator |
| Comportement | `comportement.strategy` | Strategy |
| Comportement | `comportement.observer` | Observer |
| Comportement | `comportement.templatemethod` | Template Method |
| Comportement | `comportement.mediator` | Mediator |

## Compiler / exécuter un exercice

```bash
mvn package
java -cp target/classes <package>.Main
```
