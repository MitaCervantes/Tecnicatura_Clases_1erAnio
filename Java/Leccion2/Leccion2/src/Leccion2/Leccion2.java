
package Leccion2;

import java.util.Scanner;

/**
 *
 * @author Mita
 */
public class Leccion2 {
    public static void main(String[] args) {
        //Sentencia de Control if else
        /*var condicion = true;

        if (condicion) {
            System.out.println("Condicion verdadera");//condicional simple
        } else {
            System.out.println("Condicion falsa");//condicional doble
        }
        
        //Ejercicio con la estructura if else
        var numero = 3;
        var numeroTexto = "Numero desconocido";
        
        if( numero == 1 ){
            numeroTexto = "Numero uno";
        }
        else if( numero == 2 ){
            numeroTexto = "Numero dos";
        }    
        else if( numero == 3 ){
            numeroTexto = "Numero tres";
        }
        else if( numero == 4){
            numeroTexto = "Numero cuatro";
        }
        else{
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
      
        //Ejercicio: Cálculo de las estaciones del año con if else
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
     
        var estacion = "Estacion desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Verano";
        }
        else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Otoño";
        }
        else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Invierno";
        }
        else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "Primavera";
        }
        
        System.out.println("estacion = " + estacion);*/
        
        //Sentencia de Control Switch
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
        //Ejercicio: Cálculo de las estaciones del año con Switch
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estacion desconocida";
        
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Verano";
                break;
            case 3: case 4: case 5:
                estacion = "Otoño";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion = "Primavera";
                break;
        }
        System.out.println("estacion = " + estacion);
        
        // Ejercicio: sistema de calificaciones con if else
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        var calificacion = Integer.parseInt(entrada.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificacion >= 9 && calificacion <= 10)
            System.out.println("A");
        //Si esta entre  8 y menor a 9 imprimir: B
        else if(calificacion >= 8 && calificacion < 9)
            System.out.println("B");
        //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion >= 7 && calificacion < 8)
            System.out.println("C");
        //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion >= 6 && calificacion < 7)
            System.out.println("D");
        //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion >= 0 && calificacion < 6)
            System.out.println("F");
        //Si no esta en el rango, imprimir: Valor desconocido
        else
            System.out.println("Fuera de rango");
        
        //Ejercicio: sistema de calificaciones con la sentencia de control switch
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        var calificacion = Integer.parseInt(entrada.nextLine());
        var nota = "Nota desconocida";
        
       switch (calificacion){
           case 0, 1, 2, 3, 4, 5:
             nota = "F";    
             break;
           case 6:
             nota = "D";
             break;
           case 7:
             nota = "C";
             break;  
           case 8:
             nota = "B";
             break;
           case 9, 10:
             nota = "A";
             break;
       }
       System.out.println("calificacion = " + nota);*/
        
       //Ejercicio 1:
       /* Scanner entrada= new Scanner(System.in);
        int nota1= 0, nota2 = 0, nota3= 0, promedio=0;
        
        System.out.println("Ingrese sus calificaciones:\n");
        System.out.print("Nota 1: ");
        nota1 = entrada.nextInt();
         System.out.print("Nota 2: ");
        nota2 = entrada.nextInt();
         System.out.print("Nota 3: ");
        nota3 = entrada.nextInt();
        
        System.out.println("");
        
        promedio = (nota1 + nota2 + nota3)/3;
        
        if(promedio < 6){
            System.out.println("El alumno esta desaprobado con: " + promedio);
        }
        else if (promedio >= 6){
            System.out.println("El alumno esta aprobado con: " + promedio);
        }

       //Ejercicio 2:
	Scanner entrada= new Scanner(System.in);
        double compra=0, descuento=0, precio_final=0;
        System.out.print("Ingrese la cantidad a pagar: ");
        compra= Integer.parseInt(entrada.nextLine());
        
        if (compra > 100){
            descuento = compra * 0.2;
            precio_final = compra - descuento;
            System.out.println("La compra es de : " + compra);
            System.out.println("El descuento es de : " + descuento);
            System.out.println("El precio final es de : " + precio_final);
        }else{
            precio_final = compra;
            System.out.println("La compra es de : " + compra);
            System.out.println("El precio final es de : " + precio_final);
        }
       
       //Ejercicio 3:
 	Scanner entrada= new Scanner(System.in);
        double num1=0, num2=0, resultado=0;
        System.out.print("Ingrese el primer número: ");
        num1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = entrada.nextDouble();
        
        if (num1 == num2 ){
            resultado = num1 * num2;
        }
        else if(num1 > num2){
            resultado = num1 - num2;    
        }
        else{
            resultado = num1 + num2;
        }
        System.out.println("El resultado es: "+ resultado);*/

    }
  }
