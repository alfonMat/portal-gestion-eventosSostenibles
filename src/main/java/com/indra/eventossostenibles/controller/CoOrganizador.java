package com.indra.eventossostenibles.controller;

import java.util.Scanner;
import com.indra.eventossostenibles.model.Organizador;

public class CoOrganizador {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Registro de Organizador ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();

        Organizador organizador = new Organizador(nombre, correo, numero);
        System.out.println("Organizador registrado correctamente: " + organizador.getNombre());

        // Aquí puedes continuar con el menú de eventos para organizadores
        new CoMenuEventos().mostrarMenu();
    }
}
