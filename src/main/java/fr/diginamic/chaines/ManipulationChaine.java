package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char firstChar = chaine.charAt(0);
        System.out.printf("First character: %s%n", firstChar);

        System.out.printf("Total length: %d%n", chaine.length());

        System.out.printf("Index of first ';' char: %d%n", chaine.indexOf(";"));

        int firstSeparatorIndex = chaine.indexOf(";");
        String surname = chaine.substring(0, firstSeparatorIndex);
        System.out.printf("Surname: %s%n", surname);
        System.out.printf("Surname in uppercase: %s%n", surname.toUpperCase());
        System.out.printf("Surname in lowercase: %s%n", surname.toLowerCase());

        String[] names = chaine.split(";");

        String lastNameName = names[0];
        String firstName = names[1];
        String money = names[2];

        Salarie salary = new Salarie();
        salary.setNom(lastNameName);
        salary.setPrenom(firstName);
        salary.setSalaire(Double.parseDouble(money.replace(" ", "")));

        System.out.printf("Salary: Surname = %s, First name = %s, Amount = %.2f%n", salary.getNom(), salary.getPrenom(), salary.getSalaire());
    }
}
