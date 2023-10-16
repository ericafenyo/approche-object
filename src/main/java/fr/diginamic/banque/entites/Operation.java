package fr.diginamic.banque.entites;

import java.time.LocalDate;

public abstract class Operation {
    String date;
    double amount;

    public Operation(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    abstract String getType();

    @Override
    public String toString() {
        return String.format("Operation type: %s, Date: %s, Amount: -£%.2f", getType(), date, amount);
    }
}
