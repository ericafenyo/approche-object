package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>(Set.of(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

        // Affichez tous les éléments de la collection
        System.out.println("Original set");
        for (Iterator<Double> iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println("\n");
        double max = Collections.max(set);
        System.out.println("Max: " + max + "\n");

        double min = Collections.min(set);
        set.remove(min);

        System.out.println("Set after removing the least element");
        for (Iterator<Double> iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + ", ");
        }
    }
}
