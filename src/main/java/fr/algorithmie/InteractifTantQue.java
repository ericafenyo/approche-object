package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10:");

        // NB: We won't validate the type
        String input = scanner.nextLine();
        int converted = Integer.valueOf(input);
        if (converted >= 1 && converted <= 10) {
            System.out.println("Your number is: " + input);
        }else {
            System.out.println("Invalid argument, exiting...");
        }
    }
}
