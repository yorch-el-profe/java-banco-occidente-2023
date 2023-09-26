public class PruebaTarjetaDebito {

  public static void main(String... args) {
    TarjetaDebito tarjeta = new TarjetaDebito();

    tarjeta.setSaldo(4000000);

    System.out.println(tarjeta.getSaldo());
  }
}
