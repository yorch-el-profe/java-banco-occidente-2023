// Encapsulación: 
// Cómo puedo acceder a los métodos/atributos de una clase.
// Limitar el acceso a ciertos atributos de mi clase.

// Existen 3 tipos de nivel de acceso
// public: Se puede acceder al método/atributo en cualquier momento
// private: Sólo se puede acceder al método/atributo dentro de la misma clase
// protected: Sólo se puede acceder al método/atributo dentro de la misma clase o sus hijos

public class Persona {

  // Atributos (propiedades)
  public String nombre;
  public byte edad;
  public float altura;
  public float peso;
  public char genero;

  // Métodos (acciones)
  // void => el método no regresa nada
  public void saludar(String nombre) {
    System.out.println("Hola " + nombre);
  }

  public byte obtenerEdad() {
    return edad;
  }
}
