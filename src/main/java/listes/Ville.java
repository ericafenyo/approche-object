package listes;

import java.util.Objects;

public class Ville {
  private String name;
  private Long population;

  public Ville(String name, Long population) {
    this.name = name;
    this.population = population;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Ville ville = (Ville) o;
    return Objects.equals(name, ville.name) && Objects.equals(population, ville.population);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, population);
  }
}
