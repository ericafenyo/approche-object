package fr.algorithmie;

import fr.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers seperated by comma. example 1,3,...");

        // NB: We won't validate the type
        String input = scanner.nextLine();
        String[] stringArray = input.split(",");


        // Not needed but why not
        if (stringArray.length == 10) {
            int[] converted = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                converted[i] = Integer.valueOf(stringArray[i]);
            }

            System.out.println("Max: " + ArraysUtils.max(converted));
        } else {
            System.out.println("Numbers should be ten");
        }
    }
}
