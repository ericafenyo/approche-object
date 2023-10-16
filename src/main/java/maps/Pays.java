package maps;

public class Pays {
  private String nom;
  private long population;
  private String continent;

  public Pays(String nom, long population, String continent) {
    this.nom = nom;
    this.population = population;
    this.continent = continent;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }
}
