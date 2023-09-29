/*
 * Una clase abstracta es una clase "incompleta", es decir,
 * existen métodos cuya implementación queda "pendiente" porque depende
 * de las clases hijo.
 * 
 * Por lo tanto no se puede crear una instancia de la clase abstracta.
 */

public abstract class Figura {
  protected String nombre;

  public Figura(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public abstract double calcularArea();
}
