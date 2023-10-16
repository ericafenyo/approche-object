package listes;


import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {
  public static void main(String[] args) {
    ArrayList<Ville> cities = new ArrayList<>();
    cities.add(new Ville("Nice", 343_000L));
    cities.add(new Ville("Carcassonne", 47_800L));
    cities.add(new Ville("Narbonne", 53_400L));
    cities.add(new Ville("Lyon", 484_000L));
    cities.add(new Ville("Foix", 9_700L));
    cities.add(new Ville("Pau", 77_200L));
    cities.add(new Ville("Marseille", 850_700L));
    cities.add(new Ville("Tarbes", 40_600L));

    Long max = 0L;
    Ville maxCity = null;
    for (Ville city : cities) {
      if (city.getPopulation() > max) {
        max = city.getPopulation();
        maxCity = city;
      }
    }

    System.out.println("The city with the largest population is: " + maxCity.getName());
    System.out.println();

    Long min = Long.MAX_VALUE;
    Ville minCity = null;
    for (Ville city : cities) {
      if (city.getPopulation() < min) {
        min = city.getPopulation();
        minCity = city;
      }
    }

    System.out.println("The city with the smallest population is: " + minCity.getName());
    System.out.println("Deleting it");
    cities.remove(minCity);

    // Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules

    Iterator<Ville> iterator = cities.iterator();
    while (iterator.hasNext()) {
      Ville element = iterator.next();
      if (element.getPopulation() > 100_000) {
        int index = cities.indexOf(element);
        element.setName(element.getName().toUpperCase());
        cities.set(index, element);
      }
    }

    // Affichez enfin la liste résultante
    for (Ville city : cities) {
      System.out.println(city);
    }
  }



}
