
package Ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        //Ejercicio4
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        int num1= Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el numero 2: ");
        int num2= Integer.parseInt(entrada.nextLine());
        var resultado = (num1 > num2) ? "El primer numero es mayor" : "El segundo numero es mayor";
        System.out.println("resultado = " + resultado);
    }
}
