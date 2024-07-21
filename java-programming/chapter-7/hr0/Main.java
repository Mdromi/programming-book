package hr0;

import hr0.Client;
import hr0.HrManager;

// javac -d out hr0/*.java
// java -cp out hr0.Main

public class Main {
    public static void main(String[] args) {
        HrManager hrManager = new HrManager();

        Client client0 = new Client("Romi", 45);
        hrManager.addClient(client0);

        Client client1 = new Client("SRD", 41);
        hrManager.addClient(client1);

        double getTotalFixedPay = hrManager.getTotalPay("FIXED");
        System.out.println("getTotalFixedPay = " + getTotalFixedPay);

        double hourlyTotalPay = hrManager.getTotalPay("HOURLY");
        System.out.println("hourlyTotalPay = " + hourlyTotalPay);
    }
}