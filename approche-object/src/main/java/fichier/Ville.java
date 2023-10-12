package fichier;

public class Ville {
  // City name
  private String nom;
  //Department code
  private String code;
  // Region name
  private String region;
  //Total population
  private String population;

  public Ville(String nom, String code, String region, String population) {
    this.nom = nom;
    this.code = code.replaceAll( " ","");
    this.region = region;
    this.population = population.replaceAll( " ","");
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code.replaceAll( " ","");
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getPopulation() {
    return population;
  }

  public void setPopulation(String population) {
    this.population = population.replaceAll( " ","");
  }

  @Override
  public String toString() {
    return "Ville[" +
        "nom='" + nom + '\'' +
        ", code='" + code + '\'' +
        ", region='" + region + '\'' +
        ", population='" + population + '\'' +
        ']';
  }
}
