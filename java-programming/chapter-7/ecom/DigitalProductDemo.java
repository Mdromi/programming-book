package ecom;
import ecom.DigitalProduct;
import ecom.Dimension;

public class DigitalProductDemo {
    public static void main(String[] args) {
        DigitalProduct ebook = new DigitalProduct("Java Programming", 750, 15, 0, new Dimension(0, 0, 0));
        var price = ebook.getPrice();
        System.out.println("price = " + price);
    }
}