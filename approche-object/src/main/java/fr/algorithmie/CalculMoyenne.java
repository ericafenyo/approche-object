package fr.algorithmie;

import fr.utils.ArraysUtils;

public class CalculMoyenne {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int sum = ArraysUtils.sum(array);
        // The result of a division might be a floating point number
        double average = sum / 2.0;

        ArraysUtils.println("The average of the given array");
        ArraysUtils.println(average);
    }
}
