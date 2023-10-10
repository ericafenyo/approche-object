package fr.diginamic.formes;


public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerPerimetre() {
        // 2 pi r
        return 2 * Math.PI * rayon;
    }

    @Override
    public double calculerSurface() {
        // pi r squared
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return String.format("Type: Circle; perimeter: %.1f, area: %.1f", calculerPerimetre(), calculerSurface());
    }
}
