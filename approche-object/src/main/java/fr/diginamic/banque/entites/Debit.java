package fr.diginamic.banque.entites;

public class Debit extends Operation {

    public Debit(String date, double amount) {
        super(date, amount);
    }

    @Override
    String getType() {
        return "DEBIT";
    }
}
