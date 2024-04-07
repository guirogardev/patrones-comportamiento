package es.patrones.memento;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public MementoPersona guardarEstado() {
        return new MementoPersona(nombre, edad);
    }

    public void restaurarEstado(MementoPersona mementoPersona) {
        this.nombre = mementoPersona.getNombre();
        this.edad = mementoPersona.getEdad();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
