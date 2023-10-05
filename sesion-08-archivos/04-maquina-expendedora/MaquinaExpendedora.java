import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class MaquinaExpendedora {
  private final String PAPITAS = "Papitas";
  private final String PASTELITOS = "Pastelitos";
  private final String REFRESCOS = "Refrescos";
  private final String UTF_8 = "UTF-8";

  private List<Producto> productos;

  public MaquinaExpendedora() {
    productos = new LinkedList<Producto>();

    // Al iniciar la máquina expendedora cargamos los
    cargarArchivo("papitas.txt", PAPITAS);
    cargarArchivo("pastelitos.txt", PASTELITOS);
    cargarArchivo("refrescos.txt", REFRESCOS);
  }

  private void cargarArchivo(String archivo, String tipo) {
    try {
      FileReader reader = new FileReader("./archivos/" + archivo, Charset.forName(UTF_8));
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

  public boolean venta(String codigo) {
    for (Producto producto : productos) {
      if (producto.getCodigo().equals(codigo)) {
        productos.remove(producto);
        return true;
      }
    }

    return false;
  }

  public void reporteProductos() {
    int papitas = 0;
    int refrescos = 0;
    int pastelitos = 0;

    for (Producto producto : productos) {
      if (producto instanceof Papitas) {
        papitas++;
      } else if (producto instanceof Refresco) {
        refrescos++;
      } else {
        pastelitos++;
      }
    }

    try {
      FileWriter writer = new FileWriter("./reportes/productos-disponibles.txt", Charset.forName(UTF_8));
      BufferedWriter bufferedWriter = new BufferedWriter(writer);

      bufferedWriter.write("Reporte de Productos Disponibles");
      bufferedWriter.newLine();
      bufferedWriter.write("Papitas: " + papitas);
      bufferedWriter.newLine();
      bufferedWriter.write("Refrescos: " + refrescos);
      bufferedWriter.newLine();
      bufferedWriter.write("Pastelitos: " + pastelitos);

      System.out.println("\n✅ Reporte generado :)");

      bufferedWriter.close();
    } catch (IOException e) {
      System.out.println("Error generando reporte de productos");
    }
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
