package org.example.decorator.decorator;

import org.example.decorator.Formateable;

public class ReversaDecorator extends TextoDecorador{ //Clase hija de la clase TextoDecorador

    public ReversaDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return new StringBuilder(texto.darFormato()).reverse().toString();
    }
}
