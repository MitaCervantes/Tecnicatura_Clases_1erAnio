/*Ejercicio 8: leer 10 numero enteros en una tabla. Guardar en otra tabla los
elementos pares de la primera, y a continuacion los elementos impares. */

package ejercicios_arreglos;

import java.util.Scanner;


public class Arreglos_Ejercicio_8 {       
   
   public static void main(String[] args) {
       int tabla[];
       int cont_par, par[]; // contador de números pares y tabla para guardarlos 
       int cont_impar,impar[]; // ídem para los impares
       tabla = new int[10];
       cont_par = 0;
       cont_impar = 0;

       Scanner entrada = new Scanner(System.in);
       System.out.println("Llenar el arreglo: ");
     // Leemos los valores de la tabla 
        for (int i = 0;i < 10; i++){    
        System.out.print("Introduzca un número: ");
        tabla[i] = entrada.nextInt();
        if(tabla[i] % 2 == 0){ //si el numero es par
            cont_par++;
        }else{                 // si el numero es impar
            cont_impar++;
        }
    } 
    // creamos las tablas par e impar del tamaño adecuado 
    
        par = new int[cont_par]; //arreglo para almacenar numeros pares
        impar  = new int[cont_impar]; //arreglo para almacenar numeros impares
        
        cont_par = 0;// vuelvo a 0 estas dos variables xq ya le asigne al arreglo la dimesion
        cont_impar = 0;// y ahora los utilizaré en el if para agregar su valor y cantidad a dicho arreglo
        
    // almacenamos los elementos par e impares a cada tabla correspondiente
        
         for (int i = 0; i < 10; i++) 
            if(tabla[i] % 2 == 0){ 
                par[cont_par] = tabla[i];   
                cont_par++;
            }else{
                impar[cont_impar] = tabla[i];  
                cont_impar++;
            };
               
    // volvemos a iterar para mostrar cada elemento en la tabla adecuada 
        System.out.println("Tabla par:");
        for (int i = 0;i < cont_par; i++) {           
            System.out.print(par[i]+ " - ");
        }                    
        System.out.println("");
        
        System.out.println("Tabla impar:");
        for (int i = 0;i < cont_impar;i++){            
            System.out.print(impar[i]+ " - ");
            }
    }
};
