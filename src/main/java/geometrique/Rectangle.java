package geometrique;

public class Rectangle implements ObjetGeometrique {

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        // 2 * l + 2 * b
        return 2 * (longueur + largeur);
    }

    @Override
    public double surface() {
        // l * b
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return String.format("Type: Rectangle; perimeter: %.1f, area: %.1f", perimetre(), surface());
    }

}
