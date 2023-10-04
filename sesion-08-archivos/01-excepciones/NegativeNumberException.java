
public class NegativeNumberException extends Exception {
  public NegativeNumberException() {
    super("El número debe ser mayor o igual a 0");
  }

  public NegativeNumberException(String message) {
    super(message);
  }
}
