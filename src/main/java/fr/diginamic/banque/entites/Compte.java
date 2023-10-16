package fr.diginamic.banque.entites;

public class Compte {
    private long accountNumber;
    private double balance;

    public Compte(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Compte setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public String toString() {
        return "AccountNumber=" + accountNumber +
                ", Balance=" + balance;
    }
}
