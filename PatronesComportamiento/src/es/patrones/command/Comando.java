package es.patrones.command;

/**
 * Tratar los comandos como objetos permite tener colas y gestionar las solicitudes.
 */
public interface Comando {
	public abstract void ejecutar();
}
