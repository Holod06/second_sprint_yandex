package model;

public class Meat extends Food implements Discountable {
    public Meat(int amount, double price) {
        setAmount(amount);
        setPrice(price);
        isVegetarian = false;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}