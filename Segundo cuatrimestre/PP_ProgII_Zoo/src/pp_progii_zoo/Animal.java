package pp_progii_zoo;

import java.util.Objects;

public abstract class Animal {
    
    private String nombre;
    private int edad;
    
    public Animal(String nombre, int edad) {
        validarEdad(edad);
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", edad: " + edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Animal animal) {
            return hashCode() == animal.hashCode();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
    
    private void validarEdad(int edad) {
        if (edad < 0) {
            throw new EdadNoPermitidaException();
        }
    }
}
