
/*
 * Es implementar un algoritmo que dada una secuencia de parentesis
 * indique cuántos faltan para que la secuencia este balanceada.
 * 
 * ( -> falta 1 parentesis para que este balanceado
 * () -> 0
 * ()() -> 0
 * ((()) -> 1
 * ((()())(((()())))((())))() -> 0
 */
import java.util.Scanner;

public class BalanceoParentesis {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa una secuencia de parentesis:");
    String secuencia = sc.nextLine();

    for (int i = 0; i < secuencia.length(); i++) {
      char parentesis = secuencia.charAt(i);
    }
  }
}
