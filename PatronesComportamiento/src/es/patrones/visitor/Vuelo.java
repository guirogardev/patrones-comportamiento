package es.patrones.visitor;

public interface Vuelo {
	public abstract void accept(Visitor visitor);
}
