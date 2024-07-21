package hr0;

import java.util.ArrayList;

import hr0.Client;
import hr0.PayCalculator;

public class HrManager {
    private ArrayList<Client> clients = new ArrayList<>();
    private PayCalculator payCalculator = new PayCalculator();

    public void addClient(Client client) {
        clients.add(client);
    }

    public double getTotalPay(String method) {
        double total = 0.0;
        for(Client client: clients) {
            total += payCalculator.getPay(client, method);
        }

        return total;
    }
}