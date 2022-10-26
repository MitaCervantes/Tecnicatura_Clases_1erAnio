
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
               
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        
        aritmetica1.sumaNumeros();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde la clase de prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12,26);
        System.out.println("Resultado usando argumentos = " + resultado);
        
        //Llama a constructor vacio:
        System.out.println("aritmetica1 a:  " + aritmetica1.a);
        System.out.println("aritmetica1 b:  " + aritmetica1.b);
        //Llama a constructor sobrecargado:
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a:  " + aritmetica2.a);
        System.out.println("aritmetica2 b:  " + aritmetica2.b); 
        
        Persona persona = new Persona("Vane", "Jimenez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre = " + persona.nombre);
        System.out.println("persona apellido = " + persona.apellido);
              
        //Variables locales para ver alcance:
        var a = 10;
        var b = 2;
        miMetodo();//llamamos al metodo nuevo
    }
    //Alcance de Variables:
    public static void miMetodo(){//Modularidad creamos un nuevo método.
         //la variable "a" esta fuera del alcance de donde fue definida
         //a = 10;
         System.out.println("Aqui hay otro metodo.");            
    }
   }
class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){//constructor
        //super(); llamada al constructor de la clase Padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this = " + this);
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
    }
}
class Imprimir{
    
    public Imprimir(){
        super();//el constructor de la clase object (padre) para reservar memoria
    }
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir:" + persona);
        System.out.println("Impresion del objeto actual(this)" + this);
    }
}
