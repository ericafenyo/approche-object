package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
  public static void main(String[] args) throws IOException {
    // Path to csv file
    Path csvPath = Paths.get("./src/main/java/fichier/assets/recensement.csv");

    if (Files.exists(csvPath)) {
      List<String> rows = Files.readAllLines(csvPath);

      // Dans ce fichier extraire les 100 premières lignes du fichier recensement.
      List<String> first10rows = rows.subList(1, 101);
      Path csv100Path = Paths.get("./src/main/java/fichier/assets/recensement_100.csv");

      //Générez un fichier contenant ces 100 premières lignes
      Files.write(csv100Path, first10rows);


      // Dans la méthode main, lisez le contenu du fichier et affichez son contenu.
      System.out.println("CSV file contents:");
      for (String row : rows) {
        System.out.println(row);
      }
    }
  }
}
