package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    List<String> toppings = new ArrayList<>();
    String dough;
    String sauce;
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Dough: " + dough);
        System.out.println("Sauce: " + sauce);
        for(String topping : toppings)
            System.out.println("Topping: " + topping);
    }
    public void bake() {
        System.out.println("Baking " + name);
    }
    public void cut() {
        System.out.println("Cutting " + name);
    }
    public void box() {
        System.out.println("Boxing " + name);
    }
    public String getName() {
        return name;
    }
}
