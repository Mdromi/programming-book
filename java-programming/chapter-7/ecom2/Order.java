package ecom2;

public class Order {
    private final Customer customer;
    private final ShoppingCart shoppingCart;
    private final Transaction transaction;

    public Order(Customer customer, ShoppingCart shoppingCart, Transaction transaction) {
        this.customer = customer;
        this.shoppingCart = shoppingCart;
        this.transaction = transaction;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    @Override
    public String toString() {
        return "Order{" + "\n customer=" + customer + ", \n cart=" + shoppingCart + ", \n payment=" + transaction + "\n}";
    }
}