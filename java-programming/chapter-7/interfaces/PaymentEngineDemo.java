package interfaces;

public class PaymentEngineDemo {
    public static void main(String[] args) {
        PaymentEngine paymentEngine = new PaymentEngine();

        BkashPayment bkashPayment = new BkashPayment(100);
        paymentEngine.accept(bkashPayment);

        CashPayment cashPayment = new CashPayment(150);
        paymentEngine.accept(cashPayment);
    }
}

public interface Payment {
    double getAmmount();
}

public class PaymentEngine {
    public void accept(Payment payment) {
        System.out.println("Accepting payment: " + payment.getAmmount());
    }
}

public class BkashPayment implements Payment {
    private final double ammount;

    public BkashPayment(double ammount) {
        this.ammount = ammount;
    }

    @Override
    public double getAmmount() {
        System.out.println("Talking Bkash payment");
        return ammount;
    }
}

public class CashPayment implements Payment {
    private final double ammount;

    public CashPayment(double ammount) {
        this.ammount = ammount;
    }

    @Override
    public double getAmmount() {
        System.out.println("Talking Cash payment");
        return ammount;
    }
}