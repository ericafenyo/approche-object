package fr.algorithmie;

import fr.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("All elements of the array");
        for (int element : array) {
            System.out.println(element);
        }

        // Print inverse of the array
        ArraysUtils.println("Print inverse of the array");
        ArraysUtils.println(ArraysUtils.inverse(array));


        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = Arrays.copyOf(array, array.length);
    }
}
