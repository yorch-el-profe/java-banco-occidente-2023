
public class Vendedor extends Empleado {
  private double comision;
  private int ventas;

  public Vendedor(String nombre, double sueldoBase, double comision, int ventas) {
    super(nombre, sueldoBase);
    this.comision = comision;
    this.ventas = ventas;
  }

  public double getComision() {
    return comision;
  }

  public void setComision(double comision) {
    this.comision = comision;
  }

  public int getVentas() {
    return ventas;
  }

  public void setVentas(int ventas) {
    this.ventas = ventas;
  }

  @Override
  public double calcularSueldo() {
    return super.getSueldoBase() + (comision * ventas);
  }
}
