package model;

import model.constants.Colour;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        setAmount(amount);
        setPrice(price);
        isVegetarian = true;
        this.colour = colour.toString();
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return 60;
        }
        return 0;
    }
}