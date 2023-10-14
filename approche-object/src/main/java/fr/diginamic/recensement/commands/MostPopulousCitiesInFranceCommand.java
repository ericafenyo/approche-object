package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;
import fr.diginamic.recensement.models.City;

import java.util.Comparator;
import java.util.List;

public class MostPopulousCitiesInFranceCommand implements Command {
  private final Census census;

  public MostPopulousCitiesInFranceCommand(Census census) {
    System.out.println("8. Display the 10 most populous cities in France");
    this.census = census;
  }

  @Override
  public void execute() {
    System.out.println("------------------------------------------------");
    System.out.println("8. Display the 10 most populous cities in France");
    System.out.println("------------------------------------------------");

    execute(census.getCities());
  }

  private void execute(List<City> cities) {
    List<City> sorted = cities.stream()
        .sorted(Comparator.comparing(city -> city.population()))
        .limit(10)
        .toList();

    // Print top ten populated regions
    System.out.println("The 10 most populous cities in France:");
    int count = 1;
    for (City city : sorted) {
      System.out.printf("%d. %s%n", count, city.name());
      count++;
    }
  }
}
