/*Ejercicio 5: crear y cargar una matriz de tamaño NxM, mostrar 
la suma de cada fila y de cada columna.*/

package ejercicios_matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Matrices_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][],nFilas,nCol,suma_filas, suma_col, posFilas, posCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));
                
        matriz = new int [nFilas][nCol];        
	int filas[] = new int[nFilas];
        int columnas[] = new int[nCol];
        
        //Rellenamos la Matriz
        System.out.println("Rellenar la matriz: ");
        for(int i = 0; i < nFilas; i++){
                 for(int j = 0; j < nCol; j++){
                        System.out.println("Matriz ["+i+"]["+j+"]: ");
                        matriz[i][j] = entrada.nextInt();
                }
        }
        System.out.println();
        
        //Matriz Original
        System.out.println("Matriz Original: ");
        for(int i = 0; i < nFilas; i++){
                for(int j = 0; j < nCol; j++){
                        System.out.print(matriz[i][j]+ " ");
                }
                System.out.println();
        }
        System.out.println();
        
        // Recorremos la matriz sumando filas
	posFilas = 0;
        for(int i = 0; i < nFilas; i++){
            suma_filas = 0;
            for (int j = 0; j < nCol; j++){
                suma_filas += matriz[i][j];                
            }
            filas[posFilas] = suma_filas;
            posFilas++;
        }
	
        // Recorremos la matriz sumando columnas
	posCol = 0;
        for(int j = 0; j < nCol; j++){
            suma_col = 0;
            for (int i = 0; i < nFilas; i++){
                suma_col += matriz[i][j];                
            }
            columnas[posCol] = suma_col;
            posCol++;
        }
        
        //Mostramos los resultados
        System.out.println("\nLa suma de las filas es :");
        for(int i = 0; i < nFilas; i++){
            System.out.print(filas[i]+ ",");
        }
        System.out.println("");
        
        System.out.println("\nLa suma de las columnas es :");
        for(int i = 0; i < nCol; i++){
            System.out.print(columnas[i]+ ",");
        }
        System.out.println("");
    }
}
