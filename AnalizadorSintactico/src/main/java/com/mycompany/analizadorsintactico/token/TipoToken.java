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
    ARITMETICO("Negro"),
    BOOLEANO("Azul"),
    CADENA("Verde"),
    CREATE("Naranja"),
    COMENTARIO("Gris"),
    DECIMAL("Azul"),
    ENTERO("Azul"),
    ERROR("Rojo"),
    FECHA("Amarillo"),
    FUNCION_DE_AGREGACION("Azul"),
    IDENTIFICADOR("Fucsia"),
    LOGICO("Naranja"),
    SIGNOS("Negro"),
    RELACIONAL("Negro"),
    TIPO_DE_DATO("Morado");
    
    private final String color;

    private TipoToken(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}
