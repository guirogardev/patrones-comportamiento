package es.patrones.state;

public class Pausado implements EstadoReproductor {
    @Override
    public void reproducir() {
        System.out.println("Reanudando la reproducción de la música");
    }

    @Override
    public void pausar() {
        System.out.println("La música ya está pausada");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo la reproducción de la música");
    }
}
