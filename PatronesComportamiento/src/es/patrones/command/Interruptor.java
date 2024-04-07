package es.patrones.command;

public class Interruptor {
	private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void apretar() {
        this.comando.ejecutar();
    }
}
