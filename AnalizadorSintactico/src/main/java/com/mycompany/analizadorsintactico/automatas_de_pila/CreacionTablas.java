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
public class CreacionTablas extends AutomataPila{
    
    public CreacionTablas() {
        super();
        transiciones.add(new Transicion(Arrays.asList('i','T'),'D'));
        transiciones.add(new Transicion(Arrays.asList('D',',','D'),'D'));
        transiciones.add(new Transicion(Arrays.asList('D','o','n'),'D'));
        transiciones.add(new Transicion(Arrays.asList('D','p','k'),'D'));
        transiciones.add(new Transicion(Arrays.asList('D','u'),'D'));
        transiciones.add(new Transicion(Arrays.asList('e', '(', 'm', ',', 'm', ')'),'T'));
        transiciones.add(new Transicion(Arrays.asList('z','i','f','k','(','i',')','r','i','(','i',')'),'L'));
        transiciones.add(new Transicion(Arrays.asList('v','(','m',')'),'T'));
        transiciones.add(new Transicion(Arrays.asList('d','(','m',',','m',')'),'T'));
        transiciones.add(new Transicion(Arrays.asList('c','t','i','(','E',';'),'S'));
        transiciones.add(new Transicion(Arrays.asList('D',')'),'E'));
        transiciones.add(new Transicion(Arrays.asList('D',',','L',')'),'E'));
    }
    
    @Override
    protected void apilar(List<Token> tokens) throws TokenException{
        boolean finInstruccion = false;
        while(!finInstruccion && contador.getContadorActual() < tokens.size()){
            Token token = tokens.get(contador.getContadorActual());
            switch(token.getToken()){
                case CREATE -> pila.add('c');
                case TABLE -> pila.add('t');
                case BOOLEAN -> pila.add('T');
                case BIGINT -> pila.add('T');
                case DECIMAL_TIPO -> pila.add('d');
                case FOREIGN -> pila.add('f');
                case INTEGER -> pila.add('T');
                case PAREMTESIS_A -> pila.add('(');
                case IDENTIFICADOR -> pila.add('i');
                case PAREMTESIS_B -> pila.add(')');
                case KEY -> pila.add('k');
                case SIGNOS_COMA -> pila.add(',');
                case ENTERO -> pila.add('m');
                case NULL -> pila.add('n');
                case LOGICO_NOT -> pila.add('o');
                case PRIMARY -> pila.add('p');
                case NUMERIC -> pila.add('e');
                case REFERENCES -> pila.add('r');
                case SERIAL -> pila.add('T');
                case UNIQUE -> pila.add('u');
                case VARCHAR -> pila.add('v');
                case TEXT -> pila.add('T');
                case DATE -> pila.add('T');
                case CONSTRAINT -> pila.add('z');
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
