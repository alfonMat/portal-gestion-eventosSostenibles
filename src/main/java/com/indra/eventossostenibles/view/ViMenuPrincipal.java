package com.indra.eventossostenibles.view;

import java.util.Scanner;

public class ViMenuPrincipal {

    public int menuPrincipal() {
        System.out.println("---------------------------------");
        System.out.println("EVENTOS SOSTENIBLES");
        System.out.println("Bienvenido a la aplicación de eventos sostenibles");
        System.out.println("Eliga una opción:");
        System.out.println("---------------------------------");
        System.out.println("1.- Usuario");
        System.out.println("2.- Organizador");
        System.out.println("3.- Salir");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        return opcion;
    }

}
