package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;
import fr.diginamic.recensement.models.City;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class DepartmentPopulationCommand implements Command {
  private final Census census;
  private final Scanner scanner;

  public DepartmentPopulationCommand(Census census, Scanner scanner) {
    System.out.println("2. Display the population of a department");
    this.census = census;
    this.scanner = scanner;
  }

  @Override
  public void execute() {
    System.out.println("-----------------------------------------");
    System.out.println("2. Display the population of a department");
    System.out.println("-----------------------------------------");

    System.out.println("Please enter a department code:");
    String code = scanner.nextLine();

    execute(code, census.getCities());
  }

  private void execute(String code, List<City> cities) {
    Optional<City> result = cities.stream()
        .filter(city -> city.department().equals(code))
        .findFirst();

    if (result.isPresent()) {
      System.out.printf("The population of the department with code %s:%n", code);
      System.out.println(result.get().population());
    } else {
      System.out.println("Department cannot be found, try again");
    }
  }
}
