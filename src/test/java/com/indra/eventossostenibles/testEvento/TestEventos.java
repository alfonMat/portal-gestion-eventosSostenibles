package com.indra.eventossostenibles.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEventos {

    private Evento evento;

    @BeforeEach
    public void setUp() {
        evento = new Evento("EcoSostenible 2025", 3);
    }

    @Test
    public void testNombreEvento() {
        assertEquals("EcoSostenible 2025", evento.getNombre(), "El nombre del evento no coincide");
    }

    @Test
    public void testDuracionEvento() {
        assertEquals(3, evento.getDuracion(), "La duración del evento no coincide");
    }
}
