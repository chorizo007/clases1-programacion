/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicionivel;

import java.util.Scanner;

/**
 *
 * Programa que declare y lea los datos de una matriz N x M, lea sus valores 
 * por teclado y muestre la suma de todos los valores y la media de los mismos.
 * 
 */
public class ejercicio3 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero de filas :");
        int filas = scanner.nextInt();

        System.out.println("Numero de columnas :");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        int suma = 0;
        
        for(int filasaux = 0 ; filasaux <filas ; filasaux++){
            for(int columnasaux = 0 ; columnasaux <columnas ; columnasaux++){
                System.out.println("fila" +filasaux + " columna "+ columnasaux + " :");
                matriz[filasaux][columnasaux] = scanner.nextInt();
                suma += matriz[filasaux][columnasaux];
            }
        }
        
        System.out.println("la suma de todos los numeros de la matriz es : " + suma );
        System.out.println("la media es " + suma /(columnas*filas));
        System.out.println(columnas*filas);
        scanner.close();
    }

}
