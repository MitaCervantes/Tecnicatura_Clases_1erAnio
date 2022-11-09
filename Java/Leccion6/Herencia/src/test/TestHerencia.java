package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Mita", 57.12);
        System.out.println("empleado1 = " + empleado1);
        
        Empleado empleado2 = new Empleado("Gabi", 35.24);
        System.out.println("empleado2 = " + empleado2);
        
        var fecha = new Date();
        
        Cliente cliente1 = new Cliente(fecha,true,"Maria", 'F', 28, "Santo Domingo 247");
        System.out.println("cliente1 = " + cliente1);
        
        Cliente cliente2 = new Cliente(fecha, false, "Marcos", 'M', 32, "Saenz Pena 1045");
        System.out.println("cliente2 = " + cliente2);
    }
}

