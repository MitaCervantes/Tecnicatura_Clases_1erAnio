/*Ejercicio 4: Pedir numero hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
Primero lo haremos con la clase Scanner y luego con JOptionPane.
*/ 
package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num, conteo = 0;
        System.out.println("Digite un numero: ");
        num = Integer.parseInt(entrada.nextLine());

        while (num >= 0) {
            System.out.println("El numero: " + num + " es POSITIVO");
            conteo++;
            System.out.println("Digite otro numero: ");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ha ingresado " + conteo + " numeros positivos.");
    }
}
