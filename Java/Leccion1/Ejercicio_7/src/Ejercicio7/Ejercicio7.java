
package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Ejercicio7
        Scanner entrada = new Scanner(System.in);
        final int sueldo = 1000;
        System.out.println("Ingrese la cantidad de autos vendidos para este vendedor: ");
        int autos = Integer.parseInt(entrada.nextLine());

        float comision = autos * 150, ventas = 0,comisionVentas = 0;
        
        if (autos > 1) {
            for (int i = 1; i <= autos; i++) {
                System.out.println("Ingrese el precio de la venta de cada auto: ");
                ventas = Float.parseFloat(entrada.nextLine());
                ventas = ventas * 5 / 100;
                comisionVentas = ventas + comisionVentas;
            }
            System.out.println("\n");
            System.out.println("Cantidad de autos vendidos = " + autos);
            System.out.println("Comision de $150 por auto = " + comision);
            System.out.println("La comision por precio de ventas es = " + comisionVentas);

        } else {
            System.out.println("Ingrese el precio de la venta del auto: ");
            ventas = Float.parseFloat(entrada.nextLine());
            ventas = ventas * 5 / 100;
            System.out.println("Cantidad de autos vendidos = " + autos);
            System.out.println("Comision de $150 por auto = " + comision);
            System.out.println("La comision por precio de ventas es = " + ventas);
        }

        float total = sueldo + comision + comisionVentas;
        System.out.println("El salario mensual del vendedor X es = " + total);
        
        //Resolucion Profesor
         /*Scanner entrada = new Scanner(System.in);
         final int salario = 1000;
         int comision = 150, venta;
         float salarioMensual, ventaCarro , porcVenta, totalPrecio;
         
         System.out.println("Digite la cantidad de autos vendidos: ");
         venta = Integer.parseInt(entrada.nextLine());
         System.out.println("Digite el precio de un carro: ");
         ventaCarro = Float.parseFloat(entrada.nextLine());
         
         comision *= venta;
         totalPrecio = ventaCarro * venta;
         porcVenta = totalPrecio * 0.05f;
         salarioMensual = salario + comision + porcVenta;
         
         System.out.println("salarioMensual = " + salarioMensual);*/
    }
   
}
