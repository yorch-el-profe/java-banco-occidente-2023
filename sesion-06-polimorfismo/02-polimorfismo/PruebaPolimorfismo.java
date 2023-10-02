/*
 * Herencia: Especialización (ir de lo general a lo especifico)
 * Polimorfismo: Generalización (ir de lo especifico a lo general)
 */
public class PruebaPolimorfismo {
  public static void main(String... args) {
    AutomovilElectrico tesla = new AutomovilElectrico("Tesla", "Model 3", 4, 89792.98230498);

    Automovil teslaAutomovil = tesla;

    Vehiculo teslaVehiculo = tesla;

    System.out.println(tesla);
    System.out.println(teslaAutomovil);
    System.out.println(teslaVehiculo);

    // instanceof: Valida si un objeto es una instancia de la clase C
    System.out
        .println("AutomovilElectrico es instancia de AutomovilElectrico: " + (tesla instanceof AutomovilElectrico));
    System.out
        .println("AutomovilElectrico es instancia de Automovil: " + (tesla instanceof Automovil));
    System.out
        .println("AutomovilElectrico es instancia de Vehiculo: " + (tesla instanceof Vehiculo));

    System.out
        .println("Vehiculo es instancia de Motocicleta: " + (teslaVehiculo instanceof Motocicleta));
  }
}
