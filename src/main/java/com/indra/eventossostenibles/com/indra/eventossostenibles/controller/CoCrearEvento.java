package com.indra.eventossostenibles.controller;

import java.util.Scanner;

import com.indra.eventossostenibles.model.Evento;

public class CoCrearEvento {
    private Evento[] eventos;
    private int contador;
    private Scanner scanner;

    public CoCrearEvento(Evento[] eventos, int contador, Scanner scanner) {
        this.eventos = eventos;
        this.contador = contador;
        this.scanner = scanner;
    }

    public int ejecutar() {
        if (contador >= eventos.length) {
            System.out.println("No se pudo crear el evento (capacidad máxima alcanzada).");
            return contador;
        }
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha: ");
        String fecha = scanner.nextLine();
        System.out.print("Hora: ");
        String hora = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        eventos[contador++] = new Evento(nombre, fecha, hora, lugar, descripcion);
        System.out.println("Evento creado correctamente.");
        return contador;
    }
}
