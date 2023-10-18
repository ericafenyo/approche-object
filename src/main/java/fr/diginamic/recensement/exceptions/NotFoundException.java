package fr.diginamic.recensement.exceptions;

public class NotFoundException extends RuntimeException {
  public NotFoundException() {
    super("The resource demanded is not found");
  }

  public NotFoundException(String message) {
    super(message);
  }
}
