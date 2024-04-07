package es.patrones.state;

public class Detenido implements EstadoReproductor {
    @Override
    public void reproducir() {
        System.out.println("Iniciando la reproducción de la música");
    }

    @Override
    public void pausar() {
        System.out.println("La música no se puede pausar si está detenida");
    }

    @Override
    public void detener() {
        System.out.println("La música ya está detenida");
    }
}
