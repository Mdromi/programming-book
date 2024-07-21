package hr1;
import hr1.Client;
import hr1.PayCalculator;

public class FixedPayCalculator extends PayCalculator {
    private double fixedPay;

    public FixedPayCalculator(double fixedPay) {
        this.fixedPay = fixedPay;

    }

    @Override
    public double getPay(Client client) {
        return fixedPay;
    }
}