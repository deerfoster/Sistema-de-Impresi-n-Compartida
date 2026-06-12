package com.mycompany.queuefirstinlastout;

public class Puente {

    public static void ejecutar(Cola cola) {
        if (cola.estaVacia()) {
            System.out.println("No hay trabajos en espera para imprimir.");
        } else {
            TrabajoCola trabajoActual = cola.desencolar();
            System.out.println("Imprimiendo " + trabajoActual.archivo +
                    " (" + trabajoActual.hojas + " páginas)...");
            System.out.println("✓ Trabajo #" + trabajoActual.codigo + " completado");

            //  Cuando tu compañero haga la Opción 4, aquí se agrega:
            // historial.agregar(trabajoActual);
        }
    }
}