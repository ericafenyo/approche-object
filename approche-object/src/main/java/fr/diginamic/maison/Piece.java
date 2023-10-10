package fr.diginamic.maison;

public abstract class Piece {
    private double surface;
    private int storey;

    public Piece(double surface, int storey) {
        this.surface = surface;
        this.storey = storey;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getStorey() {
        return storey;
    }

    public void setStorey(int storey) {
        this.storey = storey;
    }
}
