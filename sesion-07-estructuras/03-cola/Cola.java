import java.util.Queue;
import java.util.LinkedList;

/*
 * FIFO (First In, First Out)
 * 
 * El primer elemento que entra a la cola es el primero que sale.
 */
public class Cola {
  public static void main(String... args) {
    Queue<String> cola = new LinkedList<String>();

    // add() -> Agregar elementos a la cola
    cola.add("Primer elemento");
    cola.add("Segundo elemento");
    cola.add("Tercer elemento");

    // peek() -> Leer el primer elemento de la cola
    System.out.println("peek(): " + cola.peek());

    // poll() -> Lee y elimina el primer elemento de la cola
    System.out.println("poll(): " + cola.poll());
    System.out.println("poll(): " + cola.poll());
    System.out.println("poll(): " + cola.poll());
  }
}
