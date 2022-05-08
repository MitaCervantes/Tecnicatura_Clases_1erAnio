//import java.util.Scanner;

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
        var numEntero = 20; //Las literales sin punto son automaticamente de tipo int
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
        var  varCaracterDecimal1 = (char)36;//Valor enetero y le asgina un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$' ;//Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        
    }     
}
