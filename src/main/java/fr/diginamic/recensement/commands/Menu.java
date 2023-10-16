package fr.diginamic.recensement.commands;

import fr.diginamic.recensement.Census;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static fr.diginamic.recensement.util.Preconditions.isInteger;
import static fr.diginamic.recensement.util.Preconditions.withinRange;

public class Menu {
  private static final Map<Integer, Command> commands = new LinkedHashMap<>();

  private Menu() {
  }

  public static void displayOptions() {
    System.out.println("Select an option by entering a corresponding number:");
    Scanner scanner = new Scanner(System.in);
    Census census = Census.create();

    bindOptions(census, scanner);

    int option;
    while (true) {
      String input = scanner.nextLine();
      if (isInteger(input) && withinRange(Integer.parseInt(input), 1, commands.size())) {
        option = Integer.parseInt(input);
        break;
      } else {
        System.out.println("Select a valid option:");
      }
    }

    var command = commands.get(option);
    if (command != null) {
      command.execute();
    }
  }

  private static void bindOptions(Census census, Scanner scanner) {
    commands.put(1, new CityPopulationCommand(census, scanner));
    commands.put(2, new DepartmentPopulationCommand(census, scanner));
    commands.put(3, new RegionPopulationCommand(census, scanner));
    commands.put(4, new MostPopulousRegionsCommand(census));
    commands.put(5, new MostPopulousDepartmentsCommand(census));
    commands.put(6, new MostPopulousCitiesPerDepartmentCommand(census, scanner));
    commands.put(7, new MostPopulousCitiesPerRegionCommand(census, scanner));
    commands.put(8, new MostPopulousCitiesInFranceCommand(census));
    commands.put(9, new ExitCommand());
  }
}
