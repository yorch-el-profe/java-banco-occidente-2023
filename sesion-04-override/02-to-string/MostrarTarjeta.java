
public class MostrarTarjeta {
  public static void main(String... args) {
    Tarjeta debito = new Tarjeta("0000", 5_000_000, "5647-3049-2849-6523");
    TarjetaCredito credito = new TarjetaCredito(10_000_000, "1234", "5647-3049-2849-6523");

    // println internamente ejecuta obj.toString();
    System.out.println(debito.toString("Santander"));

    if (debito.equals(credito)) {
      System.out.println("Las tarjetas son las mismas");
    }
  }
}
