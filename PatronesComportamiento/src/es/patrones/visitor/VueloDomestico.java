package es.patrones.visitor;

public class VueloDomestico implements Vuelo {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
