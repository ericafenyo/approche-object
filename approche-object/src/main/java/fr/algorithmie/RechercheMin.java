package fr.algorithmie;

import fr.utils.ArraysUtils;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Rechercher le plus grand élément du tableau
        ArraysUtils.println("Minimum element in the array");
        ArraysUtils.println(ArraysUtils.min(array));
    }
}
