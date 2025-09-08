
package Desafio_6;

   // Clase Guerrero que hereda Personaje
class Guerrero extends Personaje {
    //Llama al constructor Personaje mediante super
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override //indica que el método viene de una superclase
    //Implementación del método abstracto accionEspecial para Guerrero
    public void accionEspecial() {
        System.out.println("Soy el Guerrero: " + nombre + " y estoy en el nivel: " + nivel);
    }
}

