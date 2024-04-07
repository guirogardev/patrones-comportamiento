package es.patrones.visitor;

public interface Visitor {
	public abstract void visit(VueloInternacional vuelo);
	public abstract void visit(VueloDomestico vuelo);
}
