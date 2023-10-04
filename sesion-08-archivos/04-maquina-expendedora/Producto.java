
public class Producto {
  private String marca;
  private double precio;
  private String codigo;

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Producto(String codigo, String marca, double precio) {
    this.codigo = codigo;
    this.marca = marca;
    this.precio = precio;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

}
