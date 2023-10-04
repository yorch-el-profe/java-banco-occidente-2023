import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class EscrituraArchivo {
  public static void main(String... args) {
    try {
      // Si el constructor recibe true como segundo parámetro
      // agrega las líneas al contenido ya existe
      FileWriter writer = new FileWriter("./archivos/output.txt", Charset.forName("utf-8"), true);
      BufferedWriter bufferedWriter = new BufferedWriter(writer);

      bufferedWriter.write("Escribiendo en el archivo!!!!");
      bufferedWriter.newLine();
      bufferedWriter.write("Escribiendo otra línea :D");

      bufferedWriter.close();
    } catch (IOException e) {
      System.out.println("Ocurrió un error en la escritura del archivo...");
    }
  }
}
