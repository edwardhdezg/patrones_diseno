package org.example.decorator.decorator;

import org.example.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador{
    public MayusculaDecorador(Formateable texto) {
        super(texto);
    } //CLase hija de la clase TextoDecorador

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase(); //Lo decordeamos en mayusculas
    }
}
