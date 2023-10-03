import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class CalculadoraPrimos {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> primos = new LinkedList<Integer>();

    System.out.println("¿Cuántos números primos tengo que calcular?:");
    int n = sc.nextInt();
    sc.nextLine();

    int numeroActual = 2;

    do {
      boolean esPrimo = true;

      for (int i = 2; i < numeroActual; i++) {
        if (numeroActual % i == 0) {
          esPrimo = false;
          break;
        }
      }

      if (esPrimo) {
        primos.add(numeroActual);
      }

      numeroActual++;
    } while (primos.size() < n);

    System.out.println("Resultado: " + Arrays.toString(primos.toArray()));
  }
}
