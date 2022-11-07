package com.futurecollars.lesson11.task2;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Pizza> pizzas = Arrays.asList(
        new Pizza("Serowa", true, Arrays.asList(Ingredients.MOZZARELLA), 793),
        new Pizza("Polska", true, Arrays.asList(Ingredients.ONION), 701),
        new Pizza("Salami", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.SALAMI), 1984),
        new Pizza("Pesto", true, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.MUSHROOMS), 1989),
        new Pizza("Wiejska", true, Arrays.asList(Ingredients.ONION, Ingredients.CELERY), 2012),
        new Pizza("Capriciossa", true, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.TOMATO, Ingredients.MUSHROOMS), 1893),
        new Pizza("Frutti di Mare", false, Arrays.asList(Ingredients.SALAMI, Ingredients.MUSHROOMS), 1410),
        new Pizza("Vegetariana", true, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.TOMATO, Ingredients.MUSHROOMS, Ingredients.ONION, Ingredients.CELERY), 1250),
        new Pizza("Kebab", false, Arrays.asList(Ingredients.ONION, Ingredients.PEPPER, Ingredients.SALAMI), 1492),
        new Pizza("Bogactwo", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.SALAMI, Ingredients.PEPPER, Ingredients.CELERY, Ingredients.ONION, Ingredients.MUSHROOMS, Ingredients.TOMATO), 5550)
    );

    PizzaFilter pizzaChecker = new PizzaFilter(pizzas);

    System.out.println("Vegetarian Pizzas: ");
    pizzaChecker.printVegetarianPizzas();

    System.out.println("\n" + "Pizzas with allergens: ");
    pizzaChecker.printPizzasWithAllergens();

    System.out.println("\n" + "Is there at least one vegetarian pizza containing tomato and pepper?");
    System.out.println(pizzaChecker.isAnyVegPizzaWithTomatoAndPepper());

    System.out.println("\n" + "Do all pizzas contain mozzarella?");
    System.out.println(pizzaChecker.isAllPizzasContainMozzarella());

    System.out.println("\n" + "The most caloric pizza is: ");
    System.out.println(pizzaChecker.findHighestCaloriePizza());

    System.out.println("\n" + "The least caloric pizza is: ");
    System.out.println(pizzaChecker.findLowestCaloriePizza());
  }
}

