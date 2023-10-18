package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;
import fr.diginamic.recensement.exceptions.NotFoundException;
import fr.diginamic.recensement.models.City;
import fr.diginamic.recensement.util.Preconditions;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MostPopulousCitiesPerRegionCommand implements Command {
  private final Census census;
  private final Scanner scanner;

  public MostPopulousCitiesPerRegionCommand(Census census, Scanner scanner) {
    System.out.println("7. Display the 10 most populous cities in a region");
    this.census = census;
    this.scanner = scanner;
  }

  @Override
  public void execute() {
    System.out.println("--------------------------------------------------");
    System.out.println("7. Display the 10 most populous cities in a region");
    System.out.println("---------------------------------------------------");

    // Request the user to enter a department code.
    System.out.println("Please enter a region code or region name:");
    String input = scanner.nextLine();

    execute(input, census.getCities());
  }

  private void execute(String input, List<City> cities) {
    if (Preconditions.isInteger(input)) {
      withCode(Integer.parseInt(input), census.getCities());
    } else {
      withName(input, census.getCities());
    }
  }

  private void withName(String name, List<City> cities) {
    List<City> sorted = cities.stream()
        .filter(city -> city.region().name().equals(name))
        .sorted((current, upcoming) -> upcoming.population().compareTo(current.population()))
        .limit(10)
        .toList();

    if (sorted.isEmpty()) {
      throw new NotFoundException("Region name is not supported, try again");
    }

    System.out.printf("The 10 most populous cities in the region with name: %s%n", name);
    int count = 1;
    for (City city : sorted) {
      System.out.printf("%d. %s%n", count, city.name());
      count++;
    }
  }

  private void withCode(int code, List<City> cities) {
    List<City> sorted = cities.stream()
        .filter(city -> city.region().code() == code)
        .sorted((current, upcoming) -> upcoming.population().compareTo(current.population()))
        .limit(10)
        .toList();

    if (sorted.isEmpty()) {
      System.out.println("Region code is not supported, try again");
    }

    System.out.printf("The 10 most populous cities in the region with code: %s%n", code);
    int count = 1;
    for (City city : sorted) {
      System.out.printf("%d. %s%n", count, city.name());
      count++;
    }
  }
}
