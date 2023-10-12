package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TestTri {
  public static void main(String[] args) {
    ArrayList<Ville> cities = new ArrayList<>();
    cities.add(new Ville("Montpellier", 5_000_000L));
    cities.add(new Ville("Nantes", 2_000_000L));
    cities.add(new Ville("Lyon", 4_000_000L));
    cities.add(new Ville("Marseille", 8_000_000L));
    cities.add(new Ville("Paris", 10_000_000L));

    System.out.println("Original cities");
    printCity(cities);

    System.out.println("---------------------------------------");
    System.out.println("Sort by name");
    Collections.sort(cities, new ComparatorNom());
    printCity(cities);
    System.out.println("---------------------------------------");
    System.out.println("Sort by population");
    Collections.sort(cities, new ComparatorHabitant());
    printCity(cities);
  }

  static void printCity(List<Ville> cities) {
    String citiesVal = cities.stream().map(Ville::getName).collect(Collectors.joining(", "));
    System.out.println(citiesVal);;
  }
}
