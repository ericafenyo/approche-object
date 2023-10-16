package entites;

public class TestAdressePostale {
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

        System.out.println("Address one -------");
        System.out.println(addressOne.streetNumber + " " + addressOne.streetName);
        System.out.println(addressOne.postalCode + "," + addressOne.city);

        System.out.println("--------------------------------------------------");

        System.out.println("Address two --------");
        System.out.println(addressTwo.streetNumber + " " + addressTwo.streetName);
        System.out.println(addressTwo.postalCode + "," + addressTwo.city);
    }
}
