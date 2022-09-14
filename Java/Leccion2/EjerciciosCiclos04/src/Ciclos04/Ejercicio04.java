/*Ejercicio 4: Pedir numero hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
Primero lo haremos con la clase Scanner y luego con JOptionPane.
 */
package Ciclos04;

import javax.swing.JOptionPane;

public class Ejercicio04 {

    public static void main(String[] args) {

        int num, conteo = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (num >= 0) {
            System.out.println("El numero: " + num + " es POSITIVO");
            conteo++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        }
        System.out.println("Ha ingresado " + conteo + " numeros positivos.");
    }
}
