package com.mycompany.queuefirstinlastout;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        ListaHistorial historial = new ListaHistorial();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE IMPRESIÓN COMPARTIDA ===");
            System.out.println("1. Agregar trabajo a la cola");
            System.out.println("2. Imprimir siguiente trabajo (puente)");
            System.out.println("3. Mostrar trabajos en espera");
            System.out.println("4. Mostrar historial de impresiones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero(scanner);
            limpiarPantalla();

            switch(opcion) {
                case 1:
                    System.out.print("Nombre del archivo: ");
                    String archivo = scanner.nextLine();
                    System.out.print("Número de páginas: ");
                    int paginas = leerEntero(scanner);
                    if (paginas > 0) {
                        cola.Encolar(archivo, paginas);
                        System.out.println("✓ Trabajo agregado a la cola");
                    } else {
                        System.out.println("✗ El número de páginas debe ser mayor a 0");
                    }
                    break;

                case 2:
                    Puente.ejecutar(cola, historial);
                    break;

                case 3:
                    Bucle.mostrarCola(cola);
                    break;

                case 4:
                    historial.mostrarHistorial();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            if (opcion != 5) {
                System.out.print("\nPresiona Enter para continuar...");
                scanner.nextLine();
                limpiarPantalla();
            }

        } while(opcion != 5);

        scanner.close();
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static int leerEntero(Scanner scanner) {
        while (true) {
            try {
                int numero = scanner.nextInt();
                scanner.nextLine();
                return numero;
            } catch (java.util.InputMismatchException e) {
                System.out.print("✗ Debes ingresar un número válido. Intenta de nuevo: ");
                scanner.next();
            }
        }
    }
}