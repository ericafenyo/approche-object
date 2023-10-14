package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;
import fr.diginamic.recensement.models.City;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MostPopulousCitiesPerDepartmentCommand implements Command {
  private final Census census;
  private final Scanner scanner;

  public MostPopulousCitiesPerDepartmentCommand(Census census, Scanner scanner) {
    System.out.println("6. Display the 10 most populous cities in a department");
    this.census = census;
    this.scanner = scanner;
  }

  @Override
  public void execute() {
    System.out.println("-------------------------------------------------------");
    System.out.println("6. Display the 10 most populous cities in a department");
    System.out.println("-------------------------------------------------------");

    // Request the user to enter a department code.
    System.out.println("Please enter a department code:");

    String input = scanner.nextLine();
    handleChoice(input, census.getCities());
  }

  private void handleChoice(String code, List<City> cities) {
    List<City> sorted = cities.stream()
        .filter(city -> city.department().equals(code))
        .sorted(Comparator.comparing(city -> city.population()))
        .limit(10)
        .toList();

    if (sorted.isEmpty()) {
      System.out.println("Department code is not supported, try again");
    }

    // Print top ten populated regions
    System.out.printf("The 10 most populous cities in the department with code: %s%n", code);
    int count = 1;
    for (City city : sorted) {
      System.out.printf("%d. %s%n", count, city.name());
      count++;
    }
  }
}
