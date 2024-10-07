package ejgimnasio;

import java.time.LocalDate;

public class EntrenadorEquipo extends Entrenador{
    private double sueldoFijo;
    public static final double YEAR3TO6_EXTRA = 1.04;
    public static final double YEAR6M_EXTRA = 1.12;

    public EntrenadorEquipo(int legajo, String nombre, String apellido, int añoIngreso, double sueldoFijo) {
        super(legajo, nombre, apellido, añoIngreso);
        this.sueldoFijo = sueldoFijo;
    }
    
    @Override
    public double getSueldo(){
        int añoActual = LocalDate.now().getYear();
        int antiguedad = añoActual - super.getAntiguedad();
        double sueldoActualizado;
        
        if (antiguedad < 3) {
            sueldoActualizado = sueldoFijo;
        } else if (antiguedad >= 3 && antiguedad <= 6) {
            sueldoActualizado = sueldoFijo * YEAR3TO6_EXTRA;
        } else {
            sueldoActualizado = sueldoFijo * YEAR6M_EXTRA;
        }
        
        return sueldoActualizado;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.printf("Entrenador de equipo: | %s | %.2f |\n", super.getNombre(), this.getSueldo());
    }
}
