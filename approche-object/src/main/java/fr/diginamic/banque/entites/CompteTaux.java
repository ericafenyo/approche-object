package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    private double interestRate;

    public CompteTaux(long accountNumber, String balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString()
                +
                ", Interest rate=" + interestRate;
    }
}
