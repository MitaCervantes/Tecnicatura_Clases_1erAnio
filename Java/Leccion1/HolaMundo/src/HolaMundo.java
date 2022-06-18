import java.util.Scanner;

/**
 *
 * @author Mita
 */
public class HolaMundo {
    public static void main(String[] args) {
      /*  System.out.println("Hola Mundo desde Java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);*/
      
      //Var - inferencia de tipos en Java
       /*var miVariableEntera2 = 10; 
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
       */
        //soutv + tab
        //Para ejecutar shift + F6
        //Reglas para definir una variable en Java:
        //-utilizar tipo de escritura camel case
        //-el nombre no puede empezar con un numero o un caracter especial
        //-si puede empezar con guion baho y signo dolar, y acento pero no se recomienda
        
        /*var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
       
       var a = 8;
       var b = 4;
       System.out.println( usuario + " " + (a + b) );
       
       //Ejercicio: caracteres especiales con Java
        var nombre = "Natalia";
        System.out.println("Nueva linea: \n"+ nombre);//Diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre);//Diagonal imversa y letra t
        System.out.println("Retroceso: \b" + nombre);//Caracter de retroceso
        System.out.println("Comillas smples: \'" + nombre + "\'");//Diagonal inversa y comilla simple
        System.out.println("Comillas dobles: \"" + nombre + "\"");//Diagonal inversa y comillas doble*/
        
        
        //Clase Scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);*/
        
        //Tipos primitivos enteros: byte, short, int, long
        /*byte numEnteroByte0 = (byte)129;//Conversion de tipos y perdida de precision
        System.out.println("numEnteroByte0 = " + numEnteroByte0);
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: "+ Byte.MAX_VALUE);
        System.out.println("\n");
        
        short numEnteroShort0 = (short)32769;//conversion de tipos y perdida de precision
        System.out.println("numEnteroShort0 = " + numEnteroShort0);
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: "+ Short.MAX_VALUE);
        System.out.println("\n");
        
        int numEnteroInt0 = (int)2147483649L;//conversion de tipos y perdida de precision
        System.out.println("numEnteroInt0 = " + numEnteroInt0);
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int: "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int: "+ Integer.MAX_VALUE);
        System.out.println("\n");
        
        //long numEnteroLong0 = 9223372036854775809L no se puede 
        //conversion de tipos y perdida de precision xq es el mayor numero aceptado en Java
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo de Long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo de Long: "+ Long.MAX_VALUE);
        System.out.println("\n");*/
        
        // Tipos primitivos de tipo flotante: float y double
        /*float numFloat0 = (float)3.4028236E38;//conversion de tipos y perdida de precision
        System.out.println("numFloat0 = " + numFloat0);
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo de Float: "+ Float.MIN_VALUE);
        System.out.println("Valor maximo de Float: "+ Float.MAX_VALUE);
        System.out.println("\n");
         
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo de Double: "+ Double.MIN_VALUE);
        System.out.println("Valor maximo de Double: "+ Double.MAX_VALUE);
        System.out.println("\n");*/
        
        //Inferencia de tipos var y tipo primitivo
        /*var numEntero = 20; //Las literales sin punto son automaticamente de tipo int
        System.out.println("numEntero = " + numEntero);
        
        var numFloat = 10.0F;
        System.out.println("numFloat = " + numFloat);//Automaticamente con el punto se transforma en tipo double 
        
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
        
        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a Java la asignación con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char  varCaracterDecimal = 36;//Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$' ;//Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
                
        //Inferencia de tipo
        var varCaracter1 = '\u0024'; //Indicamos a Java la asignación con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var  varCaracterDecimal1 = (char)36;//Valor entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$' ;//Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/
        
        //Tipos primitivos boolean
       /*boolean varBoolean = true;
       System.out.println("varBoolean = " + varBoolean);
        
       if(varBoolean){
           System.out.println("La bandera es verdadera");
       } 
       else{
           System.out.println("La bandera es falsa");
       }
       
       var edad = 10;
       //var esAdulto = edad >= 18;
       if( edad >= 18 ){
           System.out.println("Eres mayor de edad");
       }
       else{
           System.out.println("Eres menor de edad");
       }*/
       
       //Conversión de tipos primitivos
       //Convertir tipo String a un tipo int:
        /*var edad = Integer.parseInt("20");      
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor 
        var entrada = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt(entrada.nextLine() );
        System.out.println("edad = " + edad);
        
        //Convertir tipo int a un tipo String:
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(0); 
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter:");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/
        
        //Operadores aritméticos en Java:
        /*int num1=5, num2=4;
        var solucion = num1 + num2;
        System.out.println("resultado suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion division = " + solucion);
        
        var solucion2 = 3D / num2;
        System.out.println("solucion2 division = " + solucion2);
        
        solucion = num1 % num2;
        System.out.println("solucion modulo = " + solucion);
        
        if( num2 % 2 == 0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");*/
        
        //Operadores de Asignación/Composición:
        /*int num1 = 3, num2=2;
        int num3 = num1 + 5 - num2; 
        System.out.println("num3 = " + num3);
        
        num1 += 1;//num1 = num1 + 1
        System.out.println("num1 = " + num1);
        
        num1 += 3;//num1 = num1 + 3
        System.out.println("num1 = " + num1);
        
        num1 -= 2;//num1 = num1 - 2
        System.out.println("num1 = " + num1);
       
        num1 *= 2;//num1 = num1 = " + num1);
        System.out.println("num1 = " + num1);
        
        num1 /= 2;//num1 = num1 / 2
        System.out.println("num1 = " + num1);
        
        num1 %= 2;//num1 = num1 % 2
        System.out.println("num1 = " + num1);*/
        
        //Operadores Unarios en Java:
        //Cambio de signo
        /*var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //Operador de negación
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Operadores unarios de incremento
        //1.preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;//primero se incrementa la variable y despues se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2.postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++;//primero se utiliza el valor y despues se incrementa
        System.out.println("g = " + g);//teniamos pendiente un incremento
        System.out.println("h = " + h);
        
        //Operadores unarios de decremento
        //1.predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);//ya esta drecrementada
        System.out.println("j = " + j);
        
        //2.postdecremento
        var k = 4;
        var l = k--;//primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k);//teniamos pendiente un drecremento
        System.out.println("l = " + l);*/
        
        //Operadores de Igualdad
        /*var a = 5;
        var b = 4;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2;//compara referencias de objetos
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2);//compara contenido de cadenas
        System.out.println("f = " + f);
        
        //Operadores Relacionales
        //>  >=  <  <=  == != 
        
        var g = a >= b;//mayor  que > o el mayor o igual >=
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 10;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es un adulto");
        }
        else{
            System.out.println("Es menor de edad");
        }*/
        
        //Operadores Condicionales
        /*var valorA = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = valorA >= 0 && valorA <= 10;
        if(resultado){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = false;
        var diaLibre = true;
        
        if( vacaciones || diaLibre){
            System.out.println("Padre puede asistir al juego del hijo");
        }
        else{
            System.out.println("El padre esta ocupado");
        }
        
        //Operador Ternario en Java
        var resultado = (5 > 4) ? "verdadero" : "falso";        
        System.out.println("resultado = " + resultado);
        
        var numero = 9;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);*/
        
        //Precedencia de Operadores
        /*var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;//4 + ((5*6)/3)
        System.out.println("resultado = " + resultado);//14
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);*/
    
    }     
}
