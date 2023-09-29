public class Animal {
  private String nombre;
  private String sonido;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getSonido() {
    return sonido;
  }

  public void setSonido(String sonido) {
    this.sonido = sonido;
  }

  public Animal(String nombre, String sonido) {
    this.nombre = nombre;
    this.sonido = sonido;
  }
}
