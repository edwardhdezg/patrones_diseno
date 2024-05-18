package org.example.factory;

import org.example.factory.producto.PizzaNewYorkPepperoni;
import org.example.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    public Pizza crearPizzeria(String tipo) {
        Pizza pizza = null;
        switch (tipo) {
            case "Pepperoni":
                pizza = new PizzaNewYorkPepperoni();
                break;
            case "Vegetariana":
                pizza = new PizzaNewYorkVegetariana();
                break;
        }
        return pizza;
    }
}
