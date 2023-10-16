package entites;

public class AdressePostale {
    int streetNumber;
    String streetName;
    String city;
    int postalCode;

    public AdressePostale(int streetNumber, String streetName, String city, int postalCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return String.format("%d %s,%d,%s", streetNumber, streetName, postalCode, city);
    }
}
