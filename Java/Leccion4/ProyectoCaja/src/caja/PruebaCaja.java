
package caja;


public class PruebaCaja {
    public static void main(String[] args) {//Metodo main
       //Variables locales      
       int num1 = 3;//Valores ingresados en codigo duro
       int num2= 2;
       int num3 = 6;
       
       Caja caja1 = new Caja();//Instanciamos el objeto: objeto vacio
       caja1.ancho = num1;//Le pasamos los valores al objeto
       caja1.largo = num2;
       caja1.profundo = num3;
       
       int resultado = caja1.calcular_volumen();//Llamamos al metodo
       System.out.println("resultado volumen de caja 1: " + resultado);//Primer resultado

       Caja caja2 = new Caja(2, 4, 6);//Llamamos al constructor 2 con nuevos argumentos
       //Llamamos con el nuevo objeto al método para un nuevo cálculo
       System.out.println("resultado volumen de caja 2: " + caja2.calcular_volumen());
    }
}
