package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Intervenant employee = new Salarie(2084);
        employee.setNom("Doe");
        employee.setPrenom("John");

        Intervenant freelancer = new Pigiste(12, 84.00);
        freelancer.setNom("Akuitor");
        freelancer.setPrenom("Patience");

        employee.afficherDonnees();
        freelancer.afficherDonnees();
    }
}
