package es.patrones.templateMethod;

public abstract class Juego {
	
	// Pasos que pueden variar entre subclases y que todas ellas deben implementar.
	public void jugar() {
        this.prepararTablero();
        this.jugarJuego();
        this.celebrarGanador();
    }
    
    protected abstract void prepararTablero();
    
    protected abstract void jugarJuego();
    
    protected abstract void celebrarGanador();
}
