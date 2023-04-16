/*Ejercicio 6: utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera 
y transponerla en la segunda.*/

package ejercicios_matrices;

import java.util.Scanner;


public class Matrices_Ejercicio_6 {
    
    public static void main(String[] args) {
        int a [][] , b[][];
        int i,j;
        
        a = new int [5][9];
        b = new int [9][5];
        
        Scanner entrada = new Scanner(System.in);
        for(i = 0; i < 5; i++){
            for(j = 0; j < 9; j++){
                System.out.print("Ingrese los elementos ["+i+"]["+j+"]: " );
                a[i][j] = entrada.nextInt();
            }
        }
        
         //mostramos la matriz original
        System.out.println("Matriz Original: ");
         for(i = 0; i < 5; i++){
            for(j = 0; j < 9; j++){
                System.out.print(a[i][j] + " ");                     
            }
            System.out.println("");   
        }        
        
        //trasponemos
         for(i = 0; i < 5; i++){
            for(j = 0; j < 9; j++){                
                b[j][i] = a[i][j];
            }
        }
         
        //mostramos la matriz traspuesta
        System.out.println("Matriz Traspuesta: ");
         for(i = 0; i < 9; i++){
            for(j = 0; j < 5; j++){
                System.out.print(b[i][j] + " ");                     
            }
            System.out.println("");   
        }        
    }
}
