package org.example.factory;

abstract public class PizzeriaZonaAbstractFactory {
    public Pizza ordenarPizza(String tipo){
        Pizza pizza = crearPizzeria(tipo);
        System.out.println("-----Fabricando la pizza " +pizza.getNombre()+" -----");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract public Pizza crearPizzeria(String tipo);
}
