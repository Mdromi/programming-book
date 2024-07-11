package bank;

import bamk.CheckingAccount;

public class SavingsAccount extends CheckingAccount {
    private static final int MAX_WITHDRAWAL = 5;

    private final double interestRate;
    private int withdrawalCount;

    public SavingsAccount(int initialBalance, String accountNumber, double interestRate) {
        super(initialBalance, accountNumber);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void withdraw(int amount) {
        if (withdrawalCount == MAX_WITHDRAWAL) {
            System.out.println("Withdrawal limit exceed");
        } else {
            super.withdraw(amount);
            withdrawalCount++;
        }
    }
}