package listes;

import java.util.*;
import java.util.stream.Collectors;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(
                List.of("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes")
        );

        // Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
        String largest = "";
        for (String element : list) {
            if (element.length() > largest.length()) {
                largest = element;
            }
        }
        System.out.println("The element with the largest chars: " + largest);

        // Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
        //majuscules.
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            list.set(list.indexOf(element), element.toUpperCase());
        }
        System.out.println("Items to upper case:");
        System.out.println(String.join(", ", list));

        // Supprimez de la liste les villes dont le nom commence par la lettre N.
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            String element = iterator2.next();
            if (element.charAt(0) == 'N') {
                iterator2.remove();
            }
        }

        System.out.println("Items after removing N++ cities:");
        System.out.println(String.join(", ", list));
    }
}
