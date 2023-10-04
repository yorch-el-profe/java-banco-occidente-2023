import java.util.Scanner;

public class MaquinaExpendedora {
  private Producto[] productos;

  public MaquinaExpendedora() {
    productos = new Producto[6];
    productos[0] = new Papitas("P001", "Margaritas", 2000, "Sal", 30);
    productos[1] = new Refresco("P002", "Coca-Cola", 4500, "Cola");
    productos[2] = new Pastelito("P003", "Ramo", 2500, "Chocolate", false);
    productos[3] = new Refresco("P004", "Pepsi", 4500, "Cola");
    productos[4] = new Papitas("P005", "Margaritas", 2000, "Pollo", 30);
    productos[5] = new Producto("P006", "Chicle", 300);
  }

  public boolean venta(String codigo) {
    for (int i = 0; i < productos.length; i++) {
      Producto producto = productos[i];

      if (producto != null && producto.getCodigo().equals(codigo)) {
        productos[i] = null;
        return true;
      }
    }

    return false;
  }

  public void reporteProductos() {
    int papitas = 0;
    int refrescos = 0;
    int pastelitos = 0;
    int otros = 0;

    for (Producto producto : productos) {
      if (producto == null) {
        // Cuando for tiene "continue"
        // salta a la siguiente iteración
        continue;
      }

      if (producto instanceof Papitas) {
        papitas++;
      } else if (producto instanceof Refresco) {
        refrescos++;
      } else if (producto instanceof Pastelito) {
        pastelitos++;
      } else {
        otros++;
      }
    }

    System.out.println("\nReporte");
    System.out.println("Papitas: " + papitas);
    System.out.println("Refrescos: " + refrescos);
    System.out.println("Pastelitos: " + pastelitos);
    System.out.println("Otros: " + otros);
  }

  public static void main(String... args) {
    MaquinaExpendedora maquina = new MaquinaExpendedora();
    Scanner sc = new Scanner(System.in);
    boolean continuar = true;

    do {
      System.out.println("\nElige una opción del menu:"
          + "\n1. Comprar un producto"
          + "\n2. Reporte de productos disponibles"
          + "\n3. Reporte de ventas"
          + "\n4. Salir");

      int opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1:
          System.out.println("\nIngresa el código del producto:");
          String codigo = sc.nextLine();
          boolean hizoVenta = maquina.venta(codigo);

          if (!hizoVenta) {
            System.out.println("\n❌ Producto no encontrado...");
          } else {
            System.out.println("\n✅ Producto vendido :)");
          }
          break;

        case 2:
          maquina.reporteProductos();
          break;

        default:
          continuar = false;
      }
    } while (continuar);
  }
}
