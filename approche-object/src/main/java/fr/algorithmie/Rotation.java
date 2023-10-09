package fr.algorithmie;

import fr.utils.ArraysUtils;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        /*
         If I understand well, the last element becomes the first and the second to last become the last.
         So it is like taking the last element in a stack and putting it on top.
         First in Last out kinda thingy. We will not use a stack, but we will simulate its behaviour
        */

        // Let's ignore empty arrays or other checks

        int[] accumulator = new int[array.length];
        int lastIndex = array.length - 1;
        int lastElement = array[lastIndex];

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (i == 0) {
                // We are shifting from left to right
                accumulator[0] = lastElement;
            } else if (i != lastIndex) {
                // We are shifting from left to right
                accumulator[i + 1] = element;
            }
        }

        accumulator[0] = lastElement;


        ArraysUtils.println("Rotated/Shifted arrays");
        ArraysUtils.println(accumulator);

    }
}
