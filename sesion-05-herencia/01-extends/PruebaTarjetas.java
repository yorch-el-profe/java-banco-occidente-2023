
public class PruebaTarjetas {
  public static void main(String... args) {
    Tarjeta tarjeta = new Tarjeta("1234", "8762-9871-0984-6523", "9863-8723-8974-9832");

    TarjetaDebito debito = new TarjetaDebito("8763", "8762-9871-0984-6523", "9863-8723-8974-9832", 1000);

    TarjetaCredito credito = new TarjetaCredito("4567", "8762-9871-0984-6523", "9863-8723-8974-9832", 3000000);

    System.out.println(tarjeta);
    System.out.println(debito);
    System.out.println(credito);
  }
}
