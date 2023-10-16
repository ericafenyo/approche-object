package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> liste3 = new ArrayList<String>();

        liste1.forEach(item -> liste3.add(item));
        liste2.forEach(item -> liste3.add(item));

        // Print the size of the array list
        System.out.println("This size of the final list is: " + liste3.size());
    }
}
