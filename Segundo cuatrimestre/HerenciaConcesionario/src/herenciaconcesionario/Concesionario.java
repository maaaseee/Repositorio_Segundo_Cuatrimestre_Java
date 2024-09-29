package herenciaconcesionario;

import java.util.ArrayList;

public class Concesionario {
    String nombre;
    ArrayList<Vehiculo> vehiculos;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new NullPointerException();
        } else {
            this.vehiculos.add(vehiculo);
        }
    }
    
    public void listarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos");
        } else {
            for (Vehiculo v: this.vehiculos) {
                System.out.println(v);
            }
        }
    }
    
    public void listarAutos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos");
        } else {
            for (Vehiculo v: this.vehiculos) {
                if (v instanceof Auto) {
                    System.out.println(v);
                }
            }
        }
    }
}
