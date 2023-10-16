package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        System.out.printf("10 + 2 = %.2f%n", Operations.calculate(10,2, '+'));
        System.out.printf("10 - 2 = %.2f%n", Operations.calculate(10,2, '-'));
        System.out.printf("10 / 2 = %.2f%n", Operations.calculate(10,2, '/'));
        System.out.printf("10 * 2 = %.2f%n", Operations.calculate(10,2, '*'));
    }
}
