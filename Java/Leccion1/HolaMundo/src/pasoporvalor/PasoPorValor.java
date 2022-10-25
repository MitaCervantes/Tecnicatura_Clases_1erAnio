
package pasoporvalor;


public class PasoPorValor {
     public static void main(String[] args) {
        var x = 20;
        System.out.println("x = " + x);
        
        cambioValor(x);//solo le enviamos una copia
        
        System.out.println("nuevo valor x = " + x);
    }
  //Cuando se pasan tipos primitivos se pasan solamente una copia de ese valor  
    public static void cambioValor(int arg1){//parametro por valor
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
