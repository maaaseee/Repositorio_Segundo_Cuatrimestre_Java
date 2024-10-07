package ejgimnasio;

public abstract class Entrenador {
    private int legajo;
    private String nombre;
    private String apellido;
    private int a�oIngreso;

    public Entrenador(int legajo, String nombre, String apellido, int a�oIngreso) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.a�oIngreso = a�oIngreso;
    }
    
    public abstract double getSueldo();
    
    public abstract void mostrarInfo();
    
    protected int getAntiguedad(){
        return this.a�oIngreso;
    }
    
    protected String getNombre(){
        return this.nombre;
    }
}
