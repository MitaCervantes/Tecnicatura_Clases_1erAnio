
package CicloWhile;

import java.util.Scanner;

/**
 *
 * @author Mita
 */
public class EjercicioWhile01 {
    public static void main(String[] args) {
         //ciclo While
        var conteo = 0;//Inferencia de tipos
        while (conteo < 7){
            System.out.println("conteo While = " + (conteo + 1));
            conteo ++;//Vamos aumentando en uno la variable
        }
        //ciclo Do While
        var contador = 0;
        do{
            System.out.println("contador Do While = " + contador);
            contador++;
        }while(contador < 7);
        
        //ciclo For
        for( contador = 0; contador < 7 ; contador ++){
            System.out.println("contador Ciclo For = " + contador);
        }
        
        //Uso de las palabras break y continue junto a las etiquetas (labels)
        inicio:
         for( contador = 0; contador < 7 ; contador ++){
           if(contador % 2 == 0){
               System.out.println("contador = " + contador);
               break inicio;
           }
        }
        inicio:
        for( contador = 0; contador < 7 ; contador ++){
           if(contador % 2 != 0){
             continue inicio;//vamos a la siguente iteracion           
           }System.out.println("contador = " + contador);
        }
        
        
    }
}

