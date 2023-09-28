/*
  Adivinar el animal

  1. Solicitar al usuario el nombre del animal
  2. Solicitar el sonido que hace el animal
  3. Utilizando el método equals, comparar si el nombre y sonido coincide con alguno de los animales disponibles.
  4. El usuario sólo tiene 3 intentos para adivinar
  5. Si el usuario excede de los 3 intentos, mostrarle los animales disponibles utilizando el método toString()
 */

public class AdivinaAnimal {
  public static void main(String... args) {
    Animal perro = new Animal("Perro", "woof");
    Animal vaca = new Animal("Vaca", "muuuu");
    Animal gato = new Animal("Gato", "meow");

    System.out.println("Los animales disponibles:");
    System.out.println(perro);
    System.out.println(vaca);
    System.out.println(gato);
  }
}
