public class Persona {
  private String nombre;
  private int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public boolean equals(Object obj) {
    // Si no coinciden las clases, no son iguales
    if (obj.getClass() != getClass()) {
      return false;
    }

    Persona persona = (Persona) obj;
    return persona.getNombre().equals(nombre) && persona.getEdad() == edad;
  }
}
