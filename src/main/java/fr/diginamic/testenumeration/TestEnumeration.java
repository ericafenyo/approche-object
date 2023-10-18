package fr.diginamic.testenumeration;

public class TestEnumeration {
  public static void main(String[] args) {
    // Utilisez une boucle pour affichez toutes les saisons.
    System.out.println("Les Saisons:");
    for (Saison value : Saison.values()) {
      System.out.println(value.numero() + ". " + value);
    }

    System.out.println();
    // Soit la chaine de caractères suivante : String nom = « ETE » ;
    String input = "ETE";
    Saison value = Saison.valueOf(input);
    System.out.println("Label of ETE: " + value.libelle());

    System.out.println();
    // Soit la chaine de caractères suivante : String libelle = « Hiver » ;
    String label = "Hiver";
    Saison hiver = Saison.findByLabel(label);
    System.out.println("Find by label (Hiver): " + hiver);
  }
}
