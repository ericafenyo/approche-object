package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void printFibonacci(int N) {
        int n1 = 0;
        int n2 = 1;
        int count = 0;
        while (count < N) {
            System.out.print(n1 + " ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            count = count + 1;
        }
    }
}

