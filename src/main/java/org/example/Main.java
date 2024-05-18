package org.example;

import org.example.decorator.Formateable;
import org.example.decorator.Texto;
import org.example.decorator.decorator.MayusculaDecorador;
import org.example.decorator.decorator.ReversaDecorator;
import org.example.factory.Pizza;
import org.example.factory.PizzeriaNewYorkFactory;
import org.example.observer.Corporacion;
import org.example.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        //Prueba de implementacion de singleton
        /*
        for(int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getInstance();
            System.out.println("singleton = " + singleton);
        }

         */

        //prueba de implementacion de
        /*
        PizzeriaNewYorkFactory newYork= new PizzeriaNewYorkFactory();

        Pizza pizza= newYork.ordenarPizza("Pepperoni");
        System.out.println("Eduardo ordeno una pizza "+pizza.getNombre());

        pizza= newYork.ordenarPizza("Vegetariana");
        System.out.println("Diana ordeno una pizza "+pizza.getNombre());

         */


        //Prueba de implementacion de Decorator
        /*
        Formateable texto = new Texto("Eduardo");
        MayusculaDecorador mayuscula= new MayusculaDecorador(texto);
        ReversaDecorator reversa= new ReversaDecorator(texto);

        System.out.println(mayuscula.darFormato());
        System.out.println(reversa.darFormato());


         */

        //Implemenatacionn de Observer
        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver(observable -> System.out.println("Josue: "+observable));
        google.modificarPrecio(2000);

    }
}