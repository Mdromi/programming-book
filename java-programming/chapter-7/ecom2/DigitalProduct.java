package ecom2;

import ecom2.AbstractProduct;

public class DigitalProduct extends AbstractProduct {
    private static final String JAVA_25 = "JAVA25";
    private static final String JAVA_2NDED = "JAVA2NDED";

    private String coupon;

    public DigitalProduct(String name, int price, int discount, String coupon) {
        this(name, price, discount);
        this.coupon = coupon;
    }

    public DigitalProduct(String name, int price, int discount) {
        super(name, price, discount);
    }

    @Override
    public int calculatePrice() {
        int couponDiscount = switch (coupon != null ? coupon : "") {
            case JAVA_25 -> 3;
            case JAVA_2NDED -> 5;
            default -> 0;
        };
        int totalDiscount = getDiscont() + couponDiscount;
        double price = getPrice() * ((100 - totalDiscount) / 100.0);

        return (int) price;
    }
}