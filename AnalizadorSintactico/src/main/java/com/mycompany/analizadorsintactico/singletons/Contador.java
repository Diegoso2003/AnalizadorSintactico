/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico.singletons;

/**
 *
 * @author rafael-cayax
 */
public class Contador {
    private int contadorActual;
    private int puntoGuardado;
    private static Contador instance;
    
    private Contador(){
        contadorActual = 0;
        puntoGuardado = 0;
    }
    
    public static Contador conseguirContador(){
        if (instance == null) {
            instance = new Contador();
        }
        return instance;
    }

    public int getContadorActual(){
        return contadorActual;
    }
    
    public void setContadorActual(int i){
        this.contadorActual = i;
    }
    
    public int aumentarYObtener(){
        contadorActual++;
        return contadorActual;
    }
    
    public int disminuirYObtener(){
        contadorActual--;
        return contadorActual;
    }
    
    public int agregarYObtener(int i){
        contadorActual += i;
        return contadorActual;
    }
    
    public void guardarPunto(){
        this.puntoGuardado = this.contadorActual;
    }
    
    public void regresarPuntoGuardado(){
        this.contadorActual = this.puntoGuardado;
    }
    
    public int guardatPuntoInstruccion(){
        return contadorActual;
    }
    
    public void regresarPuntoInstruccion(int punto){
        this.contadorActual = punto;
    }
    
    public void reiniciarContador(){
        this.contadorActual = 0;
        this.puntoGuardado = 0;
    }
}
