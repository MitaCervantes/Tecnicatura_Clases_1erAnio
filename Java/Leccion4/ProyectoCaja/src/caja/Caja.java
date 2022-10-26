/*Proyecto Caja.
Ejercicio 1: Crear un proyecto según las especificaciones 
mostradas a continuación.
La formula es -. volumen = ancho * alto * profundidad
 */
package caja;


public class Caja {//Clase publica Caja
    //Atributos (caracteristicas)
    int ancho,largo, profundo;
    
    //Metodos y Constructores (acciones)
    public Caja(){//Constructor 1 = vacio
        System.out.println("Ejecutando Constructor vacio.");
    }
    //Constructor con parametros
    public Caja(int ancho, int largo,int profundo){//Constructor 2
        this.ancho = ancho;
        this.largo = largo;
        this.profundo = profundo;
        System.out.println("Ejecutando Constructor con Argumentos.");
    }
    
    public int calcular_volumen(){//Metodo para calcular
        return ancho * largo * profundo;       
    }
}
