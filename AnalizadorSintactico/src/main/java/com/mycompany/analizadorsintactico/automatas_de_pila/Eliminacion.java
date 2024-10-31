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
public class Eliminacion extends AutomataPila{

    public Eliminacion() {
        super();
        transiciones.add(new Transicion(Arrays.asList('G'),'S'));
        transiciones.add(new Transicion(Arrays.asList('e','f','i',';'),'G'));
        transiciones.add(new Transicion(Arrays.asList('e','f','i','W'),'G'));
        transiciones.add(new Transicion(Arrays.asList('w','L'),'W'));
        transiciones.add(new Transicion(Arrays.asList('w','L'),'W'));
        transiciones.add(new Transicion(Arrays.asList('H',';'),'L'));
        transiciones.add(new Transicion(Arrays.asList('H',',','H'),'H'));
        transiciones.add(new Transicion(Arrays.asList('d','=','d'),'H'));
        transiciones.add(new Transicion(Arrays.asList('i','=','d'),'H'));
        transiciones.add(new Transicion(Arrays.asList('d','=','i'),'H'));
        transiciones.add(new Transicion(Arrays.asList('i','=','i'),'H'));
        transiciones.add(new Transicion(Arrays.asList('H','!','d'),'H'));
        transiciones.add(new Transicion(Arrays.asList('d','!','i'),'H'));
        transiciones.add(new Transicion(Arrays.asList('H','$','H'),'H'));
        transiciones.add(new Transicion(Arrays.asList('i','$','d'),'H'));
        transiciones.add(new Transicion(Arrays.asList('d','$','i'),'H'));
        transiciones.add(new Transicion(Arrays.asList('(','H',')'),'H'));
    }

    @Override
    protected void apilar(List<Token> tokens) throws TokenException {
        boolean finInstruccion = false;
        while(!finInstruccion && contador.getContadorActual() < tokens.size()){
            Token token = tokens.get(contador.getContadorActual());
            switch(token.getToken()){
                case DELETE -> pila.add('e');
                case FROM -> pila.add('f');
                case IDENTIFICADOR -> pila.add('i');
                case WHERE -> pila.add('w');
                case ENTERO -> pila.add('d');
                case DECIMAL -> pila.add('d');
                case CADENA -> pila.add('d');
                case FECHA -> pila.add('d');
                case BOOLEANO -> pila.add('d');
                case ARITMETICO -> pila.add('!');
                case RELACIONAL -> pila.add('$');
                case SIGNOS_IGUAL -> pila.add('=');
                case PAREMTESIS_A -> pila.add('(');
                case PAREMTESIS_B -> pila.add(')');
                case LOGICO -> pila.add(',');
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
