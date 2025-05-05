public class Pizzaiolo {
    private PizzaBuilder builder;

    public Pizzaiolo(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makePizza() {
        return builder.build();
    }
}

