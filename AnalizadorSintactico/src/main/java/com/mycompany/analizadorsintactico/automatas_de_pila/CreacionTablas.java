/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico.automatas_de_pila;

import com.mycompany.analizadorsintactico.token.TipoToken;
import com.mycompany.analizadorsintactico.token.Token;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class CreacionTablas extends AutomataPila{
    private char ultimo;
    private List<Character> transicion1;//
    private List<Character> transicion2;//
    private List<Character> transicion3;//
    private List<Character> transicion4;//
    private List<Character> transicion5;
    private List<Character> transicion6;
    private List<Character> transicion7;
    private List<Character> transicion8;
    private List<Character> transicion9;//
    private List<Character> transicion10;//
    private List<Character> transicion11;//
    private List<Character> transicion12;//
    private List<Character> transicion13;//
    private List<Character> transicion14;//
    private List<Character> transicion15;
    private List<Character> transicion16;//
    private List<Character> transicion17;//
    private List<Character> transicion18;//
    private List<Character> transicion19;//
    private List<Character> transicion20;
    private List<Character> transicion21;//
    
    public CreacionTablas() {
        super();
        transicion12 = Arrays.asList('i','T',' ');//D
        transicion4 = Arrays.asList('i','T',',','D');//D
        transicion1 = Arrays.asList('i','T','o','n',' ');//D
        transicion16 = Arrays.asList('i','T','o','n',',','D');//D
        transicion10 = Arrays.asList('i','T','p','k',' ');//D
        transicion2 = Arrays.asList('i','T','p','k',',','D');//D
        transicion11 = Arrays.asList('i','T','u',' ',' ');//D
        transicion14 = Arrays.asList('i','T','u',',','D');//D
        transicion3 = Arrays.asList('l');//T
        transicion5 = Arrays.asList('b');//T
        transicion6 = Arrays.asList('a');//T
        transicion7 = Arrays.asList('e', '(', 'm', ',', 'm', ')');//T
        transicion8 = Arrays.asList('g');//T
        transicion9 = Arrays.asList('z','i','f','k','(','i',')');//L
        transicion13 = Arrays.asList('v','(','m',')');//T
        transicion15 = Arrays.asList('s');//T
        transicion17 = Arrays.asList('d','(','m',',','m',')');//T
        transicion19 = Arrays.asList('c','t','i','(','E',')',';');//S
        transicion20 = Arrays.asList('x');//T
        transicion18 = Arrays.asList('D', ' ');//E
        transicion21 = Arrays.asList('D',',','L');//E
    }
    
    protected void apilar(List<Token> tokens) throws TokenException{
        boolean finInstruccion = false;
        while(!finInstruccion && contador.getContadorActual() < tokens.size()){
            Token token = tokens.get(contador.getContadorActual());
            switch(token.getToken()){
                case TipoToken.CREATE -> pila.add('c');
                case TipoToken.TABLE -> pila.add('t');
                case TipoToken.BOOLEAN -> pila.add('l');
                case TipoToken.BIGINT -> pila.add('b');
                case TipoToken.DECIMAL_TIPO -> pila.add('d');
                case TipoToken.FOREIGN -> pila.add('f');
                case TipoToken.INTEGER -> pila.add('g');
                case TipoToken.PAREMTESIS_A -> pila.add('(');
                case TipoToken.IDENTIFICADOR -> pila.add('i');
                case TipoToken.PAREMTESIS_B -> pila.add(')');
                case TipoToken.KEY -> pila.add('k');
                case TipoToken.SIGNOS_COMA -> pila.add(',');
                case TipoToken.ENTERO -> pila.add('m');
                case TipoToken.NULL -> pila.add('n');
                case TipoToken.LOGICO_NOT -> pila.add('o');
                case TipoToken.PRIMARY -> pila.add('p');
                case TipoToken.NUMERIC -> pila.add('e');
                case TipoToken.REFERENCES -> pila.add('r');
                case TipoToken.SERIAL -> pila.add('s');
                case TipoToken.UNIQUE -> pila.add('u');
                case TipoToken.VARCHAR -> pila.add('v');
                case TipoToken.TEXT -> pila.add('x');
                case TipoToken.DATE -> pila.add('a');
                case TipoToken.CONSTRAINT -> pila.add('z');
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

    @Override
    protected void evaluarPila() {
        boolean cambios = true;
        while(cambios){
            cambios = false;
            if (pila.size() >= 7 && esTransicion(transicion19)) {
                removerLista(transicion19, 'S');
                cambios = true;
            }
            if (pila.size() >= 7 && esTransicion(transicion9)) {
                removerLista(transicion9, 'L');
                cambios = true;
            }
            if (pila.size() >= 6 && esTransicion(transicion17)) {
                removerLista(transicion17, 'T');
                cambios = true;
            }
            if (pila.size() >= 6 && esTransicion(transicion16)) {
                removerLista(transicion16, 'D');
                cambios = true;
            }
            if (pila.size() >= 6 && esTransicion(transicion2)) {
                removerLista(transicion2, 'D');
                cambios = true;
            }
            if (pila.size() >= 6 && esTransicion(transicion7)) {
                removerLista(transicion7, 'T');
                cambios = true;
            }
            if (pila.size() >= 5 && esFinalVariables(transicion10)) {
                removerLista(transicion10, 'D');
                pila.add(ultimo);
                cambios = true;
            }
            if (pila.size() >= 5 && esTransicion(transicion14)) {
                removerLista(transicion14, 'D');
                cambios = true;
            }
            if (pila.size() >= 5 && esFinalVariables(transicion1)) {
                removerLista(transicion1, 'D');
                pila.add(ultimo);
                cambios = true;
            }
            if (pila.size() >= 4 && esTransicion(transicion4)) {
                removerLista(transicion4, 'D');
                cambios = true;
            }
            if (pila.size() >= 4 && esFinalVariables(transicion11)) {
                removerLista(transicion11, 'D');
                pila.add(ultimo);
                cambios = true;
            }
            if (pila.size() >= 4 && esTransicion(transicion13)) {
                removerLista(transicion13, 'T');
                cambios = true;
            }
            if (pila.size()>=4&&esVariableSimple(transicion12)) {
                removerLista(transicion12, 'D');
                pila.add(ultimo);
                cambios = true;
            }
            if (pila.size() >= 4 && esTransicion(transicion21)) {
                removerLista(transicion21, 'E');
                cambios = true;
            }
            if (pila.size() >= 2 && esFinalVariables(transicion18)) {
                removerLista(transicion18, 'E');
                pila.add(ultimo);
                cambios = true;
            }
            if (pila.size() >= 1 && esTransicion(transicion3)) {
                removerLista(transicion3, 'T');
                cambios = true;
            }
            if (pila.size() >= 1 && esTransicion(transicion5)) {
                removerLista(transicion5, 'T');
                cambios = true;
            }
            if (pila.size() >= 1 && esTransicion(transicion6)) {
                removerLista(transicion6, 'T');
                cambios = true;
            }
            if (pila.size() >= 1 && esTransicion(transicion8)) {
                removerLista(transicion8, 'T');
                cambios = true;
            }
            if (pila.size() >= 1 && esTransicion(transicion15)) {
                removerLista(transicion15, 'T');
                cambios = true;
            }
            if (pila.size() >= 1 && esTransicion(transicion20)) {
                removerLista(transicion20, 'T');
                cambios = true;
            }

        }
    }
    
    private boolean esFinalVariables(List<Character> transicion){
        int j = pila.size()-2;
        if (',' == pila.getLast()) {
            return false;
        }
        for (int i = transicion.size() - 2; i >= 0; i--) {
            char p = pila.get(j);
            j--;
            char o = transicion.get(i);
            if (p != o) {
                return false;
            }
        }
        ultimo = pila.getLast();
        return true;
    }
    
    private boolean esVariableSimple(List<Character> transicion){
        int j = pila.size()-2;
        if (',' == pila.getLast() || 'o' == pila.getLast() || 'u' == pila.getLast() || 'p' == pila.getLast()) {
            return false;
        }
        for (int i = transicion.size() - 2; i >= 0; i--) {
            char p = pila.get(j);
            j--;
            char o = transicion.get(i);
            if (p != o) {
                return false;
            }
        }
        ultimo = pila.getLast();
        return true;
    }
    
}
