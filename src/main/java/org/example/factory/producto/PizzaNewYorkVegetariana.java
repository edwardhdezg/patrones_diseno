package org.example.factory.producto;

import org.example.factory.Pizza;

public class PizzaNewYorkVegetariana extends Pizza {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza Vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjena");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 180°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
