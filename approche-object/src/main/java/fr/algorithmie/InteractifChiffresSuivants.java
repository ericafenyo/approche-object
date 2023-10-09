package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        // NB: We won't validate the type
        String input = scanner.nextLine();
        int converted = Integer.valueOf(input);

        for (int i = 1; i <= 10; i++) {
            System.out.println(converted + i);
        }
    }
}
