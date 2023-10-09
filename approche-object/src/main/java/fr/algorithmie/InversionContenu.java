package fr.algorithmie;

import fr.utils.ArraysUtils;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
        int[] inverse = ArraysUtils.inverse(array);
        int[] arrayCopy = Arrays.copyOf(inverse, inverse.length);

        // Afficher l’ensemble des éléments des 2 tableaux
        ArraysUtils.println("The original given array");
        ArraysUtils.println(array);

        ArraysUtils.println("The inverse copy of the given array");
        ArraysUtils.println(arrayCopy);
    }
}
