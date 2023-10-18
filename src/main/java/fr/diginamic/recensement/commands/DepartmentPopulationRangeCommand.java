package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;
import fr.diginamic.recensement.exceptions.IllegalNumberArgumentException;
import fr.diginamic.recensement.exceptions.IllegalRangeException;
import fr.diginamic.recensement.exceptions.NotFoundException;
import fr.diginamic.recensement.models.City;
import fr.diginamic.recensement.util.Preconditions;

import java.util.List;
import java.util.Scanner;

public class DepartmentPopulationRangeCommand implements Command {
  private final Census census;
  private final Scanner scanner;

  public DepartmentPopulationRangeCommand(Census census, Scanner scanner) {
    System.out.println("4. Find cities within a department based on their population range.");
    this.census = census;
    this.scanner = scanner;
  }

  @Override
  public void execute() throws NotFoundException, IllegalNumberArgumentException, IllegalRangeException {
    System.out.println("-------------------------------------------------------------------");
    System.out.println("4. Find cities within a department based on their population range.");
    System.out.println("-------------------------------------------------------------------");

    System.out.println("Please enter a department code:");
    String code = scanner.nextLine();

    if (!Preconditions.isInteger(code)) {
      throw new IllegalNumberArgumentException();
    }

    System.out.println("Please enter max population (in thousands):");
    String maxInput = scanner.nextLine();

    if (!Preconditions.isInteger(maxInput)) {
      throw new IllegalNumberArgumentException();
    }

    System.out.println("Please enter min population (in thousands):");
    String minInput = scanner.nextLine();

    if (!Preconditions.isInteger(minInput)) {
      throw new IllegalNumberArgumentException();
    }

    int min = Integer.parseInt(minInput) * 1000;
    int max = Integer.parseInt(maxInput) * 1000;

    if (min > max) {
      throw new IllegalRangeException();
    }

    execute(code, min, max, census.getCities());
  }

  private void execute(String code, int min, int max, List<City> cities) {
    List<City> result = cities.stream()
        .filter(city -> city.department().equals(code))
        .filter(city -> city.population() >= min && city.population() <= max)
        .toList();

    if (result.isEmpty()) {
      throw new NotFoundException();
    }

    for (City city : result) {
      System.out.println(city);
    }
  }
}
