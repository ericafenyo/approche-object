package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte account = new Compte(3735657893L, "8368 euros");
        System.out.print(account);
    }
}
