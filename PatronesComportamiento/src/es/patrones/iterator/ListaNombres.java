package es.patrones.iterator;

public class ListaNombres {
	private String[] nombres;

    public ListaNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public Iterador createIterator() {
        return new ListaNombresIterador(0, nombres);
    }
}
