package fr.diginamic.maison;

import fr.utils.ArraysUtils;

import java.lang.reflect.Type;
import java.util.Arrays;

public class Maison {
    private Piece[] array = new Piece[0];

    /**
     * permet d’ajouter une pièce à la maison.
     *
     * @param piece la pièce à ajouter.
     */
    public void ajouterPiece(Piece piece) {
        if (piece.getStorey() < 1) {
            System.out.println("Storey cannot be negative");
            return;
        }
        int size = array.length + 1;
        Piece[] accumulator = Arrays.copyOf(array, size);
        accumulator[size - 1] = piece;
        array = accumulator;
    }

    public double getSurface() {
        double sum = 0.0;
        for (Piece piece : array) {
            double surface = piece.getSurface();
            sum += surface;
        }
        return sum;
    }

    public double getSurfaceByStories(int storey) {
        double sum = 0.0;
        for (Piece piece : array) {
            if (piece.getStorey() == storey) {
                double surface = piece.getSurface();
                sum += surface;
            }
        }
        return sum;
    }

    public double getSurfaceByType(Class<? extends Piece> type) {
        double sum = 0.0;
        for (Piece piece : array) {
            if (piece.getClass().getSimpleName().equals(type.getSimpleName())) {
                double surface = piece.getSurface();
                sum += surface;
            }
        }
        return sum;
    }


    public int getTypeCount(Class<? extends Piece> type) {
        int count = 0;
        for (Piece piece : array) {
            if (piece.getClass().getSimpleName().equals(type.getSimpleName())) {
                count++;
            }
        }
        return count;
    }
}
