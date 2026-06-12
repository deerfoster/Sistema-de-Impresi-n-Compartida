package com.mycompany.queuefirstinlastout;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE IMPRESIÓN COMPARTIDA ===");
            System.out.println("1. Agregar trabajo a la cola");
            System.out.println("2. Imprimir siguiente trabajo (puente)");
            System.out.println("3. Mostrar trabajos en espera");
            System.out.println("4. Mostrar historial de impresiones (PENDIENTE)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch(opcion) {
                case 1:
                    System.out.print("Nombre del archivo: ");
                    String archivo = scanner.nextLine();
                    System.out.print("Número de páginas: ");
                    int paginas = scanner.nextInt();
                    cola.Encolar(archivo, paginas);
                    System.out.println("✓ Trabajo agregado a la cola (ID: " + paginas + ")");
                    break;

                case 2:
                    // TU OPCIÓN 2 - PUENTE
                    Puente.ejecutar(cola);
                    break;

                case 3:
                    Bucle.mostrarCola(cola);
                    break;

                case 4:
                    System.out.println("⏳ Opción 4 en desarrollo - Historial de impresiones");
                    System.out.println("(Pendiente: lista enlazada de trabajos finalizados)");
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while(opcion != 5);

        scanner.close();
    }
}