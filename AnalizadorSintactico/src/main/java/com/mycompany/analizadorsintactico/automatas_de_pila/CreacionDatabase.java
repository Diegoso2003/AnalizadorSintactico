/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico.automatas_de_pila;

import com.mycompany.analizadorsintactico.singletons.Contador;
import com.mycompany.analizadorsintactico.token.TipoToken;
import com.mycompany.analizadorsintactico.token.Token;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class CreacionDatabase {
    private Contador contador;
    private List<Character> pila;

    public CreacionDatabase() {
        contador = Contador.conseguirContador();
        pila = new LinkedList<>();
    }
    
    public boolean analizar(List<Token> tokens){
        contador.guardarPunto();
        List<Token> lista = tokens;
        pila.clear();
        pila.add(';');
        pila.add('i');
        pila.add('d');
        pila.add('c');
        while(contador.getContadorActual() < lista.size() && !pila.isEmpty()){
            Token token = lista.get(contador.getContadorActual());
            char c = pila.removeLast();
            switch(c){
                case 'c' -> {
                    if (token.getToken() != TipoToken.CREATE) {
                        return false;
                    }
                }
                case 'd' -> {
                    if (token.getToken() != TipoToken.DATABASE) {
                        return false;
                    }
                }
                case 'i' -> {
                    if (token.getToken() != TipoToken.IDENTIFICADOR) {
                        return false;
                    }
                }
                case ';' -> {
                    if(token.getToken() != TipoToken.SIGNOS_PUNTO_Y_COMA){
                        return false;
                    }
                }
                default -> {
                    return false;
                }
            }
            contador.aumentarYObtener();
        }
        return pila.isEmpty();
    }
}
