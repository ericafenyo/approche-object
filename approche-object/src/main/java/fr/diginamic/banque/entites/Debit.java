package fr.diginamic.banque.entites;

public class Debit extends Operation {

    public Debit(String date, double amount) {
        super(date, amount);
    }

    @Override
    String getType() {
        return "DEBIT";
    }

    @Override
    public String toString() {
        return String.format("Operation type: %s, Date: %s, Amount: +£%.2f", getType(), date, amount);
    }
}
