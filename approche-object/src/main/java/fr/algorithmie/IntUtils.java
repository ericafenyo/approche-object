package fr.algorithmie;

import java.util.Random;

public class IntUtils {

    public static int random(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
