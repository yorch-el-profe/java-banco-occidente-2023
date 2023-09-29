/*
 * Cuando una clase implementa al menos un constructor,
 * renuncia al constructor vacío de la clase padre.
 * 
 * El único constructor que se hereda cuando una clase hijo no tiene constructores, es el constructor vacío.
 */

public class Perro extends Animal {
  private String nombre;

  @Override
  public String toString() {
    return super.toString() + ", nombre: " + nombre;
  }
}
