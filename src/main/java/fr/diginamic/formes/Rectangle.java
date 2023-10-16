package fr.diginamic.formes;


public class Rectangle extends Forme {

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerPerimetre() {
        // 2 * l + 2 * b
        return 2 * (longueur + largeur);
    }

    @Override
    public double calculerSurface() {
        // l * b
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return String.format("Type: Rectangle; perimeter: %.1f, area: %.1f", calculerPerimetre(), calculerSurface());
    }
}
