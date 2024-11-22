package modelodeparcial.pkg2;

import java.util.ArrayList;

public class TrenElectrico extends Tren {
    protected ArrayList<Pasajero> pasajeros;
    
    public TrenElectrico(int capacidadMaxima, String destino) {
        super(capacidadMaxima, destino);
        this.pasajeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        for (Pasajero pasajero : pasajeros) {
            System.out.println(pasajero);
        }
        return "TrenElectrico {" + super.toString() + " pasajeros=" + pasajeros + '}';
    }

    @Override
    public ArrayList<Pasajero> getPasajeros() {
        return this.pasajeros;
    }

    @Override
    public void agregar(Pasajero pasajero) {
        if (pasajero != null) {
            if (pasajeros.size() == getCantidadMaximaPasajeros()) {
                System.out.println("Tren completo!!!!");
                return;
            }
            if ((sonIguales(pasajero, this))) {
                System.out.println("El pasajero ya está en el tren");
                return;
            }
            pasajeros.add(pasajero);
        }
    }
}
