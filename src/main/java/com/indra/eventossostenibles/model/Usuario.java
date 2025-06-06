package com.indra.eventossostenibles.model;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private ArrayList<Evento> eventosInscritos = new ArrayList<>();

    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String email) {
        this.correo = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void inscribirEnEvento(Evento evento) {
        eventosInscritos.add(evento);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }

    public ArrayList<Inscripcion> getEventosInscritos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEventosInscritos'");
    }
}
