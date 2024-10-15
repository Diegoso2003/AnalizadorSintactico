/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.analizadorsintactico;

import com.mycompany.analizadorsintactico.frontend.Editor;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.Main;
import jflex.exceptions.SilentExit;


/**
 *
 * @author rafael-cayax
 */
public class AnalizadorSintactico {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setVisible(true);
/*        try {
            File file = new File("/home/rafael-cayax/AnalizadorSintactico/AnalizadorSintactico/src/main/java/com/mycompany/analizadorsintactico/archivo.flex");
            String path = file.getAbsolutePath();
            String[] d = {path};
            Main.generate(d);
        } catch (SilentExit ex) {
            Logger.getLogger(AnalizadorSintactico.class.getName()).log(Level.SEVERE, null, ex);
        }
*/    
    }
}
