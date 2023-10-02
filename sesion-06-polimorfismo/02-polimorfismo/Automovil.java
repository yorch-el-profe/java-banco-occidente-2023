public class Automovil extends Vehiculo {
  private int puertas;

  public Automovil(String marca, String modelo, int puertas) {
    super(marca, modelo);
    this.puertas = puertas;
  }

  public int getPuertas() {
    return puertas;
  }

  public void setPuertas(int puertas) {
    this.puertas = puertas;
  }

  @Override
  public String toString() {
    return super.toString() + ", puertas: " + puertas;
  }
}
