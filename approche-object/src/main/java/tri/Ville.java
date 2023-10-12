package tri;

public class Ville implements Comparable<Ville> {
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

//  @Override
//  public int compareTo(Ville o) {
//    return name.compareTo(o.name);
//  }

  @Override
  public int compareTo(Ville o) {
    return population.compareTo(o.population);
  }
}
