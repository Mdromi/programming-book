package ecom2;

// javac -d out ecom2/*.java
// java -cp out ecom2.Main

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        NonDigitalProduct keyboard = new NonDigitalProduct("Mechanical Gaming Keyboard", 48, 10, 450, new Dimension(1, 10, 2));
        NonDigitalProduct mouse = new NonDigitalProduct("Gaming Mouse", 48, 15, 100, new Dimension(1, 10, 2));
        NonDigitalProduct ecoDot = new NonDigitalProduct("Eco Dot (4th Generation)", 40, 12, 150, new Dimension(1, 1, 1));

        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(ecoDot);

        DigitalProduct javaProgrammingEbook = new DigitalProduct("java programming", 750, 15);
        DigitalProduct advancedJavaProgrammingEbook = new DigitalProduct("Advanced Java Programming", 750, 15, "JAVA25");

        shoppingCart.addProduct(javaProgrammingEbook);
        shoppingCart.addProduct(advancedJavaProgrammingEbook);

        System.out.println("ShoppingCart = " + shoppingCart);
        int totalPrice = shoppingCart.getTotalPrice();
        System.out.println("totalPrice = " + totalPrice);


        Customer customer = new Customer ("Md Romi", new CreditCard(324234242332L, 234, "04/25"));

        Order order = customer.checkout(shoppingCart);

        System.out.println(order);
    }
}