package ecom;

import ecom.Dimension;

public class Product {

    private static final int SHIPPING_RATE = 5;
    private static final double DIMENSION_CHANGE = 1.5;

    private final String name;
    private final int width;
    private final Dimension dimension;
    private int price;
    private int discount;

    public Product(String name, int price, int discount, int weight, Dimension dimension) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.width = weight;
        this.dimension = dimension;
    }

    public int getPrice() {
        double price =  this.price * ((100 - discount) / 100.0); 
        price += weight * SHIPPING_RATE;

        if(dimension.getVolume() > 10) {
            price += dimension.getVolume() * DIMENSION_CHANGE;
        } 

        return (int) price;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
