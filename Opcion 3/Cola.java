/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queuefirstinlastout;

/**
 *
 * @author xaria
 */

// este es el modulo de la cola, tiene su entrada y salida // 

public class Cola {
    private com.mycompany.queuefirstinlastout.TrabajoCola frente;
    private com.mycompany.queuefirstinlastout.TrabajoCola ultimo;
    private int contador = 0;

    public void Encolar(String nombreArchivo, int cantidadHojas) {
        contador++;
        com.mycompany.queuefirstinlastout.TrabajoCola nuevaImpresionNodo = new com.mycompany.queuefirstinlastout.TrabajoCola(contador, nombreArchivo, cantidadHojas);

        if (frente == null) {
            frente = nuevaImpresionNodo;
            ultimo = nuevaImpresionNodo;
        } else {
            ultimo.punteroSiguiente = nuevaImpresionNodo;
            ultimo = nuevaImpresionNodo;
        }
    }

    public com.mycompany.queuefirstinlastout.TrabajoCola obtenerFrente() {
        return frente;
    }
    public boolean estaVacia() {
        return frente == null;
    }

    public com.mycompany.queuefirstinlastout.TrabajoCola desencolar() {
        if (estaVacia()) {
            return null;
        }
        com.mycompany.queuefirstinlastout.TrabajoCola trabajoEliminado = frente;
        frente = frente.punteroSiguiente;
        if (frente == null) {
            ultimo = null;
        }
        return trabajoEliminado;
    }
}


