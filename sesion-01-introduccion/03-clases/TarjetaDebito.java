public class TarjetaDebito {

  private String numeroTarjeta;
  private double saldo;

  // Getters y Setters
  // Son métodos que leen/modifican un atributo privado para aplicar la
  // Encapsulación.

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double nuevoSaldo) {
    saldo = nuevoSaldo;
  }

  public String getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public void setNumeroTarjeta(String nuevoNumeroTarjeta) {
    numeroTarjeta = nuevoNumeroTarjeta;
  }
}
