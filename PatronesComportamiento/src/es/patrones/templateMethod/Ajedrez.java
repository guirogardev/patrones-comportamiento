package es.patrones.templateMethod;

public class Ajedrez extends Juego {

    @Override
    protected void prepararTablero() {
        System.out.println("Preparando tablero de ajedrez.");
    }

    @Override
    protected void jugarJuego() {
        System.out.println("Jugando juego de ajedrez.");
    }

    @Override
    protected void celebrarGanador() {
        System.out.println("Celebrando al ganador del juego de ajedrez.");
    }
}
