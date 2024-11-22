package modelodeparcial.pkg2;

import java.util.Objects;

public class Pasajero {
    
    private String apellido;
    private String nombre;
    private Rangos rango;
    
    public Pasajero() {
        this.apellido = "SIN NOMBRE";
        this.nombre = "SIN APELLIDO";
        this.rango = Rangos.CLIENTE;
    }
    
    public Pasajero(String apellido) {
        this.apellido = apellido;
        this.nombre = "SIN APELLIDO";
        this.rango = Rangos.CLIENTE;
    }
    
    public Pasajero(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.rango = Rangos.CLIENTE;
    }
    
    public Pasajero(String apellido, String nombre, Rangos rango) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.rango = rango;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public Rangos getRango() {
        return this.rango;
    }
    
    public static boolean sonIguales(Pasajero p1, Pasajero p2) {
        return p1.hashCode() == p2.hashCode();
    }

    @Override
    public String toString() {
        return "\nAPELLIDO=" + apellido + "\nNOMBRE=" + nombre + "\nRANGO=" + rango;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (obj instanceof Pasajero p) {
            return nombre.equals(p.nombre) && apellido.equals(p.apellido) && rango.equals(p.rango);
        }
        return false;
    }
}
