// Las clases del paquete java.lang ya están cargados por default.

// Importar TODAS las clases del paquete especificado
// Recomendación: No usar este tipo de importación
// import java.util.*;

import java.util.ArrayList;

public class Paquete {
  public static void main(String... args) {
    int min = Math.min(10, 50);
    System.out.println("Mínimo entre 10 y 50 es: " + min);

    ArrayList list = new ArrayList();
  }
}
