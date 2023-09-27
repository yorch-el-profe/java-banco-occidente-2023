import java.util.Scanner;

public class Calculadora {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("💬 Ingresa el número inicial:");

    long total = sc.nextLong();
    sc.nextLine(); // Forzar al scanner a volver a recibir un dato

    System.out.println("\n💬 Elige la operación a realizar:");
    System.out.println("a) Sumar");
    System.out.println("b) Restar");
    System.out.println("c) Multiplicar");

    String opcion = sc.nextLine();

    switch (opcion) {
      case "a":
        System.out.println("\n💬 Ingresa el número a operar:");
        long numero = sc.nextLong();
        sc.nextLine();
        total = numero + total;
        break;

      case "b":
        System.out.println("\n💬 Ingresa el número a operar:");
        long numero2 = sc.nextLong();
        sc.nextLine();
        total = total - numero2;
        break;

      case "c":
        System.out.println("\n💬 Ingresa el número a operar:");
        long numero3 = sc.nextLong();
        sc.nextLine();
        total = numero3 * total;
        break;

      default:
        System.out.println("\n❌ La opción seleccionada es incorrecta");
    }

    System.out.println("\n✅ El resultado es: " + total);

    sc.close();
  }
}
