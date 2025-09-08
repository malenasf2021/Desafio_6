
package Desafio_6;

    // Creación de la clase abstracta
abstract class Personaje {
    //Atributos protected accesibles dentro propia clase, subclases y paquete
    protected String nombre;
    protected int nivel;
    
    //constructor Personaje que inicializa nombre y nivel
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // Método abstracto, las clases que heredan lo tienen que usar en su propia versión. 
    public abstract void accionEspecial();
}
