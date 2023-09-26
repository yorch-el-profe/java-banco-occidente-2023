public class SentenciasControl {

  public static void main(String... args) {
    /*
     * If: Sentencia que control en la cuál, a partir de una guardia
     * se toma la decisión de continuar o no con un bloque de código
     */

    int edad = 80;

    // Constantes (definir valores fijos)
    // Las variables "final" no pueden modificarse su valor
    // y por convención son en mayúsculas.
    final String DULCES = "Dulces";
    final String FIESTA = "Fiesta";
    final String DORMIR = "Siesta";
    final String VIAJAR = "Viajar";

    // Las variables en Java pueden no tener un valor inicial.
    String gustos;

    // La guardia es una expresión booleana. Se los siguientes operadores:
    // > (mayor que), < (menor que), >=, <=, == (igualidad), ! (negación), !=
    // (diferencia)

    // A todo código entre {} se le llama bloque de código

    // else if: Permite ejecutar otra guardia si es que la anterior falla.
    // else: Si no se cumple cualquier guardia anterior.

    if (edad < 18) {
      gustos = DULCES;
    } else if (edad >= 18 && edad < 30) {
      gustos = FIESTA;
    } else if (edad >= 30 && edad < 60) {
      gustos = DORMIR;
    } else {
      gustos = VIAJAR;
    }

    /*
     * Switch: Evalua una variable/valor y lo compara con distintos casos
     */
    switch (gustos) {
      case DULCES:
        System.out.println("Nucita");
        // break detiene la ejecución del switch.
        break;

      case FIESTA:
        System.out.println("Cerveza");
        System.out.println("Chicha");
        break;

      case DORMIR:
        System.out.println("Motoso");
        break;

      case VIAJAR:
        System.out.println("Por todo el mundo");
        break;

      // Es como si fuera un "else"
      default:
        System.out.println("Desconozco tus gustos...");
    }
  }
}
