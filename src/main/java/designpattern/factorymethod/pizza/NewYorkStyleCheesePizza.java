package designpattern.factorymethod.pizza;

public class NewYorkStyleCheesePizza extends Pizza {
    public NewYorkStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
