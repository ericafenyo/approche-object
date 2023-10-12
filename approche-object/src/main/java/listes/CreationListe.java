package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        // Add ints from 1 to 100
        for (int i = 1; i <= 100; i++) {
            integers.add(i);
        }

        // Print the size of the array list
        System.out.println("This size of the range 1..100 is: " + integers.size());
    }
}
