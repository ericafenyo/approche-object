package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne set = new CalculMoyenne();
        set.ajout(1.0);
        set.ajout(2.0);
        set.ajout(7.0);

        CalculMoyenne payments = new CalculMoyenne();
        payments.ajout(1978.0);
        payments.ajout(734.0);
        payments.ajout(30843.98);

        double average = set.calcul();
        double paymentAverage = payments.calcul();

        System.out.printf("The average of 1.0, 2.0, and 7.0 is %.2f%n", average);
        System.out.printf("The average of 1978.0, 734.0, and 30843.98 is %.2f", paymentAverage);
    }
}
