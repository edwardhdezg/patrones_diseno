package org.example.decorator.decorator;

import org.example.decorator.Formateable;

abstract public class TextoDecorador implements Formateable { //Clase padre de todos los decoradores
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

}
