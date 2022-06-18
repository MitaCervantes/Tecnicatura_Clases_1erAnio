
package Ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        //Ejercicio5
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las tres calificaciones: ");
        float nota1 = Float.parseFloat(entrada.nextLine());
        float nota2 = Float.parseFloat(entrada.nextLine());
        float nota3 = Float.parseFloat(entrada.nextLine());
        float suma = nota1 + nota2 + nota3;
        System.out.println("La suma de las calificaciones es = " + suma );
    }
   
}
