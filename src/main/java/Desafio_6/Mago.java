
package Desafio_6;

// Clase Mago que hereda Personaje
class Mago extends Personaje {
    //Llama al constructor Personaje mediante super
    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override //indica que el método viene de una superclase
    //Implementación del método abstracto accionEspecial para Mago
    public void accionEspecial() {
        System.out.println("Soy el Mago: " + nombre + " y estoy en el nivel: " + nivel);
    }
}

