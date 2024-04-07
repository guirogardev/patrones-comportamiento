package es.patrones.command;

public class ComandoApagar implements Comando {
	private Bombilla bombilla;

    public ComandoApagar(Bombilla bombilla) {
        this.bombilla = bombilla;
    }

    @Override
    public void ejecutar() {
        this.bombilla.apagar();
    }
}
