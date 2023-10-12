package sets;

public class Pays {
    private String nom;
    private long population;
    private double pibByPerson;

    public Pays(String nom, long population, double pibByPerson) {
        this.nom = nom;
        this.population = population;
        this.pibByPerson = pibByPerson;
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

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getPibByPerson() {
        return pibByPerson;
    }

    public void setPibByPerson(int pibByPerson) {
        this.pibByPerson = pibByPerson;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", population=" + population +
                ", pib=" + pibByPerson +
                '}';
    }
}
