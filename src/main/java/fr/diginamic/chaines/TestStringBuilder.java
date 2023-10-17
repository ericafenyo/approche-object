package fr.diginamic.chaines;

public class TestStringBuilder {
  public static void main(String[] args) {
    StringBuilder a = new StringBuilder();
    long aDebut = System.currentTimeMillis(); // Code à chronométrer
    for (int i = 1; i <= 100_000; i++) {
      a.append(i);
    }

    long aElapse = System.currentTimeMillis() - aDebut;
    System.out.println("String Builder:" + aElapse);

    System.out.println("------------------");
    String b = "";
    long bDebut = System.currentTimeMillis(); // Code à chronométrer
    for (int i = 1; i <= 100_000; i++) {
      b += i;
    }

    long bElapse = System.currentTimeMillis() - bDebut;
    System.out.println("String Concat:" + bElapse);
  }
}
