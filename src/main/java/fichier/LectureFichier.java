package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureFichier {
  public static void main(String[] args) throws IOException {
    // Path to csv file
    Path csvPath = Paths.get("./src/main/java/fichier/assets/recensement.csv");

    if (Files.exists(csvPath)) {

      List<String> rows = Files.readAllLines(csvPath);

//       Dans la méthode main, lisez le contenu du fichier et affichez son contenu.
      System.out.println("CSV file contents:");
      for (String row : rows) {
        System.out.println(row);
      }

      //
      ArrayList<Ville> cities = new ArrayList<>();
      List<String> cityRows = rows.subList(1, rows.size());

      for (String row : cityRows) {
        String[] fragments = row.split(";");
        String region = fragments[1];
        String code = fragments[2];
        String nom = fragments[6];
        String population = fragments[fragments.length - 1];
        Ville city = new Ville(nom, code, region, population);
        cities.add(city);
      }

      List<String> draft = new ArrayList<>();
      String headings = String.format("%s;%s;%s;%s", "Nom", "Code département", "Nom de la région", "Population totale");
      draft.add(headings);
      for (Ville city : cities) {
        if (Long.parseLong(city.getPopulation()) > 25_000) {
          String line = String.format("%s;%s;%s;%s", city.getNom(), city.getCode(), city.getRegion(), city.getPopulation());
          draft.add(line);
        }
      }

      Path citiesPath = Paths.get("./src/main/java/fichier/assets/villes.csv");
      Files.write(citiesPath, draft);
    }
  }
}
