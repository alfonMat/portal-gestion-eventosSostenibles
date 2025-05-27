package com.indra.eventossostenibles.model;

public class Eventos {

    private String nombreEvento;
    private String fechaEvento;
    private String horaEvento;
    private String lugarEvento;
    private String descripcionEvento;

    public Eventos(String nombreEvento, String fechaEvento, String horaEvento, String lugarEvento, String descripcionEvento) {
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.horaEvento = horaEvento;
        this.lugarEvento = lugarEvento;
        this.descripcionEvento = descripcionEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }
}