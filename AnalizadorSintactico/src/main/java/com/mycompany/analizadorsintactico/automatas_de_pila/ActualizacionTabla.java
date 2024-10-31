/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico.automatas_de_pila;

import com.mycompany.analizadorsintactico.otros.Transicion;
import com.mycompany.analizadorsintactico.token.TipoToken;
import com.mycompany.analizadorsintactico.token.Token;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author rafael-cayax
 */
public class ActualizacionTabla extends AutomataPila{
    
    public ActualizacionTabla() {
        super();
        transiciones.add(new Transicion(Arrays.asList('u','i','s','G'),'S'));
        transiciones.add(new Transicion(Arrays.asList('H','W'),'G'));
        transiciones.add(new Transicion(Arrays.asList('H',',','H'),'H'));
        transiciones.add(new Transicion(Arrays.asList('i','=','d'),'H'));
        transiciones.add(new Transicion(Arrays.asList('w','K'),'W'));
        transiciones.add(new Transicion(Arrays.asList('w','G'),'W'));
        transiciones.add(new Transicion(Arrays.asList('d','y','d'),'d'));
        transiciones.add(new Transicion(Arrays.asList('i','y','d'),'d'));
        transiciones.add(new Transicion(Arrays.asList('d','y','i'),'d'));
        transiciones.add(new Transicion(Arrays.asList('H','a','L'),'L'));
        transiciones.add(new Transicion(Arrays.asList('L','a','H'),'L'));
        transiciones.add(new Transicion(Arrays.asList('L','a','L'),'L'));
        transiciones.add(new Transicion(Arrays.asList('i','=','i'),'L'));
        transiciones.add(new Transicion(Arrays.asList('d','=','i'),'L'));
        transiciones.add(new Transicion(Arrays.asList('d','=','d'),'L'));
        transiciones.add(new Transicion(Arrays.asList('d','c','d'),'L'));
        transiciones.add(new Transicion(Arrays.asList('i','c','d'),'L'));
        transiciones.add(new Transicion(Arrays.asList('d','c','i'),'L'));
        transiciones.add(new Transicion(Arrays.asList('i','c','i'),'L'));
        transiciones.add(new Transicion(Arrays.asList('L',';'),'K'));
        transiciones.add(new Transicion(Arrays.asList('H',';'),'G'));
    }

    @Override
    protected void apilar(List<Token> tokens) throws TokenException {
        boolean finInstruccion = false;
        while(!finInstruccion && contador.getContadorActual() < tokens.size()){
            Token token = tokens.get(contador.getContadorActual());
            switch(token.getToken()){
                case UPDATE -> pila.add('u');
                case IDENTIFICADOR -> pila.add('i');
                case SIGNOS_PUNTO -> pila.add('.');
                case SET -> pila.add('s');
                case SIGNOS_IGUAL -> pila.add('=');
                case LOGICO -> pila.add('a');
                case DECIMAL -> pila.add('d');
                case ENTERO -> pila.add('d');
                case FECHA -> pila.add('d');
                case CADENA -> pila.add('d');
                case BOOLEANO -> pila.add('d');
                case WHERE -> pila.add('w');
                case RELACIONAL -> pila.add('c');
                case ARITMETICO -> pila.add('y');
                case SIGNOS_COMA -> pila.add(',');
                case TipoToken.SIGNOS_PUNTO_Y_COMA -> {
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
