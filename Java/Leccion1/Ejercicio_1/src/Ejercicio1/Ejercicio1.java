//Tienda de libros.
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio1
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos del libro:");
        System.out.println("Digite el nombre del libro: ");
        String nombre = entrada.nextLine();
        System.out.println("Digite el ID del libro: ");
        int libroId = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro: ");
        double precio = Double.parseDouble(entrada.nextLine());
        System.out.println("Indicar si el envío es gratuito (True/False)");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        System.out.println("\n");
              
        System.out.println("Nombre: " + nombre);
        System.out.println("Id del Libro: " + "#" + libroId);
        System.out.println("Precio: $" + precio);
         if (envioGratuito == true) {
            System.out.println("El envío ES gratuito");
        }
        else{
            System.out.println("El envío NO es gratuito");
        }*/
        
        //Ejercicio2
       /* Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas semanales trabajadas: ");
        int horasTrab = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese su salario por hora: ");
        float salarioXHora = Float.parseFloat(entrada.nextLine());
        
        float salarioTotal = horasTrab * salarioXHora;
        System.out.println("\nEl salario total es U$S = " + salarioTotal);*/
        
        //Ejercicio3
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de alto:");
        int alto = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el valor de ancho:6");
        int ancho = Integer.parseInt(entrada.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("El area es = " + area);
        System.out.println("El perimetro es = " + perimetro);*/
        
        //Ejercicio4
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        int num1= Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el numero 2: ");
        int num2= Integer.parseInt(entrada.nextLine());
        var resultado = (num1 > num2) ? "El primer numero es mayor" : "El segundo numero es mayor";
        System.out.println("resultado = " + resultado);*/
        
        //Ejercicio5
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las tres calificaciones: ");
        float nota1 = Float.parseFloat(entrada.nextLine());
        float nota2 = Float.parseFloat(entrada.nextLine());
        float nota3 = Float.parseFloat(entrada.nextLine());
        float suma = nota1 + nota2 + nota3;
        System.out.println("La suma de las calificaciones es = " + suma );*/
       
        //Ejercicio6
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dolares que tiene Guillermo: U$S ");
        float guille = Float.parseFloat(entrada.nextLine());
        System.out.println("Dinero Guille = U$S " + guille);
        float luis = guille / 2;
        System.out.println("Dinero Luis = U$S " + luis);
        float juan = (luis + guille) / 2;
        System.out.println("Dinero Juan = U$S " + juan);
        float dinero = guille + luis + juan;
        System.out.println("La  cantidad de dinero total es de = U$S " + dinero );*/
        
        //Ejercicio7
        /*Scanner entrada = new Scanner(System.in);
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
        System.out.println("El salario mensual del vendedor X es = " + total);*/
        
        //Resolucion Profesor
        Scanner entrada = new Scanner(System.in);
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
         
         System.out.println("salarioMensual = " + salarioMensual);

    }
}
