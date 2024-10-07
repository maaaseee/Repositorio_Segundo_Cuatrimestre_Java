package ejgimnasio;

public class PersonalTrainer extends Entrenador{
    public static double sueldoMin = 271571.22;
    private int cantidadClientes;
    private double montoPorCliente;

    public PersonalTrainer(int legajo, String nombre, String apellido, int a�oIngreso, 
            int cantidadClientes, double montoPorCliente) {
        super(legajo, nombre, apellido, a�oIngreso);
        this.cantidadClientes = cantidadClientes;
        this.montoPorCliente = montoPorCliente;
    }
    
    @Override
    public double getSueldo(){
        double montoTotal = montoPorCliente * cantidadClientes;
        if (montoTotal < sueldoMin) {
            return sueldoMin;
        } else {
            return montoTotal;
        }
    }
    
    @Override
    public void mostrarInfo(){
        System.out.printf("Personal trainer: | %s | %.2f |\n", super.getNombre(), this.getSueldo());
    }
    
    public int getQClientes(){
        return this.cantidadClientes;
    }
    
    public boolean compareClientesQ(PersonalTrainer trainerCompare){
        return this.cantidadClientes > trainerCompare.getQClientes();
    }
}
