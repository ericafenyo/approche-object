package fr.diginamic.salaire;

/**
 * Représente un salarié du journal, i.e. ceux qui ont un contrat de travail type CDI ou CDD.
 */
public class Salarie extends Intervenant {

    /**
     * le montant du salaire mensuel
     */
    private double total;

    public Salarie(double total) {
        this.total = total;
    }

    @Override
    public double getSalaire() {
        return total;
    }

    @Override
    public void afficherDonnees() {
        System.out.printf("Surname: %s, First name: %s, Total salary: %.2f, Status: %s%n", getNom(), getPrenom(), getSalaire(), "Salarie");
    }
}
