import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        Pizza vegetarianPizza = Pizzaiolo.makeVegetarianPizza();
        logger.info("Vegetarian Pizza: " + vegetarianPizza);

        Pizza hawaiianPizza = Pizzaiolo.makeHawaiianPizza();
        logger.info("Hawaiian Pizza: " + hawaiianPizza);

        Pizza customPizza = Pizzaiolo.makeCustomPizza();
        logger.info("Custom Pizza: " + customPizza);
    }
}
