/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queuefirstinlastout;

/**
 *
 * @author xaria
 */

//Este es el nodo donde se van a guardar lo que coloque el usuario//

public class TrabajoCola { 
    
    int codigo;
    String archivo;
    int hojas;
    TrabajoCola punteroSiguiente = null;
        
        public TrabajoCola(int nuevoCodigo, String nuevoArchivo, int numeroHojas){
            this.codigo = nuevoCodigo;
            this.archivo = nuevoArchivo;
            this.hojas = numeroHojas;
        }
}
