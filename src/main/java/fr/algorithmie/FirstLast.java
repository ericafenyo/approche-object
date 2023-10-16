package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {-1, 12, 17, 14, 5, -9, 0, -1};
        System.out.println("The array has same first and last element?");
        System.out.println(firstLast(array));
    }

    public static boolean firstLast(int[] array) {
        boolean isValid = array.length >= 1;
        return isValid && (array[0] == (array[array.length - 1]));
    }
}
