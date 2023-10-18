package fr.diginamic.testenumeration;

import java.util.Arrays;

public enum Saison {
  PRINTEMPS("Printemps", 1),
  ETE("Eté", 2),
  AUTOMNE("Automne", 3),
  HIVER("Hiver", 4);

  private String libelle;
  private int numero;

  Saison(String libelle, int numero) {
    this.libelle = libelle;
    this.numero = numero;
  }

  public static Saison  findByLabel(String label) {
    for (Saison element : values()) {
      if (label.equalsIgnoreCase(element.libelle)) {
        return element;
      }
    }

    throw new IllegalArgumentException("Label is not supported: " + label);
  }

  public String libelle() {
    return libelle;
  }

  public int numero() {
    return numero;
  }
}
