package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {
    public static void main(String[] args) {
        Forme circle = new Cercle(4);
        Forme rectangle = new Rectangle(10, 5);
        Forme square = new Carre(10);

        Forme[] geometries = {circle, rectangle, square};

        for (Forme geometry : geometries) {
            AffichageForme.afficher(geometry);
        }
    }
}
