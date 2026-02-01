package model.service;
import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double totalSumWithoutDiscounts() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double totalSumWithDiscounts() {
        double total = 0;
        for (Food item : items) {
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).getDiscount();
                total += item.getAmount() * item.getPrice() * (100 - discount) / 100;
            } else {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }

    public double vegetarianProductsTotal() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}