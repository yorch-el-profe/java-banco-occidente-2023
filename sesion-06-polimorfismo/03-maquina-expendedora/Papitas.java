
public class Papitas extends Producto {
  private String sabor;
  private int peso;

  public Papitas(String codigo, String marca, double precio, String sabor, int peso) {
    super(codigo, marca, precio);
    this.sabor = sabor;
    this.peso = peso;
  }

  public String getSabor() {
    return sabor;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

}
