/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsintactico;

import com.mycompany.analizadorsintactico.token.TipoToken;
import com.mycompany.analizadorsintactico.token.Token;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 * @author rafael-cayax
 */
public class Graficador {

    private BufferedImage imagenLexema;
    
    public void crearTabla(List<Token> tokens) {
        StringBuilder tabla = new StringBuilder();
        tabla.append("digraph G { \n")
                .append("node [shape=none, style=rounded]; \n")
                .append("cuadro [label=< \n")
                .append("<table border=\"1\" cellborder=\"0\" cellspacing=\"0\" style=\"rounded\">\n")
                .append("<tr><td colspan=\"2\"><b>")
                .append(tokens.get(2).getLexema())
                .append("</b></td></tr>");
        
        OUTER:
        for (int i = 4; i < tokens.size()-2; i++) {
            Token token = tokens.get(i);
            TipoToken t = token.getToken();
            if (null != t) {
                switch (t) {
                    case SIGNOS_COMA -> tabla.append("</td></tr>\n");
                    case IDENTIFICADOR -> {
                        tabla.append("<tr><td align=\"left\">");
                        tabla.append(token.getLexema())
                                .append(": ");
                    }
                    case CONSTRAINT -> {
                        break OUTER;
                    }
                    default -> {
                        tabla.append(token.getLexema())
                                .append(" ");
                    }
                }
            }
        }
        
        tabla.append("</table>\n")
                .append(">];\n")
                .append("}");
        System.out.println(tabla);
        crearConexionGraphViz(tabla.toString());
    }

    private void crearConexionGraphViz(String graphConstructor) {

        try {
            ProcessBuilder pb = new ProcessBuilder("dot", "-Tpng");
            Process process = pb.start();

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
            writer.write(graphConstructor);
            writer.flush();
            writer.close();

            InputStream inputStream = process.getInputStream();
            imagenLexema = ImageIO.read(inputStream);
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getCause());
            System.out.println("error");
        }
    }
    
    

/*    
    public static String replacePlaceholders(String template, Map<String, String> values) {
        for (Map.Entry<String, String> entry : values.entrySet()) {
            template = template.replace(":" + entry.getKey(), entry.getValue());
        }
        return template;
    }

    public static void main(String[] args) {
        String template = "El usuario :nombre tiene un ID de :id y un rol de :rol";
        Map<String, String> values = Map.of(
            "nombre", "Juan Pérez",
            "id", "12345",
            "rol", "Administrador"
        );

        String resultado = replacePlaceholders(template, values);
        System.out.println(resultado); // "El usuario Juan Pérez tiene un ID de 12345 y un rol de Administrador"
    }
*/

    public BufferedImage getImagenLexema() {
        return imagenLexema;
    }
}
