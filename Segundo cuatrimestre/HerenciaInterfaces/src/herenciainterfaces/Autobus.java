package herenciainterfaces;

import java.util.ArrayList;
import java.util.List;

public class Autobus implements VehiculoPasajeros {

    private List<String> pasajeros = new ArrayList<>();

    @Override
    public void encender() {
        System.out.println("Encendiendo autobus...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando autobus...");
    }

    @Override
    public void agregarPasajero(String pasajero) {
        pasajeros.add(pasajero);
    }

    @Override
    public int getCantidadPasajeros() {
        return pasajeros.size();
    }

}
