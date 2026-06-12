package com.mycompany.queuefirstinlastout;

public class Bucle {

    public static void mostrarCola(com.mycompany.queuefirstinlastout.Cola cola) {
        com.mycompany.queuefirstinlastout.TrabajoCola actual = cola.obtenerFrente();

        if (actual == null) {
            System.out.println("No hay trabajos en espera");
            return;
        }

        System.out.println("\n=== TRABAJOS EN ESPERA (COLA) ===");
        int posicion = 1;

        while (actual != null) {
            System.out.println(posicion + ". Archivo: " + actual.archivo +
                    " | Código: " + actual.codigo +
                    " | Hojas: " + actual.hojas);
            actual = actual.punteroSiguiente;
            posicion++;
        }
        System.out.println("===================================\n");
    }
}
