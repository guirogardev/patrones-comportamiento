package es.patrones.visitor;

public class VueloInternacional implements Vuelo {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
