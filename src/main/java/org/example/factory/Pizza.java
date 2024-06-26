package org.example.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public Pizza(){
        this.ingredientes= new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando la pizza "+nombre);
        System.out.println("Seleccionando la masa "+masa);
        System.out.println("Agregando salsa "+salsa);
        System.out.println("Agregando ingredientes:");
        this.ingredientes.forEach(System.out::println);
    }

    abstract public void cocinar();

    abstract public void cortar();

    public void empaquetar(){
        System.out.println("Poniendo la pizza en una caja de empaque...");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }

}
