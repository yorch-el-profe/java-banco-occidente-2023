
public class Arreglos {
  public static void main(String... args) {

    /*
     * Un arreglo de tamaño N permite almacenar varios valores (a lo más N)
     * de un mismo tipo.
     * 
     * Sintaxis:
     * tipo[] variable = new tipo[n];
     * 
     * Los arreglos son de tamaño fijo y su acceso a los datos es posicional.
     * Las posiciones empiezan a partir del 0.
     */
    int[] numeritos = new int[3];
    double[] numerosAleatorios = { 2.56, 3.1416, 69.293, 40.1898 };

    numeritos[0] = 90123;
    numeritos[1] = 8971;
    numeritos[2] = 889817;

    System.out.println("La longitud del arreglo: " + numeritos.length);

    // Iterando un arreglo por su sistema posicional
    for (int i = 0; i < numerosAleatorios.length; i++) {
      System.out.println("numerosAleatorios[" + i + "] = " + numerosAleatorios[i]);
    }

    // Iterando un arreglo por sus elementos (foreach)
    // Se desconoce la posición del elemento que se está iterando.
    /*
     * Sintaxis de un foreach
     * 
     * for (tipo variable : arreglo) {
     * }
     */
    for (int numero : numeritos) {
      System.out.println(numero);
    }

    // Accede a la segunda posición
    System.out.println(numerosAleatorios[1]);
  }
}
