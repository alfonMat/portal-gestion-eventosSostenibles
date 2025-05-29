package com.indra.eventossostenibles.controller;

import com.indra.eventossostenibles.model.Evento;
import com.indra.eventossostenibles.view.ViMenuPrincipal;

import java.util.Scanner;

public class CoMenuPrincipal {
    private Evento[] eventos;
    private int contador;

    public CoMenuPrincipal() {
        eventos = Evento.eventosPorDefecto();
        contador = 2; // Dos eventos por defecto
    }

    public void mostrarMenu() {
        ViMenuPrincipal viMenu = new ViMenuPrincipal();
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            opcion = viMenu.mostrarMenu();
            switch (opcion) {
                case 1:
                    new CoListarEventos(eventos, contador).ejecutar();
                    break;
                case 2:
                    contador = new CoCrearEvento(eventos, contador, scanner).ejecutar();
                    break;
                case 3:
                    new CoActualizarEvento(eventos, contador, scanner).ejecutar();
                    break;
                case 4:
                    contador = new CoEliminarEvento(eventos, contador, scanner).ejecutar();
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
    }
}
