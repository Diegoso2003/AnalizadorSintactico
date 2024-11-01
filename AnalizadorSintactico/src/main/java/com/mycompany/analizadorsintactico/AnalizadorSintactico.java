/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico;

import com.mycompany.analizadorsintactico.automatas_de_pila.*;
import com.mycompany.analizadorsintactico.singletons.Contador;
import com.mycompany.analizadorsintactico.token.TipoToken;
import com.mycompany.analizadorsintactico.token.Token;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author rafael-cayax
 */
public class AnalizadorSintactico {

    private final CreacionDatabase baseDeDatos;
    private final ActualizacionTabla actu;
    private final CreacionTablas tabla;
    private final Eliminacion delete;
    private final Contador contador;
    private final Modificador mod;
    
    public AnalizadorSintactico() {
        contador = Contador.conseguirContador();
        baseDeDatos = new CreacionDatabase();
        tabla = new CreacionTablas();
        delete = new Eliminacion();
        actu = new ActualizacionTabla();
        mod = new Modificador();
    }
    
    private List<Token> lista;
    
    public void analizar(List<Token> lista) {
        filtrarComentario(lista);
        contador.reiniciarContador();
        while (contador.getContadorActual() < this.lista.size()) {
            if (baseDeDatos.analizar(this.lista)) {
                contador.guardarPunto();
                System.out.println("cadena aceptada");
            } else if (tabla.analizar(this.lista)) {
                contador.guardarPunto();
                System.out.println("creacion de tabla");
            } else if (actu.analizar(this.lista)) {
                contador.guardarPunto();
                System.out.println("actualizacion tabla");
            } else if (delete.analizar(this.lista)) {
                contador.guardarPunto();
                System.out.println("es eleiminacion");
            } else if (mod.analizar(this.lista)) {
                contador.guardarPunto();
                System.out.println("es modificador");
            } else {
                System.out.println("cadena invalida");
                return;
            }
        }
        
    }
    
    private void filtrarComentario(List<Token> lista1) {
        Predicate<Token> isNotComment = token -> token.getToken() != TipoToken.COMENTARIO;
        this.lista = lista1.stream()
                .filter(isNotComment)
                .collect(Collectors.toList());
    }
    
}
