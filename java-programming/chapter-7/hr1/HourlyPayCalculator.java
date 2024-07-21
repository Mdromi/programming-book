package hr1;

import hr1.PayCalculator;
import hr1.Client;

public class HourlyPayCalculator extends PayCalculator {
    private final double hourlyRate;

    public HourlyPayCalculator(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPay(Client client) {
        return hourlyRate * client.getHoursWorked();
    }
}