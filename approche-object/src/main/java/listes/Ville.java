package listes;

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
  public String toString() {
    return "Ville{" +
        "name='" + name + '\'' +
        ", population=" + population +
        '}';
  }
}
