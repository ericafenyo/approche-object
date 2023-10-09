package fr.algorithmie;

import fr.utils.ArraysUtils;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        ArraysUtils.println("Array element greater than 3");
        for (int element : array) {
            if (element > 3) {
                ArraysUtils.println(element);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        ArraysUtils.println("Array elements that are even");
        for (int element : array) {
            if (ArraysUtils.isEven(element)) {
                ArraysUtils.println(element);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
        ArraysUtils.println("Array elements with even indices");
        for (int i = 0; i < array.length; i++) {
            if (ArraysUtils.isEven(i)) {
                ArraysUtils.println(array[i]);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        ArraysUtils.println("Array elements that are odd");
        for (int element : array) {
            if (!(ArraysUtils.isEven(element))) {
                ArraysUtils.println(element);
            }
        }
    }
}
