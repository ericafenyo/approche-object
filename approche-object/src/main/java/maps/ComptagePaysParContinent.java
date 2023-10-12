package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ComptagePaysParContinent {
  public static void main(String[] args) {
    ArrayList<Pays> countries = new ArrayList<>();
    countries.add(new Pays("France", 65_000_000L, "Europe"));
    countries.add(new Pays("Allemagne", 80_000_000L, "Europe"));
    countries.add(new Pays("Belgique", 10_000_000L, "Europe"));
    countries.add(new Pays("Russie", 150_000_000L, "Asie"));
    countries.add(new Pays("Chine", 1_400_000_000L, "Asie"));
    countries.add(new Pays("Indonésie", 220_000_000L, "Océanie"));
    countries.add(new Pays("Australie", 20_000_000L, "Océanie"));

    HashMap<String, Integer> accumulator = new HashMap<>();
    for (Pays country : countries) {
      int value = accumulator.get(country.getContinent()) == null ? 0 : accumulator.get(country.getContinent());
      value = value + 1;
      accumulator.put(country.getContinent(), value);
    }

    accumulator.forEach((key, value) -> System.out.printf("key: %s, value: %d%n", key, value));
  }
}
