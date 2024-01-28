/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicionivel;

import java.util.Scanner;

/**
 *
 * Realizar un programa que compruebe si una cadena contiene una subcadena. 
 * Las dos cadenas se introducen por teclado.
 */
public class ejercicio2 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer la cadena principal
        System.out.println("introduce una frase:");
        String frase = scanner.nextLine();
        
        // Leer la cadena principal
        System.out.println("palabra a buscar:");
        String palabra = scanner.nextLine();
        
        // Invertir la cadena
        String mensaje = comprobarcadena(frase, palabra);

        // Mostrar la cadena original y la invertida
        System.out.println(mensaje);

        // Cerrar el Scanner
        scanner.close();
    }

    public static String comprobarcadena(String frase, String palabra) {
        
        int tamañopalabra = palabra.length();
        int auxpalabra = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (palabra.charAt(auxpalabra)== frase.charAt(i)){
                auxpalabra++;
                System.out.println(auxpalabra);
                if(auxpalabra == tamañopalabra){
                    return "la frase contiene la palabra " + palabra; 
                }
            }else{
                auxpalabra = 0; 
            }
        }
        
        return "la frase NO contiene la palabra " + palabra; 
    }
}
