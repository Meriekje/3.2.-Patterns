# 3.2.-Patterns
This project demonstrates the use of the *Builder Design Pattern* in Java through a simple pizza order management system. It allows for the construction of various types of pizzas with customizable configurations such as size, dough type, and toppings.

## Technologies Used
- Java
- Gradle (Java Application Plugin)

## Design Pattern: Builder
The *Builder Pattern* is used to construct complex objects step by step. It is especially useful when an object needs to be created with many optional components or configurations.

## Structure
- `Pizza`: The product class representing a pizza.
- `PizzaBuilder` (interface): Defines the builder methods for setting pizza properties.
- `HawaiianPizzaBuilder`, `VegetarianPizzaBuilder`, etc.: Concrete builder classes implementing `PizzaBuilder`.
- `PizzaMaster`: The "Director" class that uses a builder to construct pizzas.
- `Main`: Contains the `main` method that demonstrates the use of the builder pattern.

##  Learning Goals
- Understand and implement the Builder design pattern in Java.
- Learn how to separate the construction of a complex object from its representation.
