package es.patrones.cadena;

public class OperacionEditar implements Operacion {
	
	private Operacion next;
	
	@Override
	public void setNext(Operacion o) {
		this.next = o;
	}

	@Override
	public void ejecutar() {
		System.out.println("Editando");
		if (this.next != null) {
			this.next.ejecutar();
		}
	}
}
