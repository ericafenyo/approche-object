package fr.diginamic.salaire;

/**
 * représente les personnes payées à la journée
 */
public class Pigiste extends Intervenant {
    /**
     * Le nombre de jours travaillés pour la société durant le mois
     */
    private int days;

    /**
     * Le montant journalier de rémunération
     */
    private double amountPerDay;

    public Pigiste(int days, double amountPerDay) {
        this.days = days;
        this.amountPerDay = amountPerDay;
    }

    @Override
    public double getSalaire() {
        return amountPerDay * days;
    }

    @Override
    public void afficherDonnees() {
        System.out.printf("Surname: %s, First name: %s, Total salary: %.2f, Status: %s%n", getNom(), getPrenom(), getSalaire(), "Pigiste");
    }
}
