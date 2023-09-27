import java.util.Scanner;

public class Calculadora {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    boolean continuar = false;

    System.out.println("💬 Ingresa el número inicial:");

    long total = sc.nextLong();
    sc.nextLine(); // Forzar al scanner a volver a recibir un dato

    do {
      System.out.println("\n💬 Elige la operación a realizar:");
      System.out.println("a) Sumar");
      System.out.println("b) Restar");
      System.out.println("c) Multiplicar");

      String opcion = sc.nextLine();
      long numero = 0;

      switch (opcion) {
        case "a":
        case "b":
        case "c":
          System.out.println("\n💬 Ingresa el número a operar:");
          numero = sc.nextLong();
          sc.nextLine();
          break;
      }

      switch (opcion) {
        case "a":
          total = numero + total;
          break;

        case "b":
          total = total - numero;
          break;

        case "c":
          total = numero * total;
          break;

        default:
          System.out.println("\n❌ La opción seleccionada es incorrecta");
      }

      System.out.println("\n✅ El resultado es: " + total);

      System.out.println("\n⚠ ¿Deseas continuar? (s/n):");

      opcion = sc.nextLine();

      switch (opcion) {
        case "s":
          continuar = true;
          break;
        default:
          continuar = false;
          System.out.println("Fin.");
      }
    } while (continuar);

    sc.close();
  }
}
