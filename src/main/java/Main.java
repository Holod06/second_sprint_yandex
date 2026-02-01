import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, Colour.RED);
        Food greenApples = new Apple(8, 60, Colour.GREEN);
        // Создание массива продуктов
        Food[] products = {meat, redApples, greenApples};
        // Создание корзины
        ShoppingCart cart = new ShoppingCart(products);
        // Вывод результатов
        System.out.println("Общая сумма товаров без скидки: " + cart.totalSumWithoutDiscounts());
        System.out.println("Общая сумма товаров со скидкой: " + cart.totalSumWithDiscounts());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.vegetarianProductsTotal());
    }
}