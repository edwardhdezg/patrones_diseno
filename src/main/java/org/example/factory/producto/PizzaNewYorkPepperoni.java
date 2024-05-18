package org.example.factory.producto;

import org.example.factory.Pizza;

public class PizzaNewYorkPepperoni extends Pizza {

    public PizzaNewYorkPepperoni() {
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinnando por 20 min a 180°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas triangulares");
    }
}
