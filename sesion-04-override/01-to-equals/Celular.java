
public class Celular {
  private long numero;

  public Celular(long numero) {
    this.numero = numero;
  }

  public long getNumero() {
    return numero;
  }

  public void setNumero(long numero) {
    this.numero = numero;
  }

  // Sobreescritura de método
  @Override
  public boolean equals(Object obj) {
    // Casting o conversión de tipos
    Celular celular = (Celular) obj;
    return numero == celular.getNumero();
  }
}
