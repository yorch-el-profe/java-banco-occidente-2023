
public class Pastelito extends Producto {
  private String sabor;
  private boolean tieneRelleno;

  public Pastelito(String codigo, String marca, double precio, String sabor, boolean tieneRelleno) {
    super(codigo, marca, precio);
    this.sabor = sabor;
    this.tieneRelleno = tieneRelleno;
  }

  public boolean isTieneRelleno() {
    return tieneRelleno;
  }

  public void setTieneRelleno(boolean tieneRelleno) {
    this.tieneRelleno = tieneRelleno;
  }

  public String getSabor() {
    return sabor;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }
}
