/*
 * Todos los atributos/métodos publicos y protegidos
 * son heredados a la clase hijo.
 */
public class TarjetaDebito extends Tarjeta {
  private double saldo;

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public TarjetaDebito(String pin, String numero, double saldo) {
    super(pin, numero);
    this.saldo = saldo;
  }

  public TarjetaDebito(String pin, String numero, String numeroVirtual, double saldo) {
    super(pin, numero, numeroVirtual);
    this.saldo = saldo;
  }

  // Sobreescribe el toString de Tarjeta
  @Override
  public String toString() {
    return super.toString() + ", saldo: " + saldo;
  }
}
