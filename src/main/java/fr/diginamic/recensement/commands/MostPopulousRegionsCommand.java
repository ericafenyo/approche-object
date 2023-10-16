package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;
import fr.diginamic.recensement.models.City;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostPopulousRegionsCommand implements Command {
  private final Census census;

  public MostPopulousRegionsCommand(Census census) {
    System.out.println("4. Display the 10 most populous regions");
    this.census = census;
  }

  @Override
  public void execute() {
    System.out.println("---------------------------------------");
    System.out.println("4. Display the 10 most populous regions");
    System.out.println("---------------------------------------");

    List<City> cities = census.getCities();
    Map<String, Long> accumulator = new HashMap<>();
    for (City city : cities) {
      accumulator.merge(city.name(), city.population(), (current, upcoming) -> current + upcoming);
    }

    List<Map.Entry<String, Long>> entries = new ArrayList<>();
    accumulator.forEach((key, value) -> entries.add(new SimpleEntry<>(key, accumulator.get(key))));

    var sorted = entries.stream()
        .sorted((current, upcoming) -> upcoming.getValue().compareTo(current.getValue()))
        .limit(10).map(entry -> entry.getKey())
        .toList();

    // Print top ten populated regions
    System.out.println("Top 10 populous regions");
    int count = 1;
    for (String city : sorted) {
      System.out.printf("%d. %s%n", count, city);
      count++;
    }
  }
}
