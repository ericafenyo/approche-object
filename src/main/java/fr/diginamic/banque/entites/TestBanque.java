package fr.diginamic.banque.entites;

import java.util.Arrays;
import java.util.List;

public class TestBanque {
    public static void main(String[] args) {
        Compte parentAccount = new Compte(3735657893L, 8368 );
        CompteTaux childAccount = new CompteTaux(1837456354, 973, 15.25);

        Compte[] accounts = {parentAccount, childAccount};

        for (Compte account : accounts) {
            System.out.println(account);
        }
    }
}
