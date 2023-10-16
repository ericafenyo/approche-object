package fr.diginamic.banque.entites;

public class Cercle {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double perimetre() {
        // 2 pi r
        return 2 * Math.PI * rayon;
    }

    public double surface() {
        // pi r squared
        return Math.PI * rayon * rayon;
    }

    public String toString() {
        return String.format("Type: Circle; perimeter: %.1f, area: %.1f", perimetre(), surface());
    }
}
