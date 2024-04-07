package es.patrones.cadena;

public interface Operacion {
	
	public void setNext(Operacion o);
	public void ejecutar();
}
