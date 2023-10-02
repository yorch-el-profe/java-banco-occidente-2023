
public class MaquinaExpendedora {
  private Producto[] productos;

  public MaquinaExpendedora() {
    productos = new Producto[5];
  }

  public void rellenarMaquina() {
    productos[0] = new Papitas("P001", "Margaritas", 2000, "Sal", 30);
    productos[1] = new Refresco("P002", "Coca-Cola", 4500, "Cola");
    productos[2] = new Pastelito("P003", "Ramo", 2500, "Chocolate", false);
    productos[3] = new Refresco("P004", "Pepsi", 4500, "Cola");
    productos[4] = new Papitas("P005", "Margaritas", 2000, "Pollo", 30);
  }
}
