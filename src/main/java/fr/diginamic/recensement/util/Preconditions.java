package fr.diginamic.recensement.util;

public class Preconditions {

  public static boolean isInteger(String value) {
    try {
      Integer.parseInt(value);
      return true;
    } catch (NumberFormatException exception) {
      return false;
    }
  }

  public static boolean withinRange(int value, int min, int max) {
    return (value >= 1 && value <= 9);
  }
}
