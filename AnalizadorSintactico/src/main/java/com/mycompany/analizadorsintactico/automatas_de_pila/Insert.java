/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico.automatas_de_pila;

import com.mycompany.analizadorsintactico.otros.Transicion;
import com.mycompany.analizadorsintactico.token.Token;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class Insert extends AutomataPila{

    public Insert() {
        super();
        transiciones.add(new Transicion(Arrays.asList('i','n','f','(','f',')','v','G'),'S'));
        transiciones.add(new Transicion(Arrays.asList('f',',','f'),'f'));
        transiciones.add(new Transicion(Arrays.asList('d',',','d'),'d'));
        transiciones.add(new Transicion(Arrays.asList('d','+','d'),'d'));
        transiciones.add(new Transicion(Arrays.asList('U','+','d'),'d'));
        transiciones.add(new Transicion(Arrays.asList('d','+','U'),'d'));
        transiciones.add(new Transicion(Arrays.asList('d','r','U'),'d'));
        transiciones.add(new Transicion(Arrays.asList('U','r','d'),'d'));
        transiciones.add(new Transicion(Arrays.asList('d','r','d'),'d'));
        transiciones.add(new Transicion(Arrays.asList('(','d',')'),'U'));
        transiciones.add(new Transicion(Arrays.asList('U',',','U'),'U'));
        transiciones.add(new Transicion(Arrays.asList('U',';'),'G'));

    }

    @Override
    protected void apilar(List<Token> tokens) throws TokenException {
        boolean finInstruccion = false;
        while(!finInstruccion && contador.getContadorActual() < tokens.size()){
            Token token = tokens.get(contador.getContadorActual());
            switch(token.getToken()){
                case INSERT -> pila.add('i');
                case INTO -> pila.add('n');
                case VALUES -> pila.add('v');
                case PAREMTESIS_A -> pila.add('(');
                case PAREMTESIS_B -> pila.add(')');
                case SIGNOS_COMA -> pila.add(',');
                case IDENTIFICADOR -> pila.add('f');
                case ENTERO -> pila.add('d');
                case DECIMAL -> pila.add('d');
                case FECHA -> pila.add('d');
                case CADENA -> pila.add('d');
                case BOOLEANO -> pila.add('d');
                case ARITMETICO -> pila.add('+');
                case RELACIONAL -> pila.add('r');
                case SIGNOS_PUNTO_Y_COMA -> {
                    pila.add(';');
                    finInstruccion = true;
                }
                default -> {
                    throw new TokenException();
                }
            }
            evaluarPila();
            contador.aumentarYObtener();
        }
    }
    
}
