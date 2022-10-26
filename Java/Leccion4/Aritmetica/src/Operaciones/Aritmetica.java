
package Operaciones;


public class Aritmetica {
    //Atributos de la Clase:
    int a;
    int b;
    
    //El constructor es un metodo especial
    // Constructor vacío
    public Aritmetica(){
        System.out.println("Ejecutando Constructor.");
    }
    //Sobrecarga de Constructores
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando Constructor con Argumentos.");
    }
   
    //Metodos:
    public void sumaNumeros() {
         int resultado = a + b;
         System.out.println("resultado = " + resultado);
    }
   
    public int sumarConRetorno(){
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;// el argumento a se asigna al atributo this.a
        this.b = arg2;
        //return a + b;
        return sumarConRetorno();
    }
}
