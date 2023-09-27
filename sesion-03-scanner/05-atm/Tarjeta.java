public class Tarjeta {
  private String pin;
  private long saldo;

  /*
   * Un constructor es un método especial, que tiene el mismo nombre de la clase y
   * que por lo general sirve para dar valores iniciales a un objeto.
   * 
   * El constructor también puede tener niveles acceso (public, private y
   * protected)
   * 
   * "this" hace referencia a los atributos y métodos dentro del mismo objeto.
   */
  public Tarjeta(String pin, long saldo) {
    this.pin = pin;
    this.saldo = saldo;
  }

  public String getPin() {
    return pin;
  }

  public long getSaldo() {
    return saldo;
  }

  public void setSaldo(long saldo) {
    if (saldo >= 0) {
      this.saldo = saldo;
    }
  }
}
