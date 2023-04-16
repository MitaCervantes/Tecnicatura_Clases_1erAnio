/*Ejercicio 7: crear una matriz "marco" de tamaño 5x5: todos sus elementos
deben ser 0 salvo los de los bordes que deben ser 1. Mostrarla.*/

package ejercicios_matrices;


public class Matrices_Ejercicio_7 {
    public static void main(String[] args) {
        int i, j;
        int marco[][];
        
        marco = new int [5][5];//inicializamos toda la mattriz a 0
        
        //rellenamos la matriz marco
         for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                if(i == 0 || i == 4) //si nos encontramos en la primera o ultima columna
                    marco[i][j] = 1;
                if(j == 0 || j == 4)
                    marco[i][j] = 1;                                  
            }
            System.out.println("");   
        }    
         
        //mostramos la matriz marco
        System.out.println("Matriz 'Marco': ");
         for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.print(marco[i][j] + " ");                     
            }
            System.out.println("");   
        }         
    }   
}
