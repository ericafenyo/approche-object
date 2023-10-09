package fr.algorithmie;

import fr.utils.ArraysUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] arrayOne = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayTwo = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        // ArrayOne has more elements so let us use it as the base array
        // And also don't know the size of the result so, we can't create a fixed array
        // Let's use a List.

        List<Integer> intersections = new ArrayList<>();
        for (int element : arrayOne) {
            int index = ArraysUtils.indexOf(arrayTwo, element);
            if (index != -1) {
                intersections.add(element);
            }
        }

        ArraysUtils.println("Comment elements in the given arrays");
        for (Integer intersection : intersections) {
            ArraysUtils.println(intersection);
        }
    }
}
