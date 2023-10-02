
/*
 * Implementar una mejora en la solución de la secuencia de fibonacci
 * de tal forma que dado un número n, regresar los primeros n números 
 * de la secuencia
 * 
 * Secuencia: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 * 
 * fibo(4) = [1, 1, 2, 3]
 * fibo(8) = [1, 1, 2, 3, 5, 8, 13, 21]
 */
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciPro {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa el número para calcular la secuencia:");
    int n = sc.nextInt();
    sc.nextLine();

    int total = 1;
    int anterior = 0;
    int[] secuencia = new int[n];

    secuencia[0] = total;

    for (int i = 2; i <= n; i++) {
      int temporal = anterior + total;
      anterior = total;
      total = temporal;

      secuencia[i - 1] = total;
    }

    System.out.println("Secuencia de fibonacci: " + Arrays.toString(secuencia));

    sc.close();
  }
}
