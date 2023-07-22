package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        //Since we know for delluxe pizza extra cheese and topping will be by default
        super.addExtraToppings();
        super.addExtraCheese();
    }
}
