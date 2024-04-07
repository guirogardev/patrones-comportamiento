package es.patrones.templateMethod;

public class Go extends Juego {

    @Override
    protected void prepararTablero() {
        System.out.println("Preparando tablero de go.");
    }

    @Override
    protected void jugarJuego() {
        System.out.println("Jugando juego de go.");
    }

    @Override
    protected void celebrarGanador() {
        System.out.println("Celebrando al ganador del juego de go.");
    }
}
