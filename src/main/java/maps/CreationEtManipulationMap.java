package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
  public static void main(String[] args) {
    HashMap<Integer, String> mapVilles = new HashMap<>();
    mapVilles.put(13, "Marseille");
    mapVilles.put(34, "Montpellier");
    mapVilles.put(44, "Nantes");
    mapVilles.put(75, "Paris");
    mapVilles.put(31, "Toulouse");

    // Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
    mapVilles.put(87, "Lille");
    mapVilles.put(43, "Lyon");
    mapVilles.put(53, "Bordeaux");

    // Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map

    System.out.println("The keys in the maps:");
    for (int key: mapVilles.keySet()){
      System.out.println(key);
    }

    System.out.println("-----------------------------");
    // Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
    System.out.println("The values in the maps:");
    for (String value: mapVilles.values()){
      System.out.println(value);
    }

    System.out.println("-----------------------------");

    // Afficher la taille de la map
    System.out.println("This size of the map is: " + mapVilles.size());
  }
}
