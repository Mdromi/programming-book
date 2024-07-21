package hr1;

import hr1.Client;
import hr1.HrManager;
import hr1.PayCalculator;
import hr1.HourlyPayCalculator;
import hr1.FixedPayCalculator;

// javac -d out hr1/*.java
// java -cp out hr1.Main

public class Main {
    public static void main(String[] args) {
        PayCalculator hourlyCalculator = new HourlyPayCalculator(75);
        HrManager hrManagerHourly = new HrManager(hourlyCalculator);

        PayCalculator fixedCalculator = new FixedPayCalculator(75);
        HrManager hrManagerFixed = new HrManager(fixedCalculator);

        Client client0 = new Client("Romi", 45);
        hrManagerHourly.addClient(client0);
        hrManagerFixed.addClient(client0);

        Client client1 = new Client("SRD", 41);
        hrManagerHourly.addClient(client1);
        hrManagerFixed.addClient(client1);

        double getTotalFixedPay = hrManagerFixed.getTotalPay();
        System.out.println("getTotalFixedPay = " + getTotalFixedPay);

        double hourlyTotalPay = hrManagerHourly.getTotalPay();
        System.out.println("hourlyTotalPay = " + hourlyTotalPay);
    }
}