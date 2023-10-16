package fr.algorithmie;

import fr.utils.ArraysUtils;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        System.out.println("This lottery game involves a single number, predict it.");
        System.out.println("Note that it is between 1 and 100 both inclusive");
        System.out.println("Enter the number number:");

        int random = IntUtils.random(1, 100);

        int attemtps = 1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int converted = Integer.valueOf(input);

            if (converted == random) {
                System.out.println("Bravo!, you predicted it in " + attemtps + " attempts");
                break;
            } else if (converted > random) {
                System.out.println("Your prediction is too high");
                System.out.println("Try again:");
            } else {
                System.out.println("Your prediction is too low");
                System.out.println("Try again:");
            }

            attemtps++;
        }
    }
}
