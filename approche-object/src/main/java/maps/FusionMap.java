package maps;

import java.util.HashMap;

public class FusionMap {
  public static void main(String[] args) {
    HashMap<Integer, String> map1 = new HashMap<Integer, String>();
    map1.put(1, "Rouge");
    map1.put(2, "Vert");
    map1.put(3, "Orange");

    HashMap<Integer, String> map2 = new HashMap<Integer, String>();
    map2.put(4, "Blanc");
    map2.put(5, "Bleu");
    map2.put(6, "Orange");

    // Créer une map appelée map3 et qui contient l’ensemble des
    // données des 2 maps précédentes avec les mêmes clés et les mêmes valeurs

    HashMap<Integer, String> map3 = new HashMap<Integer, String>();
    map3.putAll(map1);
    map3.putAll(map2);

    System.out.println("This size of the map3 is: " + map3.size());
  }
}
