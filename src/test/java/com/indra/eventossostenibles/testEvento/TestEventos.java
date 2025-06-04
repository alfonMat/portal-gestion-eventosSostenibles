package test.java.com.indra.eventossostenibles.testEvento;

import com.indra.eventossostenibles.model.Evento;
import com.indra.eventossostenibles.model.Usuario;
import com.indra.eventossostenibles.model.Organizador;
import com.indra.eventossostenibles.model.Inscripcion;

public class TestEventos {
    public static void main(String[] args) {
        // Test Evento
        Evento evento = new Evento("Eco Feria", "2025-08-01", "12:00", "Parque Central", "Feria ecológica", "Sostenibilidad");
        System.out.println("Evento: " + evento);

        // Test Usuario
        Usuario usuario = new Usuario("Ana", "ana@email.com", "1234");
        System.out.println("Usuario: " + usuario.getNombre() + ", " + usuario.getCorreo());

        // Test Organizador
        Organizador organizador = new Organizador("Pedro", "pedro@email.com", "600123456");
        System.out.println("Organizador: " + organizador.getNombre() + ", " + organizador.getCorreo() + ", " + organizador.getNumero());

        // Test Inscripcion
        Inscripcion inscripcion = new Inscripcion(usuario, evento);
        System.out.println("Inscripción: Usuario=" + inscripcion.getUsuario().getNombre() + ", Evento=" + inscripcion.getEvento().getNombre());

        // Test métodos de Usuario para inscribir en evento
        usuario.inscribirEnEvento(evento);
        System.out.println("Usuario inscrito en: " + usuario.getNombre() + " -> " + usuario.getEventosInscritos().get(0).getNombre());

        // Test métodos estáticos de Inscripcion
        Inscripcion.registrarInscripcion(usuario, evento);
        System.out.println("Total inscripciones registradas: " + Inscripcion.getInscripciones().size());
    }
}
