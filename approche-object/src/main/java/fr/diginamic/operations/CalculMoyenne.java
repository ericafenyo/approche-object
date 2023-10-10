package fr.diginamic.operations;

import fr.utils.ArraysUtils;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] instance = new double[0];

    public void ajout(double element) {
        int size = this.instance.length + 1;
        double[] accumulator = Arrays.copyOf(this.instance, size);
        accumulator[size - 1] = element;
        this.instance = accumulator;
    }

    public double calcul() {
        return ArraysUtils.sum(this.instance) / 2.0;
    }
}
