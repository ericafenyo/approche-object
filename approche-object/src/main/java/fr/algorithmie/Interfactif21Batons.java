package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The rule of the game is that the person who takes the last bar loses.");
        System.out.println("Who will chose first?");
        System.out.println("Enter 0 for computer or any number for you");

        // NB: We won't validate the type
        String input = scanner.nextLine();
        int converted = Integer.valueOf(input);

        boolean isComputerFirst = converted == 0;
        int numberOfBars = 21;
        while (true) {
            System.out.print("Bars left: ");
            for (int i = 0; i < numberOfBars; i++) {
                System.out.print("▯");
            }

            System.out.printf( "(%d)", numberOfBars);
            System.out.println("");

            if (isComputerFirst) {
                System.out.println("Computer rolling the dice");
            } else {
                System.out.println("Auto rolling the dice for you");
            }

            int result = IntUtils.random(1, 6);
            System.out.println("Result is: " + result);
            System.out.println("Taking " + result + " bars out of " + numberOfBars);
            numberOfBars -= result;

            if (numberOfBars < 1) {
                if (isComputerFirst) {
                    System.out.println("Computer lost");
                } else {
                    System.out.println("You lost");
                }

                break;
            }

            isComputerFirst = !isComputerFirst;
            System.out.println("=========================================================");
        }
    }
}
