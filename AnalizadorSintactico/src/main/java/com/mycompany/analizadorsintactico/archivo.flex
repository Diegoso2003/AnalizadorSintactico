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
    private TipoToken tipo;
    private int fila;
    private int columna;
    private String lexema;

    private void addList(TipoToken tipo) {
        Token token = new Token();
        token.setFila(fila + 1);
        token.setColumna(columna + 1);
        token.setToken(tipo);
        token.setLexema(lexema);
        lista.add(token);
    }

    private void addListaErrores() {
        Token token = new Token();
        token.setFila(fila + 1);
        token.setColumna(columna + 1);
        token.setToken(TipoToken.ERROR);
        token.setLexema(lexema);
        lista.add(token);
        listaErrores.add(token);
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

%state FINAL
%state ERROR

// Expresiones Regulares
D = [0-9]
ENTERO = [0-9]+
LETRA = [a-z]+
ESPACIOS = [" "\r\t\b\n]


%%
// Reglas de Escaneo de Expresiones
<YYINITIAL> {
{ESPACIOS}                                  {/* no hacer nada */}
"ADD"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.ADD; yybegin(FINAL); }
"ALTER"                                     { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.ALTER; yybegin(FINAL); }
"AND"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.LOGICO; yybegin(FINAL); }
"ASC"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.ASC; yybegin(FINAL); }
"AS"                                        { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.AS; yybegin(FINAL); }
"AVG"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.FUNCION_DE_AGREGACION; yybegin(FINAL); }
"BIGINT"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.BIGINT; yybegin(FINAL); }
"BOOLEAN"                                   { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.BOOLEAN; yybegin(FINAL); }
"BY"                                        { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.BY; yybegin(FINAL); }
"CASCADE"                                   { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.CASCADE; yybegin(FINAL); }
"COLUMN"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.COLUMN; yybegin(FINAL); }
"CONSTRAINT"                                { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.CONSTRAINT; yybegin(FINAL); }
"COUNT"                                     { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.FUNCION_DE_AGREGACION; yybegin(FINAL); }
"CREATE"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.CREATE; yybegin(FINAL); }
"DATABASE"                                  { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.DATABASE; yybegin(FINAL); }
"DATE"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.DATE; yybegin(FINAL); }
"DECIMAL"                                   { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.DECIMAL_TIPO; yybegin(FINAL); }
"DELETE"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.DELETE; yybegin(FINAL); }
"DESC"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.DESC; yybegin(FINAL); }
"DROP"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.DROP; yybegin(FINAL); }
"EXIST"                                     { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.EXIST; yybegin(FINAL); }
"FALSE"                                     { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.BOOLEANO; yybegin(FINAL); }
"FOREIGN"                                   { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.FOREIGN; yybegin(FINAL); }
"FROM"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.FROM; yybegin(FINAL); }
"GROUP"                                     { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.GROUP; yybegin(FINAL); }
"IF"                                        { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.IF; yybegin(FINAL); }
"INSERT"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.INSERT; yybegin(FINAL); }
"INTEGER"                                   { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.INTEGER; yybegin(FINAL); }
"INTO"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.INTO; yybegin(FINAL); }
"JOIN"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.JOIN; yybegin(FINAL); }
"KEY"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.KEY; yybegin(FINAL); }
"LIMIT"                                     { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.LIMIT; yybegin(FINAL); }
"MAX"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.FUNCION_DE_AGREGACION; yybegin(FINAL); }
"MIN"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.FUNCION_DE_AGREGACION; yybegin(FINAL); }
"NOT"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.LOGICO_NOT; yybegin(FINAL); }
"NUMERIC"                                   { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.NUMERIC; yybegin(FINAL); }
"NULL"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.NULL; yybegin(FINAL); }
"ON"                                        { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.ON; yybegin(FINAL); }
"ORDER"                                     { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.ORDER; yybegin(FINAL); }
"OR"                                        { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.LOGICO; yybegin(FINAL); }
"PRIMARY"                                   { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.PRIMARY; yybegin(FINAL); }
"REFERENCES"                                { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.REFERENCES; yybegin(FINAL); }
"SELECT"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.SELECT; yybegin(FINAL); }
"SERIAL"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.SERIAL; yybegin(FINAL); }
"SET"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.SET; yybegin(FINAL); }
"SUM"                                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.FUNCION_DE_AGREGACION; yybegin(FINAL); }
"TABLE"                                     { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.TABLE; yybegin(FINAL); }
"TEXT"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.TEXT; yybegin(FINAL); }
"TRUE"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.BOOLEANO; yybegin(FINAL); }
"TYPE"                                      { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.TYPE; yybegin(FINAL); }
"UNIQUE"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.UNIQUE; yybegin(FINAL); }
"UPDATE"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.UPDATE; yybegin(FINAL); }
"VALUES"                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.VALUES; yybegin(FINAL); }
"VARCHAR"                                   { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.VARCHAR; yybegin(FINAL); }
"WHERE"                                     { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.WHERE; yybegin(FINAL); }
"<="                                        { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); }
"<"                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); }
">="                                        { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); }
">"                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); }
"+"                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); }
"- -".*                                     { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.COMENTARIO); }
"-"                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); }
"/"                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); }
"*"                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); }
"("                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.PAREMTESIS_A); }
")"                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.PAREMTESIS_B); }
","                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS_COMA); }
"."                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS_PUNTO); }
";"                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS_PUNTO_Y_COMA); }
"="                                         { lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS_IGUAL); }
{ENTERO}                                    { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.ENTERO; yybegin(FINAL); }
{ENTERO}"."{ENTERO}                         { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.DECIMAL; yybegin(FINAL); }
"'"{D}{D}{D}{D}"-"{D}{D}"-"{D}{D}"'"        { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.FECHA; yybegin(FINAL);}
"'"[^']*"'"                                 { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.CADENA; yybegin(FINAL); } 
[a-z]([a-z]|[0-9]|_)*                       { lexema = yytext(); fila = yyline; columna = yycolumn; tipo = TipoToken.IDENTIFICADOR; yybegin(FINAL); }
.                                           { lexema = yytext(); yybegin(ERROR); fila=yyline; columna = yycolumn;}
}

<FINAL> {
    {ESPACIOS} {addList(tipo); yybegin(YYINITIAL);}
"<="                                        { addList(tipo); lexema = yytext(); fila=yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); yybegin(YYINITIAL);}
"<"                                         { addList(tipo); lexema = yytext(); fila=yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); yybegin(YYINITIAL);}
">="                                        { addList(tipo); lexema = yytext(); fila=yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); yybegin(YYINITIAL);}
">"                                         { addList(tipo); lexema = yytext(); fila=yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); yybegin(YYINITIAL);}
"+"                                         { addList(tipo); lexema = yytext(); fila=yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); yybegin(YYINITIAL);}
"- -".*                                     { addList(tipo); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.COMENTARIO); yybegin(YYINITIAL); }
"-"                                         { addList(tipo); lexema = yytext(); fila=yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); yybegin(YYINITIAL);}
"/"                                         { addList(tipo); lexema = yytext(); fila=yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); yybegin(YYINITIAL);}
"*"                                         { addList(tipo); lexema = yytext(); fila=yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); yybegin(YYINITIAL);}
"("                                         { addList(tipo); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.PAREMTESIS_A); yybegin(YYINITIAL);}
")"                                         { addList(tipo); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.PAREMTESIS_B); yybegin(YYINITIAL);}
","                                         { addList(tipo); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS_COMA); yybegin(YYINITIAL);}
"."                                         { addList(tipo); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS_PUNTO); yybegin(YYINITIAL);}
";"                                         { addList(tipo); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS_PUNTO_Y_COMA); yybegin(YYINITIAL);}
"="                                         { addList(tipo); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS_IGUAL); yybegin(YYINITIAL);}
    .                   { lexema += yytext(); yybegin(ERROR);}
}

<ERROR> {
    {ESPACIOS} {addListaErrores(); yybegin(YYINITIAL);}
"<="                                        { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); yybegin(YYINITIAL); }
"<"                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); yybegin(YYINITIAL); }
">="                                        { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); yybegin(YYINITIAL); }
">"                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.RELACIONAL); yybegin(YYINITIAL); }
"+"                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); yybegin(YYINITIAL); }
"- -".*                                     { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.COMENTARIO); yybegin(YYINITIAL); }
"-"                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); yybegin(YYINITIAL); }
"/"                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); yybegin(YYINITIAL); }
"*"                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.ARITMETICO); yybegin(YYINITIAL); }
"("                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS); yybegin(YYINITIAL);}
")"                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS); yybegin(YYINITIAL);}
","                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS); yybegin(YYINITIAL);}
"."                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS); yybegin(YYINITIAL);}
";"                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS); yybegin(YYINITIAL);}
"="                                         { addListaErrores(); lexema = yytext(); fila = yyline; columna = yycolumn; addList(TipoToken.SIGNOS); yybegin(YYINITIAL);}
    . {lexema += yytext();}
}