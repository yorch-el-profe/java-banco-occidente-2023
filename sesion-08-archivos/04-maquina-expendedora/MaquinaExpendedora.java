import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class MaquinaExpendedora {
  private final String PAPITAS = "Papitas";
  private final String PASTELITOS = "Pastelitos";
  private final String REFRESCOS = "Refrescos";

  private List<Producto> productos;

  public MaquinaExpendedora() {
    productos = new LinkedList<Producto>();
    cargarArchivo("./archivos/papitas.txt", PAPITAS);
    cargarArchivo("./archivos/pastelitos.txt", PASTELITOS);
    cargarArchivo("./archivos/refrescos.txt", REFRESCOS);
  }

  private void cargarArchivo(String archivo, String tipo) {
    try {
      FileReader reader = new FileReader(archivo, Charset.forName("UTF-8"));
      BufferedReader bufferedReader = new BufferedReader(reader);

      String linea;

      while ((linea = bufferedReader.readLine()) != null) {
        String[] partes = linea.split("\\|");

        String codigo = partes[0];
        String marca = partes[1];
        double precio = Double.parseDouble(partes[2]);
        String sabor = partes[3];

        switch (tipo) {
          case PAPITAS:
            int peso = Integer.parseInt(partes[4]);
            productos.add(new Papitas(codigo, marca, precio, sabor, peso));
            break;

          case PASTELITOS:
            boolean tieneRelleno = partes[4].equals("Y");
            productos.add(new Pastelito(codigo, marca, precio, sabor, tieneRelleno));
            break;

          case REFRESCOS:
            productos.add(new Refresco(codigo, marca, precio, sabor));
            break;
        }
      }

      bufferedReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error: No se encontró el archivo " + archivo);
    } catch (IOException e) {
      System.out.println("Error desconocido al cargar el archivo " + archivo);
    }
  }

  /*
   * public boolean venta(String codigo) {
   * for (int i = 0; i < productos.length; i++) {
   * Producto producto = productos[i];
   * 
   * if (producto != null && producto.getCodigo().equals(codigo)) {
   * productos[i] = null;
   * return true;
   * }
   * }
   * 
   * return false;
   * }
   * 
   * public void reporteProductos() {
   * int papitas = 0;
   * int refrescos = 0;
   * int pastelitos = 0;
   * int otros = 0;
   * 
   * for (Producto producto : productos) {
   * if (producto == null) {
   * // Cuando for tiene "continue"
   * // salta a la siguiente iteración
   * continue;
   * }
   * 
   * if (producto instanceof Papitas) {
   * papitas++;
   * } else if (producto instanceof Refresco) {
   * refrescos++;
   * } else if (producto instanceof Pastelito) {
   * pastelitos++;
   * } else {
   * otros++;
   * }
   * }
   * 
   * System.out.println("\nReporte");
   * System.out.println("Papitas: " + papitas);
   * System.out.println("Refrescos: " + refrescos);
   * System.out.println("Pastelitos: " + pastelitos);
   * System.out.println("Otros: " + otros);
   * }
   * 
   * public static void main(String... args) {
   * MaquinaExpendedora maquina = new MaquinaExpendedora();
   * Scanner sc = new Scanner(System.in);
   * boolean continuar = true;
   * 
   * do {
   * System.out.println("\nElige una opción del menu:"
   * + "\n1. Comprar un producto"
   * + "\n2. Reporte de productos disponibles"
   * + "\n3. Reporte de ventas"
   * + "\n4. Salir");
   * 
   * int opcion = sc.nextInt();
   * sc.nextLine();
   * 
   * switch (opcion) {
   * case 1:
   * System.out.println("\nIngresa el código del producto:");
   * String codigo = sc.nextLine();
   * boolean hizoVenta = maquina.venta(codigo);
   * 
   * if (!hizoVenta) {
   * System.out.println("\n❌ Producto no encontrado...");
   * } else {
   * System.out.println("\n✅ Producto vendido :)");
   * }
   * break;
   * 
   * case 2:
   * maquina.reporteProductos();
   * break;
   * 
   * default:
   * continuar = false;
   * }
   * } while (continuar);
   * }
   */

  public static void main(String... args) {
    MaquinaExpendedora maquina = new MaquinaExpendedora();
  }
}
