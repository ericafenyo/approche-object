package fr.diginamic.banque.entites;

public class Credit extends Operation {

    public Credit(String date, double amount) {
        super(date, amount);
    }

    @Override
    String getType() {
        return "CREDIT";
    }
}
