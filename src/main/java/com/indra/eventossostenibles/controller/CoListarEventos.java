package com.indra.eventossostenibles.controller;

import com.indra.eventossostenibles.model.Evento;

public class CoListarEventos {
    private Evento[] eventos;
    private int contador;

    public CoListarEventos(Evento[] eventos, int contador) {
        this.eventos = eventos;
        this.contador = contador;
    }

    public void ejecutar() {
        if (contador == 0) {
            System.out.println("No hay eventos registrados.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(eventos[i]);
            }
        }
    }
}
