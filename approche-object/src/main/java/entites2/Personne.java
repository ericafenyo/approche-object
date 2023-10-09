package entites2;

import entites.AdressePostale;

public class Personne {
    public String firstName;
    public String lastName;
    public AdressePostale address;

    public Personne() {}

    public Personne(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printName() {
        System.out.println(String.format("%s %s", firstName, lastName.toUpperCase()));
    }

    public void setFirst(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(AdressePostale address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public AdressePostale getAddress() {
        return address;
    }
}
