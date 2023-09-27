import java.util.Scanner;

public class Fibonacci {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cuál es el número de la secuencia que quieres calcular?:");

    int n = sc.nextInt();

    long total = 1l;

    long anterior = 0l;

    for (int i = 2; i <= n; i++) {
      long temporal = anterior + total;
      anterior = total;
      total = temporal;
    }

    System.out.println("El #" + n + " en la secuencia de fibonacci es: " + total);

    sc.close();
  }
}
