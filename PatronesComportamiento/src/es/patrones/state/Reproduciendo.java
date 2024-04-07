package es.patrones.state;

public class Reproduciendo implements EstadoReproductor {
    @Override
    public void reproducir() {
        System.out.println("La música ya se está reproduciendo");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando la reproducción de la música");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo la reproducción de la música");
    }
}
