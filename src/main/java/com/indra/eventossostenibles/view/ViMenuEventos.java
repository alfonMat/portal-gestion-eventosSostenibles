package com.indra.eventossostenibles.view;

import java.util.Scanner;

public class ViMenuEventos {
    public int menuEventos() {
        System.out.println("Eliga una opción:");
        System.out.println("---------------------------------");
        System.out.println("1.- Ver Eventos");
        System.out.println("2.- Crear Evento");
        System.out.println("3.- Actualizar Evento");
        System.out.println("4.- Eliminar Evento");
        System.out.println("5.- Salir");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        return opcion;
    }
}