
package Ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
         //Ejercicio6
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dolares que tiene Guillermo: U$S ");
        float guille = Float.parseFloat(entrada.nextLine());
        System.out.println("Dinero Guille = U$S " + guille);
        float luis = guille / 2;
        System.out.println("Dinero Luis = U$S " + luis);
        float juan = (luis + guille) / 2;
        System.out.println("Dinero Juan = U$S " + juan);
        float dinero = guille + luis + juan;
        System.out.println("La  cantidad de dinero total es de = U$S " + dinero );
    }
}
