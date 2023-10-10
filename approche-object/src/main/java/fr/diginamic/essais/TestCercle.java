package fr.diginamic.essais;

import fr.diginamic.banque.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        Cercle circle1 = new Cercle(10.0);
        Cercle circle2 = CercleFactory.create(17.0);

        System.out.println(circle1);
        System.out.println(circle2);
    }
}
