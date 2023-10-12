package maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class MapVilles {
  public static void main(String[] args) {
    HashMap<String, Long> mapVilles = new HashMap<>();
    mapVilles.put("Marseille", 8_000_000L);
    mapVilles.put("Montpellier", 5_000_000L);
    mapVilles.put("Nantes",2_000_000L);
    mapVilles.put("Paris",10_000_000L);

    Long min = Collections.min(mapVilles.values().stream().toList());


    AtomicReference<String> city = new AtomicReference<>("");
    mapVilles.forEach((key, value) -> {
      if (Objects.equals(value, min)){
        city.set(key);
      }
    });

    System.out.println("The city with the smallest population: " + city.get());

    System.out.println("Removing city");
    mapVilles.remove(city.get());

    mapVilles.forEach((key, value) -> {
      System.out.printf("key: %s, value: %d%n", key, value);
    });
  }

}
