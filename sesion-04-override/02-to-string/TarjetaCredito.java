
public class TarjetaCredito {
  private long credito;
  private String pin;
  private String numero;

  public long getCredito() {
    return credito;
  }

  public void setCredito(long credito) {
    this.credito = credito;
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

  public TarjetaCredito(long credito, String pin, String numero) {
    this.credito = credito;
    this.pin = pin;
    this.numero = numero;
  }
}
