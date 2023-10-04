import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerArchivo {

  public static void main(String... args) {

    try {
      // System.out.println(System.getProperty("user.home"));
      File archivo = new File("./archivos/hello-world.txt");
      FileReader reader = new FileReader(archivo);
      BufferedReader bufferedReader = new BufferedReader(reader);

      String line = bufferedReader.readLine();
      System.out.println(line);

      // Cierra la conexión con el archivo
      bufferedReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error: El archivo no existe");
    } catch (IOException e) {
      System.out.println("Error: Ocurrió un problema en la lectura del archivo...");
    }
  }
}
