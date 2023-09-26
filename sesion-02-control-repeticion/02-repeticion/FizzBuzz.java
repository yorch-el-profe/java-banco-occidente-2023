/* 
  Dada una secuencia de números del 1 al 100, indicar los siguientes casos:

  Si el número es un múltiplo de 3, escribir "Fizz"
  Si el número es un múltiplo de 5, escribir "Buzz"
  Si el número es un múltiplo de 3 y 5, escribir "FizzBuzz"
  En otro caso, escribir el número tal cual.
*/

public class FizzBuzz {
  public static void main(String... args) {
    for (int i = 1; i <= 100; i++) {
      // El número "i" es divisible entre 3 y 5
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz (" + i + ")");
      }
      // El número "i" es divisible entre 3
      else if (i % 3 == 0) {
        System.out.println("Fizz (" + i + ")");
      }
      // El número "i" es divisible entre 5
      else if (i % 5 == 0) {
        System.out.println("Buzz (" + i + ")");
      } else {
        System.out.println(i);
      }
    }
  }
}
