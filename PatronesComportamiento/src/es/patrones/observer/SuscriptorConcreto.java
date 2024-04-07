package es.patrones.observer;

public class SuscriptorConcreto implements Suscriptor {
	private String name;

    public SuscriptorConcreto(String name) {
        this.name = name;
    }

    @Override
    public void actualizar(String noticias) {
        System.out.println("¡Hola " + name + "! Nueva noticia: " + noticias);
    }
}
