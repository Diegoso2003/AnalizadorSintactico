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
public class Modificador extends AutomataPila{

    public Modificador() {
        super();
        transiciones.add(new Transicion(Arrays.asList('d','t','f','e','i','c',';'),'G'));
        transiciones.add(new Transicion(Arrays.asList('G'),'S'));
        transiciones.add(new Transicion(Arrays.asList('a','t','i','C',';'),'G'));
        transiciones.add(new Transicion(Arrays.asList('v','(','m',')'),'T'));
        transiciones.add(new Transicion(Arrays.asList('l','(','m',',','m',')'),'T'));
        transiciones.add(new Transicion(Arrays.asList('n','(','m',',','m',')'),'T'));
        transiciones.add(new Transicion(Arrays.asList('z','x','i','T'),'C'));
        transiciones.add(new Transicion(Arrays.asList('a','x','i','y','T'),'C'));
        transiciones.add(new Transicion(Arrays.asList('d','x','i'),'C'));
        transiciones.add(new Transicion(Arrays.asList('z','q','i','u','(','i',')'),'C'));
        transiciones.add(new Transicion(Arrays.asList('z','q','i','g','k','(','i',')','r','i','(','i',')'),'C'));
    }
    
    @Override
    protected void apilar(List<Token> tokens) throws TokenException {
        boolean finInstruccion = false;
        while(!finInstruccion && contador.getContadorActual() < tokens.size()){
            Token token = tokens.get(contador.getContadorActual());
            switch(token.getToken()){
                case DROP -> pila.add('d');
                case TABLE -> pila.add('t');
                case IF -> pila.add('f');
                case EXIST -> pila.add('e');
                case IDENTIFICADOR -> pila.add('i');
                case CASCADE -> pila.add('c');
                case ALTER -> pila.add('a');
                case SERIAL -> pila.add('T');
                case INTEGER -> pila.add('T');
                case BIGINT -> pila.add('T');
                case VARCHAR -> pila.add('v');
                case ENTERO -> pila.add('m');
                case PAREMTESIS_A -> pila.add('(');
                case PAREMTESIS_B -> pila.add(')');
                case DECIMAL_TIPO -> pila.add('l');
                case SIGNOS_COMA -> pila.add(',');
                case NUMERIC -> pila.add('n');
                case DATE -> pila.add('T');
                case TEXT -> pila.add('T');
                case BOOLEAN -> pila.add('T');
                case ADD -> pila.add('z');
                case COLUMN -> pila.add('x');
                case TYPE -> pila.add('y');
                case CONSTRAINT -> pila.add('q');
                case UNIQUE -> pila.add('u');
                case FOREIGN -> pila.add('g');
                case KEY -> pila.add('k');
                case REFERENCES -> pila.add('r');
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
