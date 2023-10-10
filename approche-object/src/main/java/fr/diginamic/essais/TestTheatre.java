package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        theatre.setName("The pentagon");
        theatre.setCapacity(100);

        theatre.subscribe(38, 365.3);
        theatre.subscribe(59, 833.3);
        theatre.subscribe(20, 298);

        System.out.printf("Total revenue after subscriptions: £%.2f%n",theatre.getRevenue() );
    }
}
