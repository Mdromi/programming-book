package ecom2;

import java.util.UUID;

import ecom2.CreditCard;

public class Customer {
    private final String name;
    private CreditCard creditCard;

    public Customer(String name, long number, int cvv, String validThrough) {
        this.name = name;
        this.creditCard = new CreditCard(number, cvv, validThrough);
    }

    public Customer(String name, CreditCard creditCard) {
        this.name = name;
        this.creditCard = creditCard;
    }

    public Order checkout(ShoppingCart cart) {
        Transaction transaction = makePayment(cart);
        return new Order(this, cart, transaction);
    }

    private Transaction makePayment(ShoppingCart cart) {
        // making payment with credit card
        // for simplicity, ignoring the credit application here
        return new Transaction(UUID.randomUUID(), cart.getTotalPrice());
    }
}