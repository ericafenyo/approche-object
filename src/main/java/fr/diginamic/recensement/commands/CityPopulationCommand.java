package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;
import fr.diginamic.recensement.exceptions.NotFoundException;
import fr.diginamic.recensement.models.City;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CityPopulationCommand implements Command {
  private final Census census;
  private final Scanner scanner;

  public CityPopulationCommand(Census census, Scanner scanner) {
    System.out.println("1. Display the population of a city");
    this.census = census;
    this.scanner = scanner;
  }

  @Override
  public void execute() throws NotFoundException {
    // Request the user to enter a department code.
    System.out.println("------------------------------------");
    System.out.println("1. Display the population of a city");
    System.out.println("------------------------------------");

    System.out.println("Please enter a city name:");
    String input = scanner.nextLine();

    execute(input, census.getCities());
  }

  private void execute(String name, List<City> cities) {
    Optional<City> result = cities.stream()
        .filter(city -> city.name().equals(name))
        .findFirst();

    if (result.isEmpty()) {
      throw new NotFoundException("City not found, try again");
    }

    System.out.printf("The population of the city with name %s:%n", name);
    System.out.println(result.get().population());

  }
}
