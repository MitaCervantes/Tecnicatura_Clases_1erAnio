/*Ejercicio 10: leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. 
Se debe mostrar la posicion en que se encuentra. Si no esta, indicarlo con un mensaje.*/

package ejercicios_arreglos;

import java.util.Scanner;

public class Arreglos_Ejercicio_10 {
    
    public static void main(String[] args) { 
        int tabla[]=new int[10];
        int num,j;
        
        Scanner entrada = new Scanner(System.in);
        for (int i=0;i<10;i++){
        System.out.print("Introduzca numero (orden creciente): ");
        tabla[i]=entrada.nextInt();
        }

        System.out.println();

        System.out.println("Introduzca numero a buscar: ");
        num = entrada.nextInt();        
        j=0;

        while( j<10 && tabla[j]<num){
        j++;
        }

        // cuando me salgo del mientras puede ser por dos motivos:
        // - que j llegue a 10 ó
        // - que encuentre el donde iría num en la tabla

        if(j==10) // hemos llegado al final y no hemos encontrado nada.

        System.out.println("No encontrado");

        else{
        // si t[j] < num, hemos sobrepasado el lugar donde debería estar num, sin encontrarlo 
            if(tabla[j] == num){ // num está en la posición i. Entonces si está ahí
            System.out.println("Encontrado en la posición " + j);
            }else{
            System.out.println("No encontrado");
            }
        } 
    } 

}
