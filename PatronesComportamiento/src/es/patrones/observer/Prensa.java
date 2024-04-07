package es.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class Prensa {
	private List<Suscriptor> suscriptores = new ArrayList<>();

    public void addSuscriptor(Suscriptor suscriptor) {
    	this.suscriptores.add(suscriptor);
    }

    public void removeSuscriptor(Suscriptor suscriptor) {
    	this.suscriptores.remove(suscriptor);
    }

    public void notifySuscriptores(String noticia) {
        for (Suscriptor suscriptor : this.suscriptores) {
        	suscriptor.actualizar(noticia);
        }
    }
}
