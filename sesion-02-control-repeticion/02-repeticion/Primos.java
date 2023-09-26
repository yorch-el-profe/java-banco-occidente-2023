/*
  Un número primo es aquel que únicamente es divisible por sí mismo y la unidad (1).
  Ejemplos: 2, 3, 5, 7, 11, 13, 23, etc...

  Es un hecho que cualquier número es divisible entre sí mismo y la unidad (1).
  x/x = 1,   x/1 = x
 */

public class Primos {
  public static void main(String... args) {
    int n = 104297;
    boolean esPrimo = true;

    // Encontrar un número diferente de sí mismo y la unidad
    // que divida a n
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        System.out.println("El número " + n + " es divisible por " + i);
        esPrimo = false;
        // "break" es un ciclo (for, while) se utiliza
        // para finalizarlo.
        break;
      }
    }

    if (esPrimo) {
      // Si no se encuentra un número "i" que divida a "n"
      // entonces el número "n" es primo.
      System.out.println("Por lo tanto, el número " + n + " es primo");
    } else {
      System.out.println("Por lo tanto, el número " + n + " no es primo");
    }
  }
}
