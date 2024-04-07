package es.patrones.iterator;

public class ListaNombresIterador implements Iterador {
	private int index;
	private String[] nombres;
	
    public ListaNombresIterador(int index, String[] nombres) {
		this.index = index;
		this.nombres = nombres;
	}

	@Override
    public boolean hasNext() {
        return index < this.nombres.length;
    }

    @Override
    public String next() {
        return this.nombres[index++];
    }
}
