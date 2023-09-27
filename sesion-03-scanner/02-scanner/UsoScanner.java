import java.util.Scanner;

// stdin: Standard Input
// stdout: Standard Output

public class UsoScanner {
  public static void main(String... args) {
    // Creando una instancia de la clase Scanner
    // donde los datos de entrada son el stdin
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cuál es tu nombre?:");
    String nombre = sc.nextLine();

    System.out.println("Hola " + nombre);

    // Cierra el flujo de datos de Scanner
    sc.close();
  }
}
