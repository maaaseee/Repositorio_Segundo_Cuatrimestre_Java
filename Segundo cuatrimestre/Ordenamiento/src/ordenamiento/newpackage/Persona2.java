package ordenamiento.newpackage;

public class Persona2 implements Comparable<Persona2> {
    private int dni;
    private String nombre;
    private char genero;

    public Persona2(int dni, String nombre, char genero) {
        this.dni = dni;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", genero=" + genero + '}';
    }

    @Override
    public int compareTo(Persona2 p) {
        return Integer.compare(dni, p.dni);
        //return nombre.compareTo(o.nombre);
        //return genero - o.genero;
    }
}
