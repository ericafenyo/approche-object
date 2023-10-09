package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {6, 12, 17, 14, 5, -9, 0, 18, 6};
        System.out.println("The array is first last 6?");
        System.out.println(firstLast6(array));
    }

    public static boolean firstLast6(int[] array) {
        boolean isEmpty = array == null || array.length == 0;
        return !isEmpty && (array[0] == 6) && (array[array.length - 1] == 6);
    }
}
