package ecom2;

import ecom2.AbstractProduct;
import ecom2.Dimension;

public class NonDigitalProduct extends AbstractProduct {
    public static final int SHIPING_RATE = 5;
    public static final double DIMENSTION_CHARGE = 1.5;

    private final int weight;
    private final Dimension dimension;

    public NonDigitalProduct(String name, int price, int discount, int weight, Dimension dimension) {
        super(name, price, discount);
        this.weight = weight;
        this.dimension = dimension;
    }

    @Override
    public int calculatePrice() {
        double price = this.getPrice() * ((100 - getDiscont()) / 100.0);
        price += weight * SHIPING_RATE;
        if(dimension.getVolume() > 10) {
            price += dimension.getVolume() * DIMENSTION_CHARGE;
        }
        return (int) price;
    }
}