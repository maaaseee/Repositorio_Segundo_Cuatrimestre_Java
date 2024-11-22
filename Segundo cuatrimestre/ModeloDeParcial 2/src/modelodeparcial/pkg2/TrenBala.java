package modelodeparcial.pkg2;

import java.util.ArrayList;
import java.util.List;

public class TrenBala extends Tren{
    protected int cantidadElectroimanes;
    protected List<Pasajero> pasajeros;

    public TrenBala(int capacidadMaxima, String destino, int cantidadImanes) {
        super(capacidadMaxima, destino);
        this.cantidadElectroimanes = cantidadImanes;
        this.pasajeros = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return "TrenBala {" + super.toString() + " pasajeros=" + pasajeros + '}';
    }

    @Override
    public ArrayList<Pasajero> getPasajeros() {
        return (ArrayList<Pasajero>) this.pasajeros;
    }

    @Override
    public void agregar(Pasajero pasajero) {
        if (pasajero != null) {
            if ((sonIguales(pasajero, this))) {
                System.out.println("El pasajero ya está en el tren");
                return;
            }
            if (pasajeros.size() >= getCantidadMaximaPasajeros()) {
                System.out.println("Tren completo!!!!");
                return;
            }
            pasajeros.add(pasajero);
        }
    }
}
