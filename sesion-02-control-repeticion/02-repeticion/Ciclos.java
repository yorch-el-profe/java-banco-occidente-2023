public class Ciclos {
  public static void main(String... args) {
    /*
     * while: Es un bloque de código que se va a repetir
     * hasta que la condición deje de cumplirse.
     */
    int edad = 0;

    while (edad < 30) {
      System.out.println("La persona sigue siendo joven con: " + edad + " años");
      // edad = edad + 1;
      edad++;
    }

    /*
     * doWhile: Es exactamente lo mismo que while pero el ciclo se ejecuta
     * por lo menos una vez.
     */

    do {
      System.out.println("Edad: " + edad);
      edad++;
    } while (edad < 60);

    /*
     * for: Permite tener un mayor control sobre las iteraciones que se van
     * a realizar.
     */
    for (int i = 0; i <= 20; i++) {
      System.out.println("Valor de i: " + i);
    }
  }
}
