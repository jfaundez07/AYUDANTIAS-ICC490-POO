package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        setUp();
    }

    public static void setUp() {

        String[][] infoPlantas = new String[9][1]; //9 filas y 2 columnas

        menu(infoPlantas);

    }

    public static void menu(String[][] plantas) {

        // implementar mostrar opciones del menu

        switch (opcion) {
            case 0:
                registrarPlanta(plantas, Rosa);
            
            /* 
                .
                .
                .
            */

            case 4:
                diaSiguiente(plantas);
        }

        
    }

    public static void registrarPlanta(String[][] plantas, String nombre) {

        for (int i = 0; i < plantas.length; i++) {
            if (plantas[i][0] == null) {

                // Que esta recorriendo en este bucle for?

                break;
            }
        }
    }

    public static void mostrarPlantas(String[][] plantas) {

        for (int i = 0; i < plantas.length; i++) {
           
        }
    }

    public static void buscarPlanta(String[][] plantas, String nombre) {

        for (int i = 0; i < plantas.length; i++) {
            if ( ) {
                System.out.println( /* Muestre la informacion de la planta*/ );
            }
        }
    }

    public static void regarPlanta(String[][] plantas, String nombre) {

    }

    public static void diaSiguiente(String[][] plantas) {

    }
}