package fr.diginamic.operations;

public class Operations {
    public static double calculate(double a, double b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '/' -> a / b;
            case '*' -> a * b;
            default -> throw new IllegalArgumentException("Operator is not supported: " + operator);
        };
    }
}
