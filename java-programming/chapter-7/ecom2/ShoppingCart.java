package ecom2;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<AbstractProduct> products = new ArrayList<>();

    public void addProduct(AbstractProduct product) {
        products.add(product);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (AbstractProduct product : products) {
            totalPrice += product.calculatePrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "products=" + products + '}';
    }
}
