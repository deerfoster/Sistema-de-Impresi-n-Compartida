package com.mycompany.queuefirstinlastout;

public class ListaHistorial {

    private NodoHistorial head;

    public ListaHistorial() {
        head = null;
    }

    public void agregar(int codigo, String archivo, int hojas) {

        NodoHistorial nuevo = new NodoHistorial(codigo, archivo, hojas);

        if (head == null) {
            head = nuevo;
        } else {

            NodoHistorial actual = head;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    public void mostrarHistorial() {

        if (head == null) {
            System.out.println("No hay trabajos procesados.");
            return;
        }

        System.out.println("\n===== HISTORIAL DE IMPRESIONES =====");

        NodoHistorial actual = head;

        while (actual != null) {

            System.out.println(
                    "Código: " + actual.getCodigo()
                            + " | Archivo: " + actual.getArchivo()
                            + " | Hojas: " + actual.getHojas()
            );

            actual = actual.siguiente;
        }

        System.out.println("====================================");
    }
}