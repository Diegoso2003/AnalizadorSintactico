/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico.automatas_de_pila;

import com.mycompany.analizadorsintactico.otros.Transicion;
import com.mycompany.analizadorsintactico.singletons.Contador;
import com.mycompany.analizadorsintactico.token.Token;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public abstract class AutomataPila {
    
    protected Contador contador;
    protected List<Transicion> transiciones;

    public AutomataPila() {
        pila = new LinkedList<>();
        contador = Contador.conseguirContador();
        transiciones = new ArrayList<>();
    }

    protected List<Character> pila;

    protected boolean esTransicion(List<Character> transicion) {
        int j = pila.size() - 1;
        for (int i = transicion.size() - 1; i >= 0; i--) {
            char p = pila.get(j);
            j--;
            char o = transicion.get(i);
            if (p != o) {
                return false;
            }
        }
        return true;
    }

    protected void removerLista(List<Character> transicion, char c) {
        for (int i = 0; i < transicion.size(); i++) {
            pila.removeLast();
        }
        pila.add(c);
    }
    
    public boolean analizar(List<Token> tokens){
        try {
            contador.regresarPuntoGuardado();
            contador.guardarPunto();
            apilar(tokens);
            evaluarPila();
            if ('S' != pila.getLast()) {
                return false;
            }
            pila.removeLast();
            return pila.isEmpty();
        } catch (TokenException ex) {
            return false;
        }
    }
    
    protected void evaluarPila(){
        boolean cambios;
        do {            
            cambios = false;
            for(Transicion t : transiciones){
                List<Character> lista = t.getLista();
                char c = t.getTransicion();
                if (pila.size()>= lista.size() && esTransicion(lista)) {
                    removerLista(lista, c);
                    cambios = true;
                }
            }
        } while (cambios);
    }
    protected abstract void apilar(List<Token> tokens) throws TokenException;
}
