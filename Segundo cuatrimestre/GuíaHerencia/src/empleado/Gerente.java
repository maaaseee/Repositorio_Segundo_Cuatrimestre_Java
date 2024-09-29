package empleado;

import java.util.ArrayList;

public class Gerente extends Empleado {
    ArrayList<Empleado> empleadosACargo;
    
    public Gerente(String nombre, double salario){
        super(nombre, salario);
        this.empleadosACargo = new ArrayList<>();
    }
    
    public int cantidadEmpleadosACargo(){
        return this.empleadosACargo.size();
    }
    
    public void ingresarEmpleadoCobijo(Empleado empleado){
        if (empleado != null) {
            this.empleadosACargo.add(empleado);
        }
    }
}
