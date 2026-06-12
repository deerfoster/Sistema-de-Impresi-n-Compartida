package com.mycompany.queuefirstinlastout;

public class Puente {

    public static void ejecutar(Cola cola, ListaHistorial historial) {
        if (cola.estaVacia()) {
            System.out.println("No hay trabajos en espera para imprimir.");
        } else {
            TrabajoCola trabajoActual = cola.desencolar();
            System.out.println("Imprimiendo " + trabajoActual.archivo +
                    " (" + trabajoActual.hojas + " páginas)...");
            System.out.println("✓ Trabajo #" + trabajoActual.codigo + " completado");
            historial.agregar(trabajoActual.codigo, trabajoActual.archivo, trabajoActual.hojas);
        }
    }
}