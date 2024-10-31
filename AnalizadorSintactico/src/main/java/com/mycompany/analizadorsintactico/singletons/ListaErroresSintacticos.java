/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico.singletons;

import com.mycompany.analizadorsintactico.token.Token;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class ListaErroresSintacticos {
    private static ListaErroresSintacticos lista;
    private List<Token> errores;
    
    private ListaErroresSintacticos(){
        errores = new ArrayList<>();
    }
    
    public static ListaErroresSintacticos conseguirLista(){
        if (lista == null) {
            lista = new ListaErroresSintacticos();
        }
        return lista;
    }
    
    public void agregarToken(Token token){
        errores.add(token);
    }
    
    public void limpiarLista(){
        errores.clear();
    }

    public List<Token> getErrores() {
        return errores;
    }
    
}
