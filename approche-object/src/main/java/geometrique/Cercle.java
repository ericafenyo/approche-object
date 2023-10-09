package geometrique;

public class Cercle implements ObjetGeometrique{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        // 2 pi r
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        // pi r sqared
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return String.format("Type: Circle; perimeter: %.1f, area: %.1f", perimetre(), surface());
    }
}
