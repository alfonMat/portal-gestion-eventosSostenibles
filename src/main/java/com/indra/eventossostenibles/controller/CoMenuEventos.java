package com.indra.eventossostenibles.controller;

import com.indra.eventossostenibles.model.Evento;
import com.indra.eventossostenibles.view.ViMenuEventos;

import java.util.Scanner;

public class CoMenuEventos {
    private Evento[] eventos;
    private int contador;

    public CoMenuEventos() {
        eventos = Evento.eventosPorDefecto();
        contador = 2; // Dos eventos por defecto
    }

    public void mostrarMenu() {
        ViMenuEventos viMenu = new ViMenuEventos();
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            opcion = viMenu.menuEventos();
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
