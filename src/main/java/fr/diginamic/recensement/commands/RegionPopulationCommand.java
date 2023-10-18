package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;
import fr.diginamic.recensement.models.City;
import fr.diginamic.recensement.util.Preconditions;

import java.util.List;
import java.util.Scanner;

public class RegionPopulationCommand implements Command {
  private final Census census;
  private final Scanner scanner;

  public RegionPopulationCommand(Census census, Scanner scanner) {
    System.out.println("3. Display the population of a region");
    this.census = census;
    this.scanner = scanner;
  }

  @Override
  public void execute() {
    System.out.println("-------------------------------------");
    System.out.println("3. Display the population of a region");
    System.out.println("-------------------------------------");

    System.out.println("Please enter a region code or region name:");

    String input = scanner.nextLine();

    execute(input, census.getCities());

  }

  private void execute(String input, List<City> cities) {
    if (Preconditions.isInteger(input)) {
      withCode(Integer.parseInt(input), cities);
    } else {
      withName(input, cities);
    }
  }

  private void withName(String name, List<City> cities) {
    Long population = cities.stream()
        .filter(city -> city.region().name().equals(name))
        .mapToLong(city -> city.population())
        .sum();

    System.out.printf("The population of the given region with name %s:%n", name);
    System.out.println(population);
  }

  private void withCode(int code, List<City> cities) {
    Long population = cities.stream()
        .filter(city -> city.region().code() == code)
        .mapToLong(city -> city.population())
        .sum();

    System.out.printf("The population of the given region with code %d:%n", code);
    System.out.println(population);
  }
}
