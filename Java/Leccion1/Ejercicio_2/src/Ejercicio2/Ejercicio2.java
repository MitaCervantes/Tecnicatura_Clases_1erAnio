
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ejercicio2
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas semanales trabajadas: ");
        int horasTrab = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese su salario por hora: ");
        float salarioXHora = Float.parseFloat(entrada.nextLine());
        
        float salarioTotal = horasTrab * salarioXHora;
        System.out.println("\nEl salario total es U$S = " + salarioTotal);
    }
}
