package fr.diginamic.banque.entites;

public class Compte {
    private long accountNumber;
    private String balance;

    public Compte(long accountNumber, String balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "accountNumber=" + accountNumber +
                ", balance='" + balance + '\'' +
                '}';
    }
}
