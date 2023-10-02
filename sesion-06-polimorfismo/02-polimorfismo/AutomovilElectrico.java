
public class AutomovilElectrico extends Automovil {
  private double capacidadBateria;

  public AutomovilElectrico(String marca, String modelo, int puertas, double capacidadBateria) {
    super(marca, modelo, puertas);
    this.capacidadBateria = capacidadBateria;
  }

  public double getCapacidadBateria() {
    return capacidadBateria;
  }

  public void setCapacidadBateria(double capacidadBateria) {
    this.capacidadBateria = capacidadBateria;
  }

  @Override
  public String toString() {
    return super.toString() + ", capacidadBateria: " + capacidadBateria;
  }
}
