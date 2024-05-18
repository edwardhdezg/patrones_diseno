package org.example.singleton;

public class Singleton {

    private static Singleton instance; //Creamos una variable privada de la misma clase

    private Singleton() { //Creamos un constructor privado para que no se pueda instanciar desde afuera
        System.out.println("Simulando creacion de instancia singleton.... ");
    }

    public static Singleton getInstance() { //Creamos un metodo estatico para instancie una sola vez la clase Singleton
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
