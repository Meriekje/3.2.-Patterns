public class Main {
    public static void main(String[] args) {

        PizzaBuilder hawaiianBuilder = new Hawaiian()
                .setSize("Family")
                .setDough("Thin")
                .addTopping("Ham")
                .addTopping("Pineapple");

        Pizzaiolo pizzaiolo1 = new Pizzaiolo (hawaiianBuilder);
        Pizza pizzaHawaiana = pizzaiolo1.makePizza();
        System.out.println(pizzaHawaiana);

        PizzaBuilder veggieBuilder = new Vegetarian()
                .setSize("Medium")
                .setDough("Whole grain")
                .addTopping("Aubergine")
                .addTopping("Pepper")
                .addTopping("Onion");

        Pizzaiolo pizzaiolo2 = new Pizzaiolo(veggieBuilder);
        Pizza pizzaVeggie = pizzaiolo2.makePizza();
        System.out.println(pizzaVeggie);
    }

}
