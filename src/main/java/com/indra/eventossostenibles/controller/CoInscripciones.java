    package com.indra.eventossostenibles.controller;

import com.indra.eventossostenibles.model.Usuario;
import com.indra.eventossostenibles.model.Evento;
import java.util.Scanner;

public class CoInscripciones {
    public void inscribirUsuarioEnEvento(Usuario usuario, Evento[] eventos, Scanner scanner) {
        System.out.print("Seleccione el número del evento al que desea inscribirse (0 para salir): ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        if (opcion > 0 && opcion <= eventos.length) {
            Evento eventoSeleccionado = eventos[opcion - 1];
            usuario.inscribirEnEvento(eventoSeleccionado);
            System.out.println("Inscripción realizada en: " + eventoSeleccionado.getNombre());
        } else {
            System.out.println("No se ha realizado ninguna inscripción.");
        }
    }
}
