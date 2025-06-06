package com.indra.eventossostenibles.controller;

import java.util.Scanner;
import com.indra.eventossostenibles.model.Usuario;
import com.indra.eventossostenibles.model.Evento;

public class CoUsuario {
    public void mostrarEventos() {
        System.out.println("Mostrando eventos del usuario...");
    }
    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Registro de Usuario ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        Usuario usuario = new Usuario(nombre, correo, contrasena);
        System.out.println("Usuario registrado correctamente: " + usuario.getNombre());

        // Mostrar eventos disponibles
        Evento[] eventos = Evento.eventosPorDefecto();
        System.out.println("\n=== Eventos Disponibles ===");
        for (int i = 0; i < eventos.length; i++) {
            System.out.println((i + 1) + ". " + eventos[i].getNombre() + " - " + eventos[i].getFecha() + " - " + eventos[i].getUbicacion());
        }

        // Delegar inscripción a CoInscripciones
        new CoInscripciones().inscribirUsuarioEnEvento(usuario, eventos, scanner);
    }
}
