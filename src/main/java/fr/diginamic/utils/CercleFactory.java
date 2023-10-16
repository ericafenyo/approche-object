package fr.diginamic.utils;

import fr.diginamic.banque.entites.Cercle;

public class CercleFactory {
    public static Cercle create(double radius) {
        return new Cercle(radius);
    }
}
