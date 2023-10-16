package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison house = new Maison();

        Piece masterBedroom = new Chambre(100, 2);
        house.ajouterPiece(masterBedroom);

        Piece guestBedroom = new Chambre(60, 1);
        house.ajouterPiece(guestBedroom);

        Piece firstChildBedroom = new Chambre(40, 2);
        house.ajouterPiece(firstChildBedroom);

        Piece secondChildBedroom = new Chambre(40, 2);
        house.ajouterPiece(secondChildBedroom);

        Piece kitchen = new Cuisine(70, 2);
        house.ajouterPiece(kitchen);

        Piece balconyWashroom = new SalleDeBain(30, 2);
        house.ajouterPiece(balconyWashroom);

        Piece sharedWashroom = new SalleDeBain(30, 1);
        house.ajouterPiece(sharedWashroom);

        Piece toilet = new WC(20, 2);
        house.ajouterPiece(toilet);

        Piece sharedToilet = new WC(20, 1);
        house.ajouterPiece(sharedToilet);

        Piece sittingRoom = new Salon(150, 1);
        house.ajouterPiece(sittingRoom);

        Piece topSittingRoom = new Salon(50, 2);
        house.ajouterPiece(topSittingRoom);

        System.out.printf("Total surface: unit squared %.1f%n", house.getSurface());
        System.out.printf("Total surface on second floor: unit squared %.1f%n", house.getSurfaceByStories(2));
        System.out.printf("Total surface on first floor: unit squared %.1f%n", house.getSurfaceByStories(1));
        System.out.println("------------------------------\n");
        System.out.printf("Total surface for kitchens: unit squared %.1f%n", house.getSurfaceByType(Cuisine.class));
        System.out.printf("Total surface for bedrooms: unit squared %.1f%n", house.getSurfaceByType(Chambre.class));
        System.out.printf("Total surface for washrooms: unit squared %.1f%n", house.getSurfaceByType(SalleDeBain.class));
        System.out.printf("Total surface for toilets: unit squared %.1f%n", house.getSurfaceByType(WC.class));
        System.out.printf("Total surface for sitting rooms: unit squared %.1f%n", house.getSurfaceByType(Salon.class));
        System.out.println("------------------------------\n");
        System.out.printf("Total number of kitchens: %d%n", house.getTypeCount(Cuisine.class));
        System.out.printf("Total number of bedrooms: %d%n", house.getTypeCount(Chambre.class));
        System.out.printf("Total number of washrooms: %d%n", house.getTypeCount(SalleDeBain.class));
        System.out.printf("Total number of toilets: %d%n", house.getTypeCount(WC.class));
        System.out.printf("Total number of sitting rooms: %d%n", house.getTypeCount(Salon.class));
    }
}
