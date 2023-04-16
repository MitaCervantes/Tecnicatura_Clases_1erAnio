/*Ejercicio 7: leer por teclado una tabla de 10 elementos numericos enteros y una posicion
(entre 0 y 9). Eliminar el elemento situado en la posicion dada sin dejar huecos. */

package ejercicios_arreglos;

import java.util.Scanner;


public class Arreglos_Ejercicio_7 {

    public static void main(String[] args) {
        int tabla[] = new int[10];
        int posicion;

        // leemos los 10 números 
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento (" + i + "): ");
            tabla[i] = entrada.nextInt();
        }

        System.out.println();
        // leemos la posición que nos interesa
        // suponemos que la posición está en el rango 0..9 
        System.out.print("Posición a eliminar: ");
        posicion = entrada.nextInt();

        // desplazamos desde posición hasta el final todos los elementos un lugar hacia la izquierda 
        // con lo que el elemento que está en posición se pierde (se borra)
        for (int i = posicion; i < 9; i++) // la i llega hasta la penúltima posición
        {
            tabla[i] = tabla[i + 1]; // ya que dentro usamos (i+1) que es la última posición 
                                     // así evitamos salirnos de la tabla
        }
        System.out.println("La tabla queda: ");

        for (int i = 0; i < 9; i++) { // hay que tener cuidado que ahora hay un 
            System.out.println(tabla[i]); // elemento útil menos en la tabla
        }
    }
};

