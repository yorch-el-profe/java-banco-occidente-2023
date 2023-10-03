import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Wrapper class: Son clases que representan tipos de datos primitivos.
 * int -> Integer
 * double -> Double
 * boolean -> Boolean
 * 
 * Para los tipos genéricos sólo se pueden utilizar clases.
 * 
 * Una lista es una secuencia de "nodos" en la cual se almacenan valores
 * y no tiene un tamaño determinado.
 * 
 * (10.4) -> (50.643) -> (30) -> (-1.234) -> null
 */

public class Listas {
  public static void main(String... args) {
    double[] array = new double[10];

    // Un array es prácticamente un arreglo con el comportamiento de una lista
    List<Double> arrayList = new ArrayList<Double>();

    arrayList.add(10.4); // 0
    arrayList.add(50.643); // 1
    arrayList.add(30d); // 2
    arrayList.add(-1.234); // 3

    // En un ArrayList la lectura de datos es muy rápida
    arrayList.get(2); // 30.0

    // En un ArrayList la eliminación es bastante ineficiente
    arrayList.remove(3);

    // ArrayList es bastante ineficiente.
    // La única ventaja es el acceso posicional de los arreglos.

    List<String> lista = new LinkedList<String>();

    // ("Hello World") -> ("Good Bye") -> ("Bedu") -> null
    lista.add("Hello World");
    lista.add("Good Bye");
    lista.add("Bedu");

    // En una lista la lectura de datos es un poco ineficiente
    lista.get(1); // "Good Bye"

    // En una lista la eliminación es un poco más eficiente
    lista.remove(2);

    // Conocer el tamaño que tiene la lista
    lista.size();

    // Existe un elemento en la lista
    lista.contains("Hello World"); // true
  }
}
