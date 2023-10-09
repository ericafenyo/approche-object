package fr.diginamic.banque.entites;

public class Credit extends Operation {

    public Credit(String date, double amount) {
        super(date, amount);
    }

    @Override
    String getType() {
        return "CREDIT";
    }

    @Override
    public String toString() {
        return String.format("Operation type: %s, Date: %s, Amount: -£%.2f", getType(), date, amount);
    }
}
