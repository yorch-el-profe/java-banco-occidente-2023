/**
 * Todas las clases heredan (por default) de Object
 */

public class Tarjeta {
  protected String pin;
  protected String numero;
  protected String numeroVirtual;

  public String getNumeroVirtual() {
    return numeroVirtual;
  }

  public void setNumeroVirtual(String numeroVirtual) {
    this.numeroVirtual = numeroVirtual;
  }

  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public Tarjeta(String pin, String numero) {
    this.pin = pin;
    this.numero = numero;
  }

  public Tarjeta(String pin, String numero, String numeroVirtual) {
    // Invocando un constructor interno
    this(pin, numero);
    this.numeroVirtual = numeroVirtual;
  }

  // Sobreescribe el toString de Object
  @Override
  public String toString() {
    return "pin: " + pin + ", numero: " + numero + ", numeroVirtual: " + numeroVirtual;
  }
}