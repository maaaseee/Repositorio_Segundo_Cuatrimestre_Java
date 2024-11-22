package servicio;

import integradorarchivos.Empleado;
import integradorarchivos.Sector;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoService {
    public static void hardCodearEmpleados(List<? super Empleado> lista) {
        lista.add(new Empleado(41632341, "Juan", 200040.24, Sector.SISTEMAS));
        lista.add(new Empleado(32952746, "Javier", 150000.24, Sector.CONTABLE));
        lista.add(new Empleado(36324347, "Laura", 200040.24, Sector.VENTAS));
        lista.add(new Empleado(21682394, "Carla", 200040.24, Sector.RRHH));
    }
    
    public static void listarEmpleados(List<? extends Empleado> lista) {
        System.out.println("Lista de empleados");
        for (Empleado e : lista) {
            System.out.println(e);
        }
    }
    
    public static void guardarEmpleadosCSV(List<? extends Empleado> lista, String path) {
        crearArchivoCSV(path);
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("DNI,Nombre,Sueldo,Sector");
            for (Empleado e : lista) {
                bw.write("\n" + e.toCSV());
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private static boolean crearArchivoCSV(String path) {
        File archivo = new File(path);
        try {
            if(!archivo.exists()) {
                System.out.println("Creando archivo nuevo en " + path);
                archivo.createNewFile();
                return true;
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        System.out.println("El archivo existe en " + path + " ya existe");
        return false;
    }
    
    public static List<Empleado> cargarEmpleadosCSV(String path) {
        List<Empleado> toReturn = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    toReturn.add(Empleado.fromCSV(datos));
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return toReturn;
    }
}
