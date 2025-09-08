# Desafío 6: Clase abstracta Personaje

Crea una clase **abstracta** `Personaje` con atributos `nombre` y `nivel`.  
Define un método abstracto `accionEspecial()`.  
Luego implementa las clases `Mago` y `Guerrero`, cada una con su propia versión de `accionEspecial()`.

---

## Código en Java

```java
// Creación de la clase abstracta
abstract class Personaje {
    // Atributos protected accesibles dentro de la propia clase, subclases y paquete
    protected String nombre;
    protected int nivel;
    
    // Constructor Personaje que inicializa nombre y nivel
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // Método abstracto, las clases que heredan lo tienen que usar en su propia versión. 
    public abstract void accionEspecial();
}

// Clase Mago que hereda Personaje
class Mago extends Personaje {
    // Llama al constructor Personaje mediante super
    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override // indica que el método viene de una superclase
    // Implementación del método abstracto accionEspecial para Mago
    public void accionEspecial() {
        System.out.println("Soy el Mago " + nombre + " y estoy en el nivel " + nivel);
    }
}

// Clase Guerrero que hereda Personaje
class Guerrero extends Personaje {
    // Llama al constructor Personaje mediante super
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override // indica que el método viene de una superclase
    // Implementación del método abstracto accionEspecial para Guerrero
    public void accionEspecial() {
        System.out.println("Soy el Guerrero " + nombre + " y estoy en el nivel " + nivel);
    }
}

// Clase main
public class Desafio_6 {
    public static void main(String[] args) {
        Personaje p1 = new Mago("Vecna", 1);
        Personaje p2 = new Guerrero("Leonidas", 2);

        p1.accionEspecial();
        p2.accionEspecial();
    }
}
```
---

## Fundamentación
Primeramente, se creó un proyecto con una clase principal (main), donde se probó el funcionamiento general del programa. 
Posteriormente, se creó la clase abstracta Personaje, que contiene el método abstracto `accionEspecial()`, y dos clases 
concretas que implementan los comportamientos específicos de sus subclases: `Mago` y `Guerrero`.

En la clase principal se crean instancias concretas de `Mago` y `Guerrero`, demostrando cómo se puede manejar cada personaje 
a través de referencias de tipo `Personaje`. 

El uso de la clase abstracta `Personaje` con su método abstracto `accionEspecial()` permite que cada personaje tenga 
comportamientos particulares, a la vez que comparte una estructura común. Por esta razón, se definió la clase como 
abstracta, es decir, sin instanciarla de manera directa, lo que facilita la centralización de atributos comunes a todos 
los personajes, como nombre y nivel, y establece la obligación de que cada subclase implemente su propia versión del 
método `accionEspecial()`.

En relación con los atributos de la clase abstracta, se optó por el modificador de acceso protected. Esta decisión se 
tomó siguiendo tanto las sugerencias del IDE NetBeans como criterios de diseño orientado a objetos. La utilización de 
**protected** permite que los atributos sean accesibles dentro de la propia clase, en sus subclases y dentro del mismo paquete. 
Dado que la clase `Personaje` no se instancia directamente, sino que sirve como base para otras, **protected** elimina la 
necesidad de implementar `getters` o `setters`, lo que facilita la reutilización de código.

Asimismo, se implementó un constructor en la clase `Personaje`, que inicializa los atributos comunes: nombre y nivel. 
La palabra reservada `super()` permite que las subclases `Mago` y `Guerrero` hereden la inicialización evitando redundancias. 
En la misma clase `Personaje` se define el método abstracto `accionEspecial()` el que será invocado por las subclases `Mago` y 
`Guerrero` y cada una responderá según su naturaleza concreta.

En las clases `Mago` y `Guerrero` se indica la herencia mediante la palabra clave `extends`. 
Cada una de estas clase implementa el método `accionEspecial()` a su modo en el caso de `Mago`: 
 ```java
 public void accionEspecial() {
        System.out.println("Soy el Mago" + nombre + " y estoy en el nivel " + nivel);
    }
}
```

En el caso de `Guerrero` lo hace de esta forma: 
 ```java
    public void accionEspecial() {
        System.out.println("Soy el Guerrero" + nombre + " y estoy en el nivel " + nivel);
    }
}
```
Esta implementación es posible gracias a la **abstracción**, que permite definir un comportamiento general en la clase padre y especializarlo en cada subclase. 
La anotación `@Override` fue sugerida por NetBeans y se justifica porque indica que se está sobreescribiendo un método de la superclase, evitando errores en la compilación del método.
Para probar el programa, en la clase principal (main), se crean dos objetos: `p1`, de tipo `Personaje` instanciado como `Mago`, y `p2`, de tipo `Personaje` instanciado como `Guerrero`. Ambos objetos utilizan referencias de la clase abstracta `Personaje`, pero su comportamiento concreto depende de la subclase a la que pertenecen. Por ello, al invocar `accionEspecial()` cada objeto imprime mensajes distintos:
```java
Soy el Mago: Vecna y estoy en el nivel: 1
Soy el Guerrero: Leonidas y estoy en el nivel: 2
```
