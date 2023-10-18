package listes;

import java.util.Objects;

public class Ville {
  private String name;
  private Long population;
  private Continent continent;

  public Ville(String name, Long population) {
    this.name = name;
    this.population = population;
  }

  public Ville(String name, Long population, Continent continent) {
    this.name = name;
    this.population = population;
    this.continent = continent;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getPopulation() {
    return population;
  }

  public void setPopulation(Long population) {
    this.population = population;
  }

  public Continent getContinent() {
    return continent;
  }

  public void setContinent(Continent continent) {
    this.continent = continent;
  }

  @Override
  public String toString() {
    return "Ville = [" +
        "name='" + name + '\'' +
        ", population=" + population +
        ", continent=" + continent +
        ']';
  }
}
