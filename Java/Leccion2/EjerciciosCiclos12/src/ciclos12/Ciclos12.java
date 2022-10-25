/*Ejercicio 12: pedir un numero y calcular su factorial.
  Hacerlos con las dos clases Scaner y JOption Pane.
 */
package ciclos12;

//import java.util.Scanner;

import javax.swing.JOptionPane;


public class Ciclos12 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.ln);
        long factorial = 1;
        //System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        for(int i = 1; i <= numero;i++){
            factorial *= i;
        }
        //System.out.println("\nEl factorial de numero ingresado es:  " + factorial);
        JOptionPane.showMessageDialog(null,"\nEl factorial del numero ingresado es: " + factorial);
    }
}
