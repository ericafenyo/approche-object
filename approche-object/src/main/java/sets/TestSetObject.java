package sets;

import java.util.*;

public class TestSetObject {
    public static void main(String[] args) {
        HashSet<Pays> set = new HashSet<>(
                Set.of(
                        new Pays("France", 68_042_591, 43_658.98),
                        new Pays("Allemagne", 83_240_000, 51_203.55),
                        new Pays("UK", 66_022_000, 46_510.2851),
                        new Pays("Italie", 60_300_000, 35_657.50),
                        new Pays("Japon", 125_700_000, 39_312.66),
                        new Pays("Chine", 1_300_000_000, 12_556.33),
                        new Pays("Russie", 125_700_000, 12_194.78),
                        new Pays("Inde", 1_428_600_000, 2_256.59)
                )
        );

        // Recherchez le pays avec le PIB/habitant le plus important
        Pays pays = null;
        for (Pays element : set) {
            if (pays == null) {
                pays = element;
            }

            if (element.getPibByPerson() > pays.getPibByPerson()) {
                pays = element;
            }
        }
        System.out.println("The city with the largest pib per person: " + pays.getNom());
        System.out.println();


        // Recherchez le pays avec le PIB/habitant le plus important
        Pays pays1 = null;
        for (Pays element : set) {
            if (pays1 == null) {
                pays1 = element;
            }

            if ((element.getPibByPerson() * element.getPopulation()) > (pays1.getPibByPerson() * pays1.getPopulation())) {
                pays1 = element;
            }
        }
        System.out.println("The city with the largest total pib: " + pays1.getNom());
        System.out.println("\n");

        Pays pays2 = null;
        for (Pays element : set) {
            if (pays2 == null) {
                pays2 = element;
            }

            if ((element.getPibByPerson() * element.getPopulation()) < (pays2.getPibByPerson() * pays2.getPopulation())) {
                pays2 = element;
            }
        }

        System.out.println("The city with the smallest total pib: " + pays2.getNom());
        set.remove(pays2);
        
        // Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB
        //total

        set.forEach(country -> System.out.printf("Name: %s, Population: %d, Total PIB: %.2f%n", country.getNom(), country.getPopulation(), country.getPopulation() * country.getPibByPerson()));
    }
}
