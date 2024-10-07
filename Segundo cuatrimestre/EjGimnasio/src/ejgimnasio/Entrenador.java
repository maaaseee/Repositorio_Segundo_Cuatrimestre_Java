package ejgimnasio;

public abstract class Entrenador {
    private int legajo;
    private String nombre;
    private String apellido;
    private int añoIngreso;

    public Entrenador(int legajo, String nombre, String apellido, int añoIngreso) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoIngreso = añoIngreso;
    }
    
    public abstract double getSueldo();
    
    public abstract void mostrarInfo();
    
    protected int getAntiguedad(){
        return this.añoIngreso;
    }
    
    protected String getNombre(){
        return this.nombre;
    }
}
