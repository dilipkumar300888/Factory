package org.example;

public class NYStypePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
