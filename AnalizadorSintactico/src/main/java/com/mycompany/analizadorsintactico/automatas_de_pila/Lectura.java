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
public class Lectura extends AutomataPila{

    public Lectura() {
        super();
        transiciones.add(new Transicion(Arrays.asList('s','i','f','i',';'),'S'));
        transiciones.add(new Transicion(Arrays.asList('s','*','f','i',';'),'S'));
        transiciones.add(new Transicion(Arrays.asList('s','I','f','i',';'),'S'));
        transiciones.add(new Transicion(Arrays.asList('s','M','f','i',';'),'S'));
        transiciones.add(new Transicion(Arrays.asList('s','K','f','i',';'),'S'));
        transiciones.add(new Transicion(Arrays.asList('s','*','f','i',';'),'S'));
        transiciones.add(new Transicion(Arrays.asList('s','K','f','U'),'S'));
        transiciones.add(new Transicion(Arrays.asList('s','M','f','U'),'S'));
        transiciones.add(new Transicion(Arrays.asList('s','I','f','U'),'S'));
        transiciones.add(new Transicion(Arrays.asList('s','i','f','U'),'S'));
        transiciones.add(new Transicion(Arrays.asList('a','(','i',')'),'I'));
        transiciones.add(new Transicion(Arrays.asList('I',',','I'),'I'));
        transiciones.add(new Transicion(Arrays.asList('i',',','i'),'I'));
        transiciones.add(new Transicion(Arrays.asList('i',',','I'),'I'));
        transiciones.add(new Transicion(Arrays.asList('i','s','i'),'M'));
        transiciones.add(new Transicion(Arrays.asList('M',',','i'),'M'));
        transiciones.add(new Transicion(Arrays.asList('i',',','M'),'M'));
        transiciones.add(new Transicion(Arrays.asList('M',',','M'),'M'));
        transiciones.add(new Transicion(Arrays.asList('I','s','i'),'I'));
        transiciones.add(new Transicion(Arrays.asList('I',',','i'),'I'));
        transiciones.add(new Transicion(Arrays.asList('i','.','i'),'K'));
        transiciones.add(new Transicion(Arrays.asList('K',',','K'),'I'));
        transiciones.add(new Transicion(Arrays.asList('K',',','i'),'I'));
        transiciones.add(new Transicion(Arrays.asList('i',',','K'),'I'));
        transiciones.add(new Transicion(Arrays.asList('G',';'),'U'));
        transiciones.add(new Transicion(Arrays.asList('G','J',';'),'U'));
        transiciones.add(new Transicion(Arrays.asList('i','j','L','O'),'G'));
        transiciones.add(new Transicion(Arrays.asList('L','j','L','O'),'G'));
        transiciones.add(new Transicion(Arrays.asList('L','j','i','O'),'G'));
        transiciones.add(new Transicion(Arrays.asList('i','j','i','O'),'G'));
        transiciones.add(new Transicion(Arrays.asList('o','i','=','i'),'O'));
        transiciones.add(new Transicion(Arrays.asList('o','K','=','i'),'O'));
        transiciones.add(new Transicion(Arrays.asList('o','i','=','K'),'O'));
        transiciones.add(new Transicion(Arrays.asList('i','i'),'L'));
        transiciones.add(new Transicion(Arrays.asList('L',',','L'),'1'));
        transiciones.add(new Transicion(Arrays.asList('1',',','L'),'1'));
        transiciones.add(new Transicion(Arrays.asList('i','w','Q',';'),'U'));
        transiciones.add(new Transicion(Arrays.asList('K','w','Q',';'),'U'));
        transiciones.add(new Transicion(Arrays.asList('1','w','Q',';'),'U'));
        transiciones.add(new Transicion(Arrays.asList('w','Q','P'),'U'));
        transiciones.add(new Transicion(Arrays.asList('w','Q','B'),'U'));
        transiciones.add(new Transicion(Arrays.asList('d','=','d'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('i','=','i'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('d','=','i'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('e','=','i'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('i','=','d'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('i','=','e'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('i','r','d'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('i','r','e'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('d','r','i'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('e','r','i'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('d','r','d'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('e','r','e'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('i','r','i'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('Q','g','Q'),'Q'));
        transiciones.add(new Transicion(Arrays.asList('i','#','&','i'),'P'));
        transiciones.add(new Transicion(Arrays.asList('1','#','&','i'),'P'));
        transiciones.add(new Transicion(Arrays.asList('K','#','&','i'),'P'));
        transiciones.add(new Transicion(Arrays.asList('#','&','i'),'P'));
        transiciones.add(new Transicion(Arrays.asList('#','&','i'),'P'));
        transiciones.add(new Transicion(Arrays.asList('P',';'),'U'));
        transiciones.add(new Transicion(Arrays.asList('P','B'),'U'));
        transiciones.add(new Transicion(Arrays.asList('0','&','i','/'),'B'));
        transiciones.add(new Transicion(Arrays.asList('B',';'),'U'));
        transiciones.add(new Transicion(Arrays.asList('l','e'),'9'));
        transiciones.add(new Transicion(Arrays.asList('P','9',';'),'U'));
        transiciones.add(new Transicion(Arrays.asList('9',';'),'U'));
    }

    @Override
    protected void apilar(List<Token> tokens) throws TokenException {
        boolean finInstruccion = false;
        while(!finInstruccion && contador.getContadorActual() < tokens.size()){
            Token token = tokens.get(contador.getContadorActual());
            switch(token.getToken()){
                case SELECT -> pila.add('s');
                case FROM -> pila.add('f');
                case IDENTIFICADOR -> pila.add('i');
                case FUNCION_DE_AGREGACION -> pila.add('a');
                case PAREMTESIS_A -> pila.add(')');
                case PAREMTESIS_B -> pila.add(')');
                case SIGNOS_PUNTO -> pila.add('.');
                case SIGNOS_COMA -> pila.add(',');
                case AS -> pila.add('s');
                case JOIN -> pila.add('j');
                case ON -> pila.add('o');
                case LIMIT -> pila.add('l');
                case ENTERO -> pila.add('e');
                case WHERE -> pila.add('w');
                case FECHA -> pila.add('d');
                case CADENA -> pila.add('d');
                case DECIMAL -> pila.add('d');
                case BOOLEANO -> pila.add('d');
                case SIGNOS_IGUAL -> pila.add('=');
                case LOGICO -> pila.add('g');
                case RELACIONAL -> pila.add('r');
                case GROUP -> pila.add('#');
                case DESC -> pila.add('?');
                case ORDER -> pila.add('0');
                case ASC -> pila.add('?');
                case BY -> pila.add('&');
                case ARITMETICO -> {
                    if (token.getLexema().equals("*")) {
                        pila.add('*');
                    } else {
                        pila.add('+');
                    }
                }
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
