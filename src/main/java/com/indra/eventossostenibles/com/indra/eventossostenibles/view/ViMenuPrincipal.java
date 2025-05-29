package com.indra.eventossostenibles.view;

import java.util.Scanner;

public class ViMenuPrincipal {
    // Devuelve la opción seleccionada por el usuario
    public int mostrarMenu() {
        System.out.println("---------------------------------");
        System.out.println("EVENTOS SOSTENIBLES");
        System.out.println("Bienvenido a la aplicación de eventos sostenibles");
        System.out.println("Eliga una opción:");
        System.out.println("---------------------------------");
        System.out.println("1.- Ver Eventos");
        System.out.println("2.- Crear Evento");
        System.out.println("3.- Actualizar Evento");
        System.out.println("4.- Eliminar Evento");
        System.out.println("5.- Salir");
        System.out.print("Opción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        return opcion;
    }
}