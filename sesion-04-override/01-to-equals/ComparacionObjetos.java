
/*
 Todos los objetos por defecto tienen una implementación 
 del método "equals".

 Por deferecto el método equals valida lo siguiente:

 this == obj  <---

 En el caso de las cadenas de texto (y otros objetos de Java)
 tiene su propia implementación.
*/

public class ComparacionObjetos {
  public static void main(String... args) {
    Persona persona = new Persona("Juan", 29);
    Persona persona2 = new Persona("Juan", 29);

    Perro perrito = new Perro("Juan", 3);

    // false: Las referencias son completamente diferentes
    if (persona == persona2) {
      System.out.println("persona y persona2 son la misma referencia");
    }

    if (persona.getNombre().equals(persona2.getNombre()) && persona.getEdad() == persona2.getEdad()) {
      System.out.println("Las dos personas son las mismas (validando manualmente)");
    }

    // persona == persona2
    if (persona.equals(persona2)) {
      System.out.println("Las dos personas son las mismas ✅");
    } else {
      System.out.println("Las personas no son las mismas");
    }

    Celular celular1 = new Celular(2773782);
    Celular celular2 = new Celular(2773782);

    if (celular1.equals(celular2)) {
      System.out.println("Los dos celulares son los mismos ✅");
    } else {
      System.out.println("Los celulares no son los mismos");
    }

    // Comparación entre clases diferentes
    if (persona.equals(perrito)) {
      System.out.println("La persona y el perro son las mismas");
    } else {
      System.out.println("La persona y el perro son diferentes");
    }
  }
}
