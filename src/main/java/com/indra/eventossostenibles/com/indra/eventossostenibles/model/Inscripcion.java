package com.indra.eventossostenibles.model;

import java.util.ArrayList;

public class Inscripcion {
    private Usuario usuario;
    private Evento evento;

    // Lista estática para simular almacenamiento de inscripciones
    private static ArrayList<Inscripcion> inscripciones = new ArrayList<>();

    public Inscripcion(Usuario usuario, Evento evento) {
        this.usuario = usuario;
        this.evento = evento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    // Relación con el controlador: método para registrar inscripciones
    public static void registrarInscripcion(Usuario usuario, Evento evento) {
        Inscripcion inscripcion = new Inscripcion(usuario, evento);
        inscripciones.add(inscripcion);
    }

    public static ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }
}
