import java.util.Stack;

/*
 * LIFO (Last In First Out)
 * 
 * En una pila el último elemento que se agrega es el primero que se obtiene.
 * A diferencia de las listas, no se puede acceder a un sistema posicional.
 * 
 * Pila:
 * 30 <--
 * 20
 * 10
 * 
 * Time Complexity:
 * push(): O(1)
 * peek(): O(1)
 * pop(): O(1)
 */

public class Pilas {
  public static void main(String... args) {
    Stack<Integer> pila = new Stack<Integer>();

    // Agregar un elemento a la pila
    pila.push(10);
    pila.push(20);
    pila.push(30);

    // Permite leer el último elemento de la pila
    System.out.println("peek(): " + pila.peek()); // 30

    // Permite leer y eliminar el último elemento de la pila
    System.out.println("pop(): " + pila.pop()); // 30
    System.out.println("pop(): " + pila.pop()); // 20
    System.out.println("pop(): " + pila.pop()); // 10
  }
}
