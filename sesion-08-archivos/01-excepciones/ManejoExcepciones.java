import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepciones {

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa un número:");

    try {
      int input = sc.nextInt();
      sc.nextLine();

      if (input < 0) {
        // Lanzando una excepción de manera manual
        // Todas las excepciones pueden llevar un mensaje
        throw new NegativeNumberException();
      }

      System.out.println("Número ingresado: " + input);
    } catch (InputMismatchException e) {
      System.out.println("Error: El formato del número es inválido...");
    } catch (NegativeNumberException e) {
      System.out.println("Error Custom: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Error: Ocurrió un error inesperado...");
    }
  }
}
