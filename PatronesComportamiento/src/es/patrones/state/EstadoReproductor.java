package es.patrones.state;

public interface EstadoReproductor {
    public abstract void reproducir();
    public abstract void pausar();
    public abstract void detener();
}
