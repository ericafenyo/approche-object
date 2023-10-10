package fr.diginamic.formes;


public class Carre extends Rectangle {

    public Carre(double longueur) {
        super(longueur, longueur);
    }


    @Override
    public String toString() {
        return String.format("Type: Square; perimeter: %.1f, area: %.1f", calculerPerimetre(), calculerSurface());
    }
}
