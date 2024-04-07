package es.patrones.state;

public class Reproductor {
    private EstadoReproductor estado;

    public Reproductor() {
        this.estado = new Detenido();
    }

    public void reproducir() {
    	this.estado.reproducir();
    	if (!(this.estado instanceof Reproduciendo)) {
    		this.estado = new Reproduciendo();
    	} 
    }

    public void pausar() {
    	this.estado.pausar();
    	if (!(this.estado instanceof Pausado)) {
    		this.estado = new Pausado();
    	}    	
    }

    public void detener() {
    	this.estado.detener();
    	if (!(this.estado instanceof Detenido)) {
    		this.estado = new Detenido();
    	}   
    }
}
