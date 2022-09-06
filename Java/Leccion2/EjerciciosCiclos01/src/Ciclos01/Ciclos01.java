/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos01;

import java.util.Scanner;

//Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta
//que se introduzca un numero negativo

public class Ciclos01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero, cuadrado;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());       
        while(numero >= 0){//Mientras el numero sea igual a cero ó positivo
            cuadrado = (int)Math.pow(numero,2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: "+ cuadrado);
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El programa ha finalizado por numero negativo");
    }
}
