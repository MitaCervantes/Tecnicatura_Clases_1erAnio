
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("pantalon",9500.00);
        Producto producto2 = new Producto("campera",29900.00);
        
        Orden orden1 = new Orden();
        //Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        //Tarea: 
        //Creas mas objetos de tipo producto = 10
        //Crear mas objetos de tip orden = 2
        
    }   
}
