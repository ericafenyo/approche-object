package fr.diginamic.recensement.exceptions;

public class IllegalNumberArgumentException extends RuntimeException {

  public IllegalNumberArgumentException() {
    super("The value entered is not a number");
  }

  public IllegalNumberArgumentException(String message) {
    super(message);
  }
}
