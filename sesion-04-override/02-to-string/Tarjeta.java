public class Tarjeta {
  private String pin;
  private long saldo;
  private String numero;

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public long getSaldo() {
    return saldo;
  }

  public void setSaldo(long saldo) {
    this.saldo = saldo;
  }

  public Tarjeta(String pin, long saldo, String numero) {
    this.pin = pin;
    this.saldo = saldo;
    this.numero = numero;
  }

  @Override
  // Por defecto muchos métodos llaman toString() sin parámetro
  public String toString() {
    return "Tarjeta: pin = " + pin + ", saldo = $" + saldo;
  }

  // Sobrecarga del método toString
  public String toString(String algo) {
    return toString() + ", extra = " + algo;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass() != getClass()) {
      return false;
    }

    Tarjeta tarjeta = (Tarjeta) obj;

    return numero.equals(tarjeta.getNumero());
  }

  // Sobrecarga de métodos
  // Es un método ya existe pero con
  // parámetros diferentes (cantidad o tipo)
  public boolean equals(TarjetaCredito credito) {
    return numero.equals(credito.getNumero());
  }
}
