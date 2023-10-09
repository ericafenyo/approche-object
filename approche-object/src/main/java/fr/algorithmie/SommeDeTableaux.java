package fr.algorithmie;

import fr.utils.ArraysUtils;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] arrayOne = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayTwo = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        int totalSize = arrayOne.length + arrayTwo.length;

        // I can also use Arrays.copyOf but let's copy each item.
        int[] combinedArray = new int[totalSize];

        // Copy first array
        for (int i = 0; i < arrayOne.length; i++) {
            combinedArray[i] = arrayOne[i];
        }

        // Add the second array
        int startIndex = arrayOne.length;
        for (int i = 0; i < arrayTwo.length; i++) {
            int index = startIndex + i;
            combinedArray[index] = arrayTwo[i];
        }

        ArraysUtils.println("Combined array");
        ArraysUtils.println(combinedArray);

        ArraysUtils.println("Total combined array length");
        ArraysUtils.println(combinedArray.length);
    }
}
