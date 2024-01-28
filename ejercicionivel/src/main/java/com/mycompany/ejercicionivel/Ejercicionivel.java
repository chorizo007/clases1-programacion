/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicionivel;

import java.util.Scanner;

/**
 *
 * Leer una cadena de caracteres y copiar su contenido en otra cadena de forma invertida.
 */
public class Ejercicionivel {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer una cadena de caracteres
        System.out.println("Ingrese una cadena de caracteres:");
        String cadenaOriginal = scanner.nextLine();

        // Invertir la cadena
        String cadenaInvertida = invertirCadena(cadenaOriginal);

        // Mostrar la cadena original y la invertida
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena invertida: " + cadenaInvertida);

        // Cerrar el Scanner
        scanner.close();
    }
    
    public static String invertirCadena(String cadena){
        String cadenainvertida = "";
        for(int i = cadena.length() - 1; i >= 0; i--){
            cadenainvertida += cadena.charAt(i);
        }
        return cadenainvertida; 
    }
}
