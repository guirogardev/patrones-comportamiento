package es.patrones.command;

public class ComandoEncender implements Comando {
	private Bombilla bombilla;

    public ComandoEncender(Bombilla bombilla) {
        this.bombilla = bombilla;
    }

    @Override
    public void ejecutar() {
        this.bombilla.encender();
    }
}
