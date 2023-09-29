
public class TarjetaCredito extends Tarjeta {
  private double credito;
  private int puntos;

  public double getCredito() {
    return credito;
  }

  public void setCredito(double credito) {
    this.credito = credito;
  }

  public int getPuntos() {
    return puntos;
  }

  public void setPuntos(int puntos) {
    this.puntos = puntos;
  }

  public TarjetaCredito(String pin, String numero, String numeroVirtual, double credito) {
    // En el constructor de las clases hijo
    // La primer línea SIEMPRE debe ser una llamada a super();
    super(pin, numero, numeroVirtual);
    this.credito = credito;
  }

  public TarjetaCredito(String pin, String numero, String numeroVirtual, double credito, int puntos) {
    this(pin, numero, numeroVirtual, credito);
    this.puntos = puntos;
  }

  // Sobreescribe el toString de Tarjeta
  @Override
  public String toString() {
    return super.toString() + ", credito: " + credito + ", puntos: " + puntos;
  }
}
