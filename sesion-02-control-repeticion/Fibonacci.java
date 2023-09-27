/*
  Secuencia de fibonacci: 1, 1, 2, 3, 5, 8, 13, 21, 34

  fibo(n) = fibo(n-1) + fibo(n-2)

  Problema:
  Encontrar el n-ésimo número en la secuencia de fibonacci.

  fibonacci(3) = 2
  fibonacci(8) = 21
 */
public class Fibonacci {
  public static void main(String... args) {
    // El número de la secuencia que se quiere obtener
    long n = 100l;

    // almacena la suma total
    long total = 1l;

    // almacena la iteración anterior
    long anterior = 0l;

    for (int i = 2; i <= n; i++) {
      long temporal = anterior + total;
      anterior = total;
      total = temporal;
    }

    System.out.println("El #" + n + " en la secuencia de fibonacci es: " + total);
  }
}
