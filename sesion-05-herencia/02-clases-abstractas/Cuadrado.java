/*
 * Las clases hijo de una clase abstracta
 * deben implementar de manera OBLIGATORIA
 * todos los métodos abstractos de la clase padre.
 * 
 * Si no se llegara a implementar por lo menos un 
 * menos un método abstracto entonces la clase se 
 * convierte en abstracta.
 */

public class Cuadrado extends Figura {
  private double lado;

  public Cuadrado(double lado) {
    super("Cuadrado");
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    return lado * lado;
  }
}
