package es.patrones.memento;

public class MementoPersona {
    private String nombre;
    private int edad;

    public MementoPersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
