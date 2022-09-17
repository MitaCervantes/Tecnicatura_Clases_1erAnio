/*Ejercicio 7: Pedir numeros hasta que se introduzca uno negativo 
y calcular la media.*/

package Ciclos07;

import javax.swing.JOptionPane;

public class Ejercicio07 {
     public static void main(String[] args) {
        
        int numero, suma = 0, conteo = 0;
        float promedio = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero >= 0){ //Mientras el numero no sea negativo      
        suma += numero; 
        conteo ++;
        System.out.println("Digite otro numero:  ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
       }
       if(conteo == 0){
           JOptionPane.showMessageDialog(null,"\n El promedio entre " + conteo + " no existe." );
       }else{
           promedio = (float)suma/conteo;
           JOptionPane.showMessageDialog(null,"\nEl promedio es de :  " + promedio );
       }        
    }
}
