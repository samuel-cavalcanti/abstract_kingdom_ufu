# Abstract Kingdom

Exemplo de implementação do abstract factory retirado
de [java design patterns]( https://github.com/iluwatar/java-design-patterns/tree/master/abstract-factory)

## Minhas mudanças

- Adicionado o Wizard Kingdom
- organizado cada reino no seu respetivo diretório

### Wizard Kingdom

```java
// Wizard Factory
public class WizardKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new WizardCastle();
    }

    @Override
    public King createKing() {
        return new WizardKing();
    }

    @Override
    public Army createArmy() {
        return new WizardArmy();
    }
}

```

```java
public class WizardCastle implements Castle {

    static final String DESCRIPTION = "This is the Wizard castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
```

```java
public class WizardKing implements King {

    static final String DESCRIPTION = "This is the Wizard king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

```

```java
public class WizardArmy implements Army {
    static final String DESCRIPTION = "This is the wizard army!";


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
```

por fim atualizado o factory method

```java
  /**
 * The factory method to create KingdomFactory concrete objects.
 */
public static KingdomFactory makeFactory(KingdomType type) {
        return switch (type) {
        case ELF -> new ElfKingdomFactory();
        case ORC -> new OrcKingdomFactory();
        case WIZARD -> new WizardKingdomFactory();
        };
}
```


