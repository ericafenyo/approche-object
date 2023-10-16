package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(
                Set.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde")
        );

        System.out.println("Original set");
        System.out.println(String.join(", ", set));
        System.out.println("\n");

        // Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
        String largest = "";
        for (String element : set) {
            if (element.length() > largest.length()) {
                largest = element;
            }
        }
        System.out.println("The city with the largest chars: " + largest);
        // Supprimez ce pays
        set.remove(largest);
        System.out.println("\n");

        System.out.println("Set after removing the largest country chars");
        System.out.println(String.join(", ", set));
    }
}
