/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico;

import com.mycompany.analizadorsintactico.automatas_de_pila.*;
import com.mycompany.analizadorsintactico.singletons.Contador;
import com.mycompany.analizadorsintactico.token.TipoToken;
import com.mycompany.analizadorsintactico.token.Token;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author rafael-cayax
 */
public class AnalizadorSintactico {

    private final List<List<Token>> tablaC;
    private final List<Token> erroresS;
    private final CreacionDatabase baseDeDatos;
    private final ActualizacionTabla actu;
    private final CreacionTablas tabla;
    private final Eliminacion delete;
    private final Contador contador;
    private final Modificador mod;
    private final Insert insert;
    private final Lectura select;
    private int create;
    private int delet;
    private int update;
    private int selec;
    private int isert;
    private int alter;

    public AnalizadorSintactico() {
        tablaC = new ArrayList<>();
        contador = Contador.conseguirContador();
        baseDeDatos = new CreacionDatabase();
        tabla = new CreacionTablas();
        delete = new Eliminacion();
        actu = new ActualizacionTabla();
        mod = new Modificador();
        insert = new Insert();
        select = new Lectura();
        erroresS = new ArrayList<>();
    }

    private List<Token> lista;

    public void analizar(List<Token> lista) {
        filtrarComentario(lista);
        tablaC.clear();
        erroresS.clear();
        contador.reiniciarContador();
        create = 0;
        delet = 0;
        update = 0;
        selec = 0;
        isert++;
        alter = 0;
        while (contador.getContadorActual() < this.lista.size()) {
            if (baseDeDatos.analizar(this.lista)) {
                contador.guardarPunto();
                create++;
                System.out.println("cadena aceptada");
            } else if (tabla.analizar(this.lista)) {
                contador.guardarPunto();
                tablaC.add(tabla.getTabla());
                create++;
                System.out.println("creacion de tabla");
            } else if (actu.analizar(this.lista)) {
                contador.guardarPunto();
                update++;
                System.out.println("actualizacion tabla");
            } else if (delete.analizar(this.lista)) {
                contador.guardarPunto();
                delet++;
                System.out.println("es eleiminacion");
            } else if (mod.analizar(this.lista)) {
                contador.guardarPunto();
                alter++;
                System.out.println("es modificador");
            } else if (insert.analizar(this.lista)) {
                contador.guardarPunto();
                isert++;
                System.out.println("es insert");
            } else if (select.analizar(this.lista)) {
                contador.guardarPunto();
                selec++;
                System.out.println("es un select");
            } else {
                contador.regresarPuntoGuardado();
                contador.guardarPunto();
                System.out.println("cadena invalida");
                Token token = this.lista.get(contador.getContadorActual());
                erroresS.add(token);
                contador.aumentarYObtener();
            }
        }

    }

    private void filtrarComentario(List<Token> lista1) {
        Predicate<Token> isNotComment = token -> token.getToken() != TipoToken.COMENTARIO;
        this.lista = lista1.stream()
                .filter(isNotComment)
                .collect(Collectors.toList());
    }

    public List<List<Token>> getTablaC() {
        return tablaC;
    }

    public int getCreate() {
        return create;
    }

    public int getDelet() {
        return delet;
    }

    public int getUpdate() {
        return update;
    }

    public int getSelec() {
        return selec;
    }

    public int getAlter() {
        return alter;
    }

    public int getIsert() {
        return isert;
    }

    public List<Token> getErroresS() {
        return erroresS;
    }
    
}
