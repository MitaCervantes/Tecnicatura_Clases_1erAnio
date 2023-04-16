/*Ejercicio 4: leer 10 numeros enteros, guardarlos en un arreglo. Debemos
mostrarlo en el siguiente orden: el primero, el ultimo, el segundo, el penultimo,
el tercero, etc. */

package ejercicios_arreglos;

import java.util.Scanner;

public class Arreglos_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[10];
        
        System.out.println("Guardando los datos en el arreglo: ");
        for(int i = 0; i < 10; i++){
            System.out.println((i + 1) + ".Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("\nImprimir los elementos del arreglo: ");
        for (int i = 0; i < 5; i++){
            System.out.println(" " + numeros[i]);
            System.out.println(" " + numeros[9-i]);
        }             
    }
}
