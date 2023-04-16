/*Ejercicio 6: leer 5 elementos numericos que se introduciran ordenados de forma creciente.
Estos los guardaremos en una tabla de tamaño 10. Leer un numero N, e insertarlo en el lugar
adecuado para que la tabla continue ordenada.*/

package ejercicios_arreglos;

import java.util.Scanner;


public class Arreglos_Ejercicio_6 {
    public static void main(String[] args) {
        int tabla[]= new int[10];
        int num,sitio_num,j;
        
        Scanner entrada = new Scanner(System.in);
        for (int i = 0;i < 5; i++){
            System.out.print("Introduzca número (ordenado crecientemente): ");
            tabla[i]= entrada.nextInt();
        }
          
        System.out.println();
        System.out.print("Ingrese los números a insertar entre los anteriores: ");
        num = entrada.nextInt();
        sitio_num = 0;
        j=0;
        
        // buscaremos el sitio donde debería ir num
        while(tabla[j] < num && j <= 4){
            sitio_num ++;
            j++;
        }        
        // desplazaremos los elementos desde el sitio_num hasta el final
        // así haremos un hueco para num     
        for (int i = 4; i >= sitio_num; i--){
            tabla[i+1] = tabla[i];
        }
        // por último ponemos num en su sitio para que todo siga ordenado
        tabla[sitio_num] = num;
        
        //mostramos la serie ordenada
        System.out.println("La nueva serie ordenada queda: ");
        for (int i = 0; i < 5+1 ; i++){
            System.out.println(tabla[i]);
        }        
    }
}
