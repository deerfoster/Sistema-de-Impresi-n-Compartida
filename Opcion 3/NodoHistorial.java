package com.mycompany.queuefirstinlastout;

public class NodoHistorial {

    private int codigo;
    private String archivo;
    private int hojas;
    NodoHistorial siguiente;

    public NodoHistorial(int codigo, String archivo, int hojas) {
        this.codigo = codigo;
        this.archivo = archivo;
        this.hojas = hojas;
        this.siguiente = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getArchivo() {
        return archivo;
    }

    public int getHojas() {
        return hojas;
    }
}