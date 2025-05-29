package com.indra.eventossostenibles.model;

public class Evento {
    private String nombre;
    private String fecha;
    private String hora;
    private String lugar;
    private String descripcion;

    public Evento(String nombre, String fecha, String hora, String lugar, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }

    // Getters y setters
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getFecha() {
            return fecha;
        }
        public void setFecha(String fecha) {
            this.fecha = fecha;
        }
        public String getHora() {
            return hora;
        }
        public void setHora(String hora) {
            this.hora = hora;
        }
        public String getLugar() {
            return lugar;
        }
        public void setLugar(String lugar) {
            this.lugar = lugar;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre +
                ", fecha='" + fecha +
                ", hora='" + hora +
                ", lugar='" + lugar +
                ", descripcion='" + descripcion +
                '}';
    }

    public static Evento[] eventosPorDefecto() {
        Evento[] eventos = new Evento[2];
        eventos[0] = new Evento(
            "Día del Medio Ambiente",
            "2024-06-05",
            "10:00",
            "Auditorio Central",
            "Jornada de concienciación ambiental"
        );
        eventos[1] = new Evento(
            "Reciclaje en tu Barrio",
            "2024-07-12",
            "17:00",
            "Centro Comunitario",
            "Taller práctico de reciclaje"
        );
        return eventos;
    }
}
