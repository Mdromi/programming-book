package ecom2;

public abstract class AbstractProduct {
    private final String name;
    private final int price;
    private final int discount;

    public AbstractProduct(String name, int price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public abstract int calculatePrice();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscont() {
        return discount;
    }
}