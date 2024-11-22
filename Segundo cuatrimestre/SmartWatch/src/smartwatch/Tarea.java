package smartwatch;

import java.time.LocalDate;

public class Tarea {

    private String nombre;
    private boolean completada;
    private LocalDate fechaVencimiento;
    private int duracion;
    private int prioridad;

    public Tarea(String nombre, boolean completada, LocalDate fechaVencimiento, int duracion, int prioridad) {
        this.nombre = nombre;
        this.completada = completada;
        this.fechaVencimiento = fechaVencimiento;
        this.duracion = duracion;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea {" + "nombre=" + nombre + ", completada=" + (completada ? "Si" : "No") + ", fechaVencimiento=" + fechaVencimiento + ", duracion=" + duracion + ", prioridad=" + prioridad + '}';
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public boolean isCompletada() {
        return completada;
    }
    
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
}
