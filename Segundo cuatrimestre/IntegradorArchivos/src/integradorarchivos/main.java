package integradorarchivos;

import java.util.ArrayList;
import java.util.List;
import servicio.EmpleadoService;
import servicio.Serializadora;

public class main {

    public static void main(String[] args) {
        String path = "src/data/empleados.csv";
        String pathBinario = "src/data/empleadosBin.dat";
        
        List<Empleado> empleados = new ArrayList<>();
        
        EmpleadoService.hardCodearEmpleados(empleados);
        
        String[] datito = {"46745279", "Federico Aieta", "420000.50", "Sistemas"};
        
        Empleado nuevoEmpleado = Empleado.fromCSV(datito);
        
        empleados.add(nuevoEmpleado);
        EmpleadoService.guardarEmpleadosCSV(empleados, path);
        
        /*
        EmpleadoService.listarEmpleados(empleados);
        */
        
        List<Empleado> empleadosCSV = EmpleadoService.cargarEmpleadosCSV(path);
        
        //EmpleadoService.listarEmpleados(empleadosCSV);
        
        Serializadora.serializarEmpleados(empleados, pathBinario);
        
        List<Empleado> empleadosBin = Serializadora.deserializarEmpleados(pathBinario);
        
        EmpleadoService.listarEmpleados(empleadosBin);
    }
    
}
