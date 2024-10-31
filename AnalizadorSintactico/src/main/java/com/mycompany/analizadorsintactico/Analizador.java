package com.mycompany.analizadorsintactico;

import java.util.Stack;

public class Analizador {

    public static void main(String[] args) {
        String input = "3 + 5 * 2";
        if (reconocerCadena(input)) {
            System.out.println("Cadena reconocida.");
        } else {
            System.out.println("Cadena no reconocida.");
        }
    }

    public static boolean reconocerCadena(String input) {
        Stack<String> stack = new Stack<>();
        String[] tokens = input.split(" ");
        
        // Inicializamos la pila con la producción inicial
        stack.push("<expr>");

        int index = 0;

        while (!stack.isEmpty() && index < tokens.length) {
            String top = stack.pop();
            String token = tokens[index];

            switch (top) {
                case "<expr>":
                    // <expr> ::= <factor> "+" <term>
                    stack.push("<term>");
                    stack.push("+");
                    stack.push("<factor>");
                    break;
                case "<term>":
                    // <term> ::= <number> "*" <factor>
                    stack.push("<factor>");
                    stack.push("*");
                    stack.push("<number>");
                    break;
                case "<factor>":
                    // <factor> ::= <number>
                    stack.push("<number>");
                    break;
                case "<number>":
                    // <number> ::= [0-9]+
                    if (token.matches("[0-9]+")) {
                        index++; // Consumimos el número
                    } else {
                        return false; // Token no válido
                    }
                    break;
                case "+":
                    // Consumimos el símbolo "+"
                    if (!token.equals("+")) {
                        return false; // Token no coincide
                    }
                    index++;
                    break;
                case "*":
                    // Consumimos el símbolo "*"
                    if (!token.equals("*")) {
                        return false; // Token no coincide
                    }
                    index++;
                    break;
                default:
                    return false; // Error de análisis
            }
        }

        // La pila debe estar vacía y todos los tokens deben ser consumidos
        return stack.isEmpty() && index == tokens.length;
    }
}