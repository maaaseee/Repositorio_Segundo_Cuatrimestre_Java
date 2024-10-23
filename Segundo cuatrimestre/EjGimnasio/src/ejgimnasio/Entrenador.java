package ejgimnasio;

import java.time.LocalDate;

public abstract class Entrenador {
    private int legajo;
    private String nombre;
    private String apellido;
    private int yearIngreso;

    public Entrenador(int legajo, String nombre, String apellido, int yearIngreso) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.yearIngreso = yearIngreso;
    }
    
    public abstract double getSueldo();
    
    public abstract void mostrarInfo();
    
    protected int getAntiguedad(){
        return LocalDate.now().getYear() - this.yearIngreso;
    }
    
    protected String getNombre(){
        return this.nombre + " " + this.apellido;
    }
}
