package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale addressOne = new AdressePostale(
                20,
                "rue Lilly Rein",
                "Bernice", 74000
        );

        AdressePostale addressTwo = new AdressePostale(
                6,
                "rue Urbain la Liberté",
                "Lollipop",
                34100
        );

        Personne personOne = new Personne("Morgana", "Pendragon");
        personOne.setAddress(addressOne);

        Personne personTwo = new Personne("Loreta", "Snap");
        personTwo.setAddress(addressTwo);

        System.out.println("Person one --------");
        System.out.println("First name:" + personOne.firstName);
        System.out.println("Last name:" + personOne.lastName);
        System.out.println("Address:" + addressOne);

        System.out.println(" ");

        System.out.println("Person two --------");
        System.out.println("First name:" + personTwo.firstName);
        System.out.println("Last name:" + personTwo.lastName);
        System.out.println("Address:" + addressTwo);

        personTwo.printName();
    }
}
