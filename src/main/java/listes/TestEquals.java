package listes;

public class TestEquals {
  public static void main(String[] args) {
    Ville a = new Ville("Nice", 343_000L);
    Ville b = new Ville("Nice", 343_000L);

    System.out.println("Given two city objects; a and b, with the same attributes");
    System.out.println("a.equals(b) : " + a.equals(b));

    System.out.println("---------------------------------------------------------------");

    System.out.println("Given two city objects; a and b, with the same attributes");
    System.out.println("a == b : " + (a == b));

    System.out.println("---------------------------------------------------------------");

    System.out.println("Comment faire pour que la comparaison de 2 villes avec l’opérateur == retourne true");
    System.out.println("Set 'b' to be equals to the instance of 'a'");
    System.out.println("Ville a = new Ville(\"Nice\", 343_000L);\n" +
        "Ville b = a;");
  }
}
