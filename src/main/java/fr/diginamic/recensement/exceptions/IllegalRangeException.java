package fr.diginamic.recensement.exceptions;

public class IllegalRangeException extends RuntimeException {
  public IllegalRangeException() {
    super("The min value cannot be greater than the max value");
  }

  public IllegalRangeException(String message) {
    super(message);
  }
}
