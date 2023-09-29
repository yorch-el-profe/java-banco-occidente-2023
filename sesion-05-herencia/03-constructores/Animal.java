/*
 * Cuando una clase implementa un constructor con parámetros, automáticamente
 * renuncia al constructor vacío de la clase Object.
 */

public class Animal {
  private String especie;
  private String subespecie;

  public Animal() {
    especie = "Desconocida";
    subespecie = "Desconocida";
  }

  public Animal(String especie) {
    this.especie = especie;
    this.subespecie = "Desconocida";
  }

  public Animal(String especie, String subespecie) {
    this.especie = especie;
    this.subespecie = subespecie;
  }

  @Override
  public String toString() {
    return "especie: " + especie + ", subespecie: " + subespecie;
  }
}
