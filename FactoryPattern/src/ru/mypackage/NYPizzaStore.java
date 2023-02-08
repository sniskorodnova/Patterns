package ru.mypackage;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStylePizzaCheese();
        } else {
            return null;
        }
    }
}
