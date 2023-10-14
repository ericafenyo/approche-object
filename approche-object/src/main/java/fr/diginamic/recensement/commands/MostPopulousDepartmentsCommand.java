package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;
import fr.diginamic.recensement.models.City;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostPopulousDepartmentsCommand implements Command {
  private final Census census;

  public MostPopulousDepartmentsCommand(Census census) {
    System.out.println("5. Display the 10 most populous departments");
    this.census = census;
  }

  @Override
  public void execute() {
    System.out.println("-------------------------------------------");
    System.out.println("5. Display the 10 most populous departments");
    System.out.println("-------------------------------------------");

    List<City> cities = census.getCities();
    Map<String, Long> accumulator = new HashMap<>();
    for (City city : cities) {
      // The merge function adds a new element to the map.
      // When the key exist, the map sets the value without creating new field.
      // The merge has a transformation bi consumer function that can be used to modify the values.
      accumulator.merge(city.department(), city.population(), (current, upcoming) -> current + upcoming);
    }

    List<Map.Entry<String, Long>> entries = new ArrayList<>();
    accumulator.forEach((key, value) -> entries.add(new SimpleEntry<>(key, accumulator.get(key))));

    var sorted = entries.stream()
        .sorted((current, next) -> current.getValue().compareTo(next.getValue()))
        .limit(10)
        .map(entry -> entry.getKey())
        .toList();

    // Print top ten populated regions
    System.out.println("The 10 most populous departments");
    int count = 1;
    for (String city : sorted) {
      System.out.printf("%d. %s%n", count, city);
      count++;
    }
  }
}
