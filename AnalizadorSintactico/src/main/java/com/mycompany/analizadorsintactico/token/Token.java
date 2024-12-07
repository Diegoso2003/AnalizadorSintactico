/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico.token;

/**
 *
 * @author rafael-cayax
 */
public class Token {
    private TipoToken token;
    private String lexema;
    private int columna;
    private int fila;

    public TipoToken getToken() {
        return token;
    }

    public void setToken(TipoToken token) {
        this.token = token;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Token{" + "token=" + token + ", lexema=" + lexema + ", columna=" + columna + ", fila=" + fila + '}';
    }

    }
