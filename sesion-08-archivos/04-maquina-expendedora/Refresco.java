
public class Refresco extends Producto {
  private String sabor;

  public Refresco(String codigo, String marca, double precio, String sabor) {
    super(codigo, marca, precio);
    this.sabor = sabor;
  }

  public String getSabor() {
    return sabor;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }
}
