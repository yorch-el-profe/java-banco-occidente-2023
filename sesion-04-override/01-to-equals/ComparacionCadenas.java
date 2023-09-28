
public class ComparacionCadenas {
  public static void main(String... args) {
    String cadena1 = "Hola Mundo";
    String cadena2 = "Hola Mundo";
    String cadena3 = new String("Hola Mundo");

    // ==: Compara referencias
    if (cadena1 == cadena2) {
      System.out.println("cadena1 y cadena2 coinciden por referencia");
    }

    // false: cadena3 tiene una refencia completamente diferente
    // Nota: new crear una nueva referencia siempre :)
    if (cadena1 == cadena3) {
      System.out.println("cadena1 y cadena3 coinciden por referencia");
    }

    // equals compara el contenido independientemente de la referencia
    if (cadena1.equals(cadena3)) {
      System.out.println("cadena1 y cadena3 coinciden por contenido");
    }
  }
}
