/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.analizadorsintactico.automatas_de_pila;

/**
 *
 * @author rafael-cayax
 */
public class TokenException extends Exception {

    /**
     * Creates a new instance of <code>TokenException</code> without detail
     * message.
     */
    public TokenException() {
    }

    /**
     * Constructs an instance of <code>TokenException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TokenException(String msg) {
        super(msg);
    }
}
