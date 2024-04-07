package es.patrones.mediator;

public class ChatMediador implements Mediador {

    @Override
    public void enviarMensaje(String mensaje, Usuario usuarioDestino) {
        System.out.println("Enviando mensaje: " + mensaje + " a " + usuarioDestino.getNombre());
    }
}
