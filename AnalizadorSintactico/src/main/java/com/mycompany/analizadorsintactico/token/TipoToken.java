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
    DECIMAL_TIPO("Morado"),
    ENTERO("Azul"),
    ERROR("Rojo"),
    FECHA("Amarillo"),
    FUNCION_DE_AGREGACION("Azul"),
    IDENTIFICADOR("Fucsia"),
    LOGICO("Naranja"),
    LOGICO_NOT("Naranja"),
    SIGNOS("Negro"),
    RELACIONAL("Negro"),
    TIPO_DE_DATO("Morado"), 
    PAREMTESIS_A("Negro"), 
    PAREMTESIS_B("Negro"), 
    SIGNOS_COMA("Negro"), 
    SIGNOS_PUNTO("Negro"), 
    SIGNOS_PUNTO_Y_COMA("Negro"), 
    SIGNOS_IGUAL("Negro"), 
    AS("Naranja"), 
    BY("Naranja"), 
    IF("Naranja"), 
    ON("Naranja"), 
    ADD("Naranja"), 
    ASC("Naranja"), 
    KEY("Naranja"), 
    SET("Naranja"), 
    DESC("Naranja"), 
    DROP("Naranja"), 
    FROM("Naranja"), 
    INTO("Naranja"), 
    JOIN("Naranja"), 
    NULL("Naranja"), 
    TYPE("Naranja"), 
    ALTER("Naranja"), 
    EXIST("Naranja"), 
    GROUP("Naranja"), 
    LIMIT("Naranja"), 
    ORDER("Naranja"), 
    TABLE("Naranja"), 
    WHERE("Naranja"), 
    COLUMN("Naranja"), 
    DELETE("Naranja"), 
    INSERT("Naranja"), 
    SELECT("Naranja"), 
    UNIQUE("Naranja"), 
    UPDATE("Naranja"), 
    VALUES("Naranja"), 
    CASCADE("Naranja"), 
    FOREIGN("Naranja"), 
    PRIMARY("Naranja"), 
    DATABASE("Naranja"), 
    CONSTRAINT("Naranja"), 
    REFERENCES("Naranja"), 
    SERIAL("Morado"), 
    BOOLEAN("Morado"), 
    INTEGER("Morado"), 
    NUMERIC("Morado"), 
    VARCHAR("Morado"), 
    BIGINT("Morado"), 
    TEXT("Morado"), 
    DATE("Morado");
    
    private final String color;

    private TipoToken(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}
