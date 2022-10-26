
package Operaciones;

import java.io.*;
import java.util.Scanner;

public class practica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int apuesta = 0;
        int acumulado = 0;  
        
        
        System.out.println("\nIntroduce tu apuesta para Cara ó Cruz: $");
        apuesta = Integer.parseInt(entrada.nextLine());
        while (true){            
            int moneda = (int)(Math.random() * 2);//Da un numero entre dos, empezando por 0 y terminando por 1
            if (moneda == 0) {//0 es cara y 1 es cruz
                apuesta = apuesta * 2;//si sale cara gana el doble de lo que apuesta
                acumulado = acumulado + apuesta;
                System.out.println("Ha salido CARA, has ganado $" + apuesta + " pesos en esta apuesta.");
                
            } else {
                acumulado = acumulado - apuesta;
                System.out.println("Ha salido CRUZ, has perdido $" + apuesta + " pesos de esta apuesta.");
            }
            System.out.println("Llevas acumulado: $" + acumulado + " pesos." );
            System.out.println("\nDesea seguir apostando? (si/no) ");
            String respuesta = entrada.nextLine();
            if("si".equals(respuesta)){
                System.out.println("\nIntroduce tu apuesta: $");
                apuesta = Integer.parseInt(entrada.nextLine());
            }else{
                
                System.out.println("Gracias por jugar!");
                if(acumulado > 0){
                    System.out.println("Felicidades, has ganado $" + acumulado);
                }else{
                    System.out.println("Lo sentimos, has perdido $" + acumulado);
                } 
                break;
            }            
        }         
        System.out.println("Juego terminado!");
    }
}