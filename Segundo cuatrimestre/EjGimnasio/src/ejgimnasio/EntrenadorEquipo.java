package ejgimnasio;

public class EntrenadorEquipo extends Entrenador{
    private double sueldoFijo;
    public static final double EXTRA_SEGUNDA_CATEGORIA = 1.04;
    public static final double EXTRA_TERCER_CATEGORIA = 1.12;
    public static final int LIM_PRIMER_CATEGORIA = 3;
    public static final int LIM_SEGUNDA_CATEGORIA = 6;

    public EntrenadorEquipo(int legajo, String nombre, String apellido, int yearIngreso, double sueldoFijo) {
        super(legajo, nombre, apellido, yearIngreso);
        this.sueldoFijo = sueldoFijo;
    }
    
    @Override
    public double getSueldo(){
        int antiguedad = this.getAntiguedad();
        if (antiguedad < LIM_PRIMER_CATEGORIA) {
            return sueldoFijo;
        }
        
        return antiguedad <= LIM_SEGUNDA_CATEGORIA ? (sueldoFijo * EXTRA_SEGUNDA_CATEGORIA) : (sueldoFijo * EXTRA_TERCER_CATEGORIA);
    }
    
    @Override
    public void mostrarInfo(){
        System.out.printf("Entrenador de equipo: | %s | %.2f |\n", super.getNombre(), this.getSueldo());
    }
}
