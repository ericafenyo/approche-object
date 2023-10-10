package fr.utils;

import java.util.Arrays;
import java.util.List;

public class ArraysUtils {

    public static int[] inverse(int[] elements) {
        int[] accumulator = new int[elements.length];
        var index = elements.length - 1;
        for (int i = 0; i < elements.length; i++) {
            int element = elements[index];
            accumulator[i] = element;
            index--;
        }
        return accumulator;
    }

    public static void println(int[] array) {
        for (int element : array) {
            println(element);
        }
    }

    public static void println(Object any) {
        System.out.println(any);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    //N:B We can use do while but let just rush through
    public static int min(int[] array) {
        // Set min to the first element of the array
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    public static int indexOf(int[] array, int element) {
        List<Integer> accumulator = Arrays.stream(array).boxed().toList();
        return accumulator.indexOf(element);
    }
}
