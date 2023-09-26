public class TipoDeTriangulo {

  public static void main(String... args) {
    double lado1 = 10;
    double lado2 = 10;
    double lado3 = 10;

    // Dados las variables lado1, lado2 y lado3, evaluar
    // si se trata de un triangulo isósceles, escaleno, equilatero.

    // Isósceles: Dos lados coinciden y uno no.
    // Equilatero: Tres lados coinciden
    // Escaleno: Ninguno coincide
    if (lado1 == lado2 && lado2 == lado3) {
      System.out.println("Triángulo Equilatero");
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
      System.out.println("Triángulo Isósceles");
    } else {
      System.out.println("Triángulo Escaleno");
    }
  }
}
