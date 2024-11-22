package servicio;

import integradorarchivos.Empleado;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializadora {

    public static void serializarEmpleados(List<? extends Empleado> lista, String path) {
        try (FileOutputStream binario = new FileOutputStream(path); 
            ObjectOutputStream salida = new ObjectOutputStream(binario)) {

            salida.writeObject(lista);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static List<Empleado> deserializarEmpleados(String path) {
        List<Empleado> toReturn = new ArrayList<>();
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(path))) {
            toReturn = (List<Empleado>) input.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        return toReturn;
    }
}
