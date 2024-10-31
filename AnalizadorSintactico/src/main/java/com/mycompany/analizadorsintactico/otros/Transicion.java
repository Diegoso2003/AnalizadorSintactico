/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico.otros;

import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class Transicion {
    private final List<Character> lista;
    private final Character transicion;

    public Transicion(List<Character> lista, Character transicion) {
        this.lista = lista;
        this.transicion = transicion;
    }

    public List<Character> getLista() {
        return lista;
    }

    public Character getTransicion() {
        return transicion;
    }
    
    
}
