package com.indra.eventossostenibles.controller;

import java.util.Scanner;
import com.indra.eventossostenibles.model.Evento;

public class CoActualizarEvento {
    private Evento[] eventos;
    private int contador;
    private Scanner scanner;

    public CoActualizarEvento(Evento[] eventos, int contador, Scanner scanner) {
        this.eventos = eventos;
        this.contador = contador;
        this.scanner = scanner;
    }

    public void ejecutar() {
        scanner.nextLine();
        System.out.print("Nombre del evento a actualizar: ");
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
            return;
        }
        System.out.print("Nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Nueva fecha: ");
        String nuevaFecha = scanner.nextLine();
        System.out.print("Nueva hora: ");
        String nuevaHora = scanner.nextLine();
        System.out.print("Nueva categoría: ");
        String nuevaCategoria = scanner.nextLine();
        System.out.print("Nueva ubicación: ");
        String nuevaUbicacion = scanner.nextLine();
        System.out.print("Nueva descripción: ");
        String nuevaDescripcion = scanner.nextLine();
        eventos[idx] = new Evento(nuevoNombre, nuevaFecha, nuevaHora, nuevaCategoria, nuevaUbicacion, nuevaDescripcion);
        System.out.println("Evento actualizado correctamente.");
    }
}
