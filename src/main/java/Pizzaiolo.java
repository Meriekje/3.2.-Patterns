
public class Pizzaiolo {
    private PizzaBuilder builder;

    public Pizzaiolo(PizzaBuilder builder) {
        this.builder = builder;
    }


    public static Pizza makeHawaiianPizza() {
        PizzaBuilder builder = new Hawaiian()
                .setSize("Family")
                .setDough("Thin")
                .addTopping("Mushrooms");
        return builder.build();
    }

    public static Pizza makeVegetarianPizza() {
        PizzaBuilder builder = new Vegetarian()
                .setSize("Medium")
                .setDough("Whole grain")
                .addTopping("Spinach");
        return builder.build();
    }

    public static Pizza makeCustomPizza() {
        PizzaBuilder builder = new Custom()
                .setSize("Large")
                .setDough("Thick")
                .addTopping("Extra cheese");
        return builder.build();
    }
}

