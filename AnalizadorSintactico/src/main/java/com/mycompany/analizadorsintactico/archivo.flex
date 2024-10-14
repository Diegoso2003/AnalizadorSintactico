package com.mycompany.analizadorsintactico;

//Seccion de imports
import com.mycompany.analizadorsintactico.token.Token;
import com.mycompany.analizadorsintactico.token.TipoToken;
import java.util.ArrayList;
import java.util.List;

%%
%{

// Codigo Java

    private List<Token> lista = new ArrayList<>();
    private List<Token> listaErrores = new ArrayList<>();

    private void addList(TipoToken tipo, int fila, int columna) {
        Token token = new Token();
        token.setFila(fila);
        token.setColumna(columna);
        token.setToken(tipo);
        token.setLexema(yytext());
        lista.add(token);
    }

    private void addListaErrores(int fila, int columna) {
        Token token = new Token();
        token.setFila(fila);
        token.setColumna(columna);
        token.setToken(TipoToken.ERROR);
        token.setLexema(yytext());
        lista.add(token);
    }

    public List<Token> getLista(){
        return lista;
    }
    
    public List<Token> getListaErrores(){
        return listaErrores;
    }

%}

// Configuracion
%public
%class AnalizadorLexico1
%unicode
%line
%column
%standalone

// Expresiones Regulares
D = [0-9]
ENTERO = [0-9]+
LETRA = [a-z]+
ESPACIOS = [" "\r\t\b\n]


%%
// Reglas de Escaneo de Expresiones
{ESPACIOS}                                  { /*Ignore*/ }
"ADD"                                       { addList(TipoToken.CREATE, yyline, yycolumn); }
"ALTER"                                     { addList(TipoToken.CREATE, yyline, yycolumn); }
"AND"                                       { addList(TipoToken.LOGICO, yyline, yycolumn); }
"ASC"                                       { addList(TipoToken.CREATE, yyline, yycolumn); }
"AS"                                        { addList(TipoToken.CREATE, yyline, yycolumn); }
"AVG"                                       { addList(TipoToken.FUNCION_DE_AGREGACION, yyline, yycolumn); }
"BIGINT"                                    { addList(TipoToken.TIPO_DE_DATO, yyline, yycolumn); }
"BOOLEAN"                                   { addList(TipoToken.TIPO_DE_DATO, yyline, yycolumn); }
"BY"                                        { addList(TipoToken.CREATE, yyline, yycolumn); }
"CASCADE"                                   { addList(TipoToken.CREATE, yyline, yycolumn); }
"COLUMN"                                    { addList(TipoToken.CREATE, yyline, yycolumn); }
"CONSTRAINT"                                { addList(TipoToken.CREATE, yyline, yycolumn); }
"COUNT"                                     { addList(TipoToken.FUNCION_DE_AGREGACION, yyline, yycolumn); }
"CREATE"                                    { addList(TipoToken.CREATE, yyline, yycolumn); }
"DATABASE"                                  { addList(TipoToken.CREATE, yyline, yycolumn); }
"DATE"                                      { addList(TipoToken.TIPO_DE_DATO, yyline, yycolumn); }
"DECIMAL"                                   { addList(TipoToken.TIPO_DE_DATO, yyline, yycolumn); }
"DELETE"                                    { addList(TipoToken.CREATE, yyline, yycolumn); }
"DESC"                                      { addList(TipoToken.CREATE, yyline, yycolumn); }
"DROP"                                      { addList(TipoToken.CREATE, yyline, yycolumn); }
"EXIST"                                     { addList(TipoToken.CREATE, yyline, yycolumn); }
"FALSE"                                     { addList(TipoToken.BOOLEANO, yyline, yycolumn); }
"FOREIGN"                                   { addList(TipoToken.CREATE, yyline, yycolumn); }
"FROM"                                      { addList(TipoToken.CREATE, yyline, yycolumn); }
"GROUP"                                     { addList(TipoToken.CREATE, yyline, yycolumn); }
"IF"                                        { addList(TipoToken.CREATE, yyline, yycolumn); }
"INSERT"                                    { addList(TipoToken.CREATE, yyline, yycolumn); }
"INTEGER"                                   { addList(TipoToken.TIPO_DE_DATO, yyline, yycolumn); }
"INTO"                                      { addList(TipoToken.CREATE, yyline, yycolumn); }
"JOIN"                                      { addList(TipoToken.CREATE, yyline, yycolumn); }
"KEY"                                       { addList(TipoToken.CREATE, yyline, yycolumn); }
"LIMIT"                                     { addList(TipoToken.CREATE, yyline, yycolumn); }
"MAX"                                       { addList(TipoToken.FUNCION_DE_AGREGACION, yyline, yycolumn); }
"MIN"                                       { addList(TipoToken.FUNCION_DE_AGREGACION, yyline, yycolumn); }
"NOT"                                       { addList(TipoToken.LOGICO, yyline, yycolumn); }
"NULL"                                      { addList(TipoToken.CREATE, yyline, yycolumn); }
"ON"                                        { addList(TipoToken.CREATE, yyline, yycolumn); }
"ORDER"                                     { addList(TipoToken.CREATE, yyline, yycolumn); }
"OR"                                        { addList(TipoToken.LOGICO, yyline, yycolumn); }
"PRIMARY"                                   { addList(TipoToken.CREATE, yyline, yycolumn); }
"REFERENCES"                                { addList(TipoToken.CREATE, yyline, yycolumn); }
"SELECT"                                    { addList(TipoToken.CREATE, yyline, yycolumn); }
"SERIAL"                                    { addList(TipoToken.TIPO_DE_DATO, yyline, yycolumn); }
"SET"                                       { addList(TipoToken.CREATE, yyline, yycolumn); }
"SUM"                                       { addList(TipoToken.FUNCION_DE_AGREGACION, yyline, yycolumn); }
"TABLE"                                     { addList(TipoToken.CREATE, yyline, yycolumn); }
"TEXT"                                      { addList(TipoToken.TIPO_DE_DATO, yyline, yycolumn); }
"TRUE"                                      { addList(TipoToken.BOOLEANO, yyline, yycolumn); }
"TYPE"                                      { addList(TipoToken.CREATE, yyline, yycolumn); }
"UNIQUE"                                    { addList(TipoToken.CREATE, yyline, yycolumn); }
"UPDATE"                                    { addList(TipoToken.CREATE, yyline, yycolumn); }
"VALUES"                                    { addList(TipoToken.CREATE, yyline, yycolumn); }
"VARCHAR"                                   { addList(TipoToken.TIPO_DE_DATO, yyline, yycolumn); }
"WHERE"                                     { addList(TipoToken.CREATE, yyline, yycolumn); }
"<="                                        { addList(TipoToken.RELACIONAL, yyline, yycolumn); }
"<"                                         { addList(TipoToken.RELACIONAL, yyline, yycolumn); }
">="                                        { addList(TipoToken.RELACIONAL, yyline, yycolumn); }
">"                                         { addList(TipoToken.RELACIONAL, yyline, yycolumn); }
"+"                                         { addList(TipoToken.ARITMETICO, yyline, yycolumn); }
"-"                                         { addList(TipoToken.ARITMETICO, yyline, yycolumn); }
"/"                                         { addList(TipoToken.ARITMETICO, yyline, yycolumn); }
"*"                                         { addList(TipoToken.ARITMETICO, yyline, yycolumn); }
{ENTERO}                                    { addList(TipoToken.ENTERO, yyline, yycolumn); }
{ENTERO}"."{ENTERO}                         { addList(TipoToken.DECIMAL, yyline, yycolumn); }
"'"{D}{D}{D}{D}"-"{D}{D}"-"{D}{D}"'"        { addList(TipoToken.FECHA, yyline, yycolumn); }
"'"[^']*"'"                                 { addList(TipoToken.CADENA, yyline, yycolumn); } 
[a-z]([a-z]|[0-9]|_)*                       { addList(TipoToken.IDENTIFICADOR, yyline, yycolumn); }
"("                                         { addList(TipoToken.SIGNOS, yyline, yycolumn); }
")"                                         { addList(TipoToken.SIGNOS, yyline, yycolumn); }
","                                         { addList(TipoToken.SIGNOS, yyline, yycolumn); }
"."                                         { addList(TipoToken.SIGNOS, yyline, yycolumn); }
";"                                         { addList(TipoToken.SIGNOS, yyline, yycolumn); }
"="                                         { addList(TipoToken.SIGNOS, yyline, yycolumn); }
"- -".*                                     { addList(TipoToken.COMENTARIO, yyline, yycolumn); }
.                                           { addListaErrores(yyline, yycolumn); }