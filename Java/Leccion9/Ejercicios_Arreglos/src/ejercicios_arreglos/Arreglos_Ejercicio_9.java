/*Ejercicio 9: leer dos series de 10 enteros, que estaran ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.*/

package ejercicios_arreglos;

import java.util.Scanner;


public class Arreglos_Ejercicio_9 {
    
    public static void main(String[] args) { 
        int a[], b[], c[];
        int i, j, k ;
        a = new int[10];
        b = new int[10];
        c = new int [20];
        
        Scanner entrada = new Scanner(System.in);
        // leemos a
        System.out.println("Datos para tabla 'a'(orden creciente): ");
        for (i = 0; i < 10; i++) {
            System.out.print("Introduzca numero: ");
            a[i] = entrada.nextInt();
        }

        // leemos b
        System.out.println("\nDatos para tabla 'b' (orden creciente): ");
        for (i = 0; i < 10; i++) {
            System.out.print("Introduzca numero: ");
            b[i] = entrada.nextInt();
        }

        System.out.println();

        // creamos c comparando los valores para insertarlos en tabla c      
        i = 0; //utilizaremos i como indice de a;
        j = 0; //utilizaremos j como indice de b;
        k = 0; //utilizaremos k como indice de c;

        while(i < 10 && j < 10){
        if(a[i] < b[j]){ // nos interesa el elemento de a
                c[k] = a[i]; // 
                i++;// incrementamos i para tomar el siguiente elemento de a                
        }else{
                c[k] = b[j];
                j++;// incrementamos j para tomar el siguiente elemento de b   
            }
            k++; //como hemos copiado a c[k], incrementamos k para
                 //en la siguiente vuelta, utilizar el siguiente hueco de la tabla
        }	
        
        //cuando salimos de while es porque alguna de las tablas (a ó b) ha llegado al final
        
        if(i == 10) // hemos copiado toda la tabla de a en c, queda por copiar un resto de b
                while(j < 10){
                        c[k] =  b[j];
                        j++;
                        k++;
                }
        else    // hsy que copiar el resto de a en c
                while(i < 10){
                        c[k] = a[i];
                        i++;
                        k++;
                }

        System.out.println("Mostramos la tabla c:");

        for (k = 0; k < 20; k++) {
            System.out.print(c[k] + " ");
        }

        System.out.println("");
    }
}
