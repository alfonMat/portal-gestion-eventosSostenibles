package com.indra.eventossostenibles.controller;

import java.util.Scanner;

import com.indra.eventossostenibles.model.Evento;

public class CoEliminarEvento {
    private Evento[] eventos;
    private int contador;
    private Scanner scanner;

    public CoEliminarEvento(Evento[] eventos, int contador, Scanner scanner) {
        this.eventos = eventos;
        this.contador = contador;
        this.scanner = scanner;
    }

    public int ejecutar() {
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Nombre del evento a eliminar: ");
        String nombre = scanner.nextLine();
        int idx = -1;
        for (int i = 0; i < contador; i++) {
            if (eventos[i].getNombre().equalsIgnoreCase(nombre)) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("No se encontró el evento.");
            return contador;
        }
        for (int i = idx; i < contador - 1; i++) {
            eventos[i] = eventos[i + 1];
        }
        eventos[--contador] = null;
        System.out.println("Evento eliminado correctamente.");
        return contador;
    }
}
