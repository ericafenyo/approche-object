package fr.diginamic.recensement;

import fr.diginamic.recensement.models.City;
import fr.diginamic.recensement.models.Region;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * The Census class represents a collection of cities and associated population data.
 */
public class Census {
  /**
   * The index for the city population in the data structure.
   */
  private static final int CITY_POPULATION_INDEX = 9;

  /**
   * The index for the region code in the data structure.
   */
  private static final int REGION_CODE_INDEX = 0;

  /**
   * The index for the region name in the data structure.
   */
  private static final int REGION_NAME_INDEX = 1;

  /**
   * The index for the department code in the data structure.
   */
  private static final int DEPARTMENT_CODE_INDEX = 2;

  /**
   * The index for the community name in the data structure.
   */
  private static final int COMMUNITY_NAME_INDEX = 6;

  /**
   * The index for the community code in the data structure.
   */
  private static final int COMMUNITY_CODE_INDEX = 5;

  /**
   * List of {@link City} objects representing cities and their associated data.
   */
  private final List<City> cities;


  private Census(List<City> cities) {
    this.cities = cities;
  }

  public List<City> getCities() {
    return cities;
  }

  /**
   * Returns a singleton of Census.
   *
   * @return A Census instance.
   */
  public static Census create() {

    // Path to csv file
    Path csv = Paths.get("./src/main/java/fr/diginamic/recensement/assets/population_census_2016.csv");

    // Fetch and create a list of cities
    List<City> accumulator = new ArrayList<>();
    if (Files.exists(csv)) {
      // Read all lines in the file.
      List<String> rows = null;
      try {
        rows = Files.readAllLines(csv);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      // Remove the headings from the file. In CSV, the headings are on the first line.
      rows.remove(0);
      for (String row : rows) {
        City city = buildCity(row);
        accumulator.add(city);
      }
    }

    return new Census(accumulator);
  }

  private static City buildCity(String row) {
    String[] array = row.split(";");
    // Let's create all this overhead objects for understanding purposes.
    // They will be garbage collected after the final object is created hence saving memory.
    String name = array[COMMUNITY_NAME_INDEX];
    int code = Integer.parseInt(array[COMMUNITY_CODE_INDEX]);
    String department = array[DEPARTMENT_CODE_INDEX];
    Long population = Long.parseLong(array[CITY_POPULATION_INDEX].replaceAll(" ", ""));

    String regionName = array[REGION_NAME_INDEX];
    int regionCode = Integer.parseInt(array[REGION_CODE_INDEX]);
    Region region = new Region(regionName, regionCode);

    return new City(name, code, population, region, department);
  }
}
