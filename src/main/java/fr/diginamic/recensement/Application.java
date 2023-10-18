package fr.diginamic.recensement;

import fr.diginamic.recensement.commands.Menu;

public class Application {
  public static void main(String[] args) {
    try {
      Menu.displayOptions();
    } catch (RuntimeException exception) {
      System.out.println("Error: " + exception.getMessage());
    }
  }
}
