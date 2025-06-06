package com.indra.eventossostenibles.controller;

import com.indra.eventossostenibles.view.ViMenuPrincipal;

public class CoMenuPrincipal {
    public void mostrarMenu() {
        ViMenuPrincipal menu = new ViMenuPrincipal();
        int opcion;
        do {
            opcion = menu.menuPrincipal();
            switch (opcion) {
                case 1:
                    new CoUsuario().mostrarMenu();
                    break;
                case 2:
                    new CoOrganizador().mostrarMenu();
                    break;
                case 3:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }
}

