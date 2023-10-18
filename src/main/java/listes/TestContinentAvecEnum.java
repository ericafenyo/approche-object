package listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {
  public static void main(String[] args) {
    List<Ville> villes = new ArrayList<>();
    villes.add(new Ville("New York", 8_000_000L, Continent.NORTH_AMERICA));
    villes.add(new Ville("Paris", 2_000_000L, Continent.EUROPE));
    villes.add(new Ville("Pékin", 21_000_000L, Continent.ASIA));
    villes.add(new Ville("Moscou", 12_000_000L, Continent.EUROPE));
    villes.add(new Ville("Berlin", 4_000_000L, Continent.EUROPE));
    villes.add(new Ville("Sydney", 5_000_000L, Continent.AUSTRALIA));
    villes.add(new Ville("Sao Paulo", 12_000_000L, Continent.NORTH_AMERICA));
    villes.add(new Ville("Dakar", 1_000_000L, Continent.AFRICA));

    for (Ville ville : villes) {
      System.out.printf("%s, %s%n", ville.getName(), ville.getContinent().name());
    }
  }
}
