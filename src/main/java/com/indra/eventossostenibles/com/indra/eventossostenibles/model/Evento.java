package com.indra.eventossostenibles.model;

public class Evento {
    private String nombre;
    private String fecha;
    private String hora;
    private String categoria;
    private String ubicacion;
    private String descripcion;

    public Evento(String nombre, String fecha, String hora, String categoria, String ubicacion, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
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
        public String getUbicacion() {
            return ubicacion;
        }
        public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        public String getCategoria() {
            return categoria;
        }
        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", categoria='" + categoria + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public static Evento[] eventosPorDefecto() {
        Evento[] eventos = new Evento[2];
        eventos[0] = new Evento(
            "Recogida de Residuos",
            "2025-06-05",
            "10:00",
            "Evento",
            "Jornada de concienciación ambiental",
            "Medio Ambiente"
        );
        eventos[1] = new Evento(
            "Reciclaje en tu Barrio",
            "2025-07-12",
            "17:00",
            "Taller ",
            "Taller práctico de reciclaje",
            "Reciclaje"
        );
        return eventos;
    }
}
