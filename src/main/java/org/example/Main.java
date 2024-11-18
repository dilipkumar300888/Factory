package org.example;

public class Main {
    public static void main(String[] args) {
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        PizzaStore nyStypePizzaStore = new NYStypePizzaStore();
        Pizza pizza = chicagoStylePizzaStore.orderPizza("cheese");
        System.out.println(" ///////////////////////////////////// ");
        Pizza pizza1 = nyStypePizzaStore.orderPizza("cheese");

    }
}