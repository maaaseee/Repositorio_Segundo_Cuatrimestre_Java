package archivos;

import java.io.Serializable;

public class Mago implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int nivel;
    private int edad;
    
    public Mago(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Mago{" + "nombre=" + nombre + ", nivel=" + nivel + '}';
    }
}
