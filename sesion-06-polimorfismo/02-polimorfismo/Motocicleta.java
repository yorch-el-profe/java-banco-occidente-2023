
public class Motocicleta extends Vehiculo {
  private String tipo;

  public Motocicleta(String marca, String modelo, String tipo) {
    super(marca, modelo);
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
