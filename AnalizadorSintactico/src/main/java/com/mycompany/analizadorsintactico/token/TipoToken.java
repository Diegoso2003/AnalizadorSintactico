/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.analizadorsintactico.token;

/**
 *
 * @author rafael-cayax
 */
public enum TipoToken {
    ARITMETICO("negro"),
    BOOLEANO("azul"),
    CADENA("verde"),
    CREATE("naranja"),
    COMENTARIO("gris"),
    DECIMAL("azul"),
    ENTERO("azul"),
    ERROR("indefinido"),
    FECHA("amarillo"),
    FUNCION_DE_AGREGACION("azul"),
    IDENTIFICADOR("fucsia"),
    LOGICO("naranja"),
    SIGNOS("negro"),
    RELACIONAL("negro"),
    TIPO_DE_DATO("morado");
    
    private final String color;

    private TipoToken(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}
