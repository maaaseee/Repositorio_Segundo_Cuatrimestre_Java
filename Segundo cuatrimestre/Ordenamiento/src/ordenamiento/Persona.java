package ordenamiento;

public class Persona implements Comparable<Persona> {
    private int dni;
    private String nombre;
    private char genero;
    private Nacionalidad nacionalidad;

    public Persona(int dni, String nombre, char genero, Nacionalidad nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", genero=" + genero + '}';
    }

    @Override
    public int compareTo(Persona p) {
        return Integer.compare(dni, p.dni);
        //return nombre.compareTo(o.nombre);
        //return genero - o.genero;
    }
}
