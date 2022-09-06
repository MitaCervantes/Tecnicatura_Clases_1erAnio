
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
         //Ejercicio3
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de alto:");
        int alto = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el valor de ancho:");
        int ancho = Integer.parseInt(entrada.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("El area es = " + area);
        System.out.println("El perimetro es = " + perimetro);
    }
}
