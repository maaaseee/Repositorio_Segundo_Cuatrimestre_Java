package integradorarchivos;

import java.io.Serializable;

public abstract class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private int dni;
    private String nombre;

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre.trim();
    }

    @Override
    public String toString() {
        return "dni=" + dni + ", nombre=" + nombre;
    }

    public String toCSV() {
        return dni + "," + nombre;
    }
}
