import java.util.Scanner;
import java.util.Stack;

public class Palindromo {

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);

    Stack<Character> pila = new Stack<Character>();

    System.out.println("Ingresa una palabra:");
    String palabra = sc.nextLine();

    for (int i = 0; i < palabra.length(); i++) {
      char actual = palabra.charAt(i);
      pila.push(actual);
    }

    boolean esPalindromo = true;

    for (int i = 0; i < palabra.length(); i++) {
      if (palabra.charAt(i) != pila.pop()) {
        esPalindromo = false;
        break;
      }
    }

    if (esPalindromo) {
      System.out.println("Es un palindromo");
    } else {
      System.out.println("No es un palindromo");
    }
  }
}
