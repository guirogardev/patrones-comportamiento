package es.patrones.mediator;

public class Usuario {
    private String nombre;
    private Mediador mediador;

    public Usuario(String nombre, Mediador mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public void enviarMensaje(String mensaje, Usuario usuarioDestino) {
        this.mediador.enviarMensaje(mensaje, usuarioDestino);
    }

    public String getNombre() {
        return nombre;
    }
}
