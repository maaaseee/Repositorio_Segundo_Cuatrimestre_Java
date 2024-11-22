package modelodeparcial.pkg2;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Tren {
    
    private final int CANTIDADMAXIMAPASAJEROS;
    private String destino;
    private boolean motorEncendido;
    
    public Tren(int cantidadMaxPasj, String destino) {
        this.CANTIDADMAXIMAPASAJEROS = cantidadMaxPasj;
        this.destino = destino;
    }
    
    public int getCantidadMaximaPasajeros() {
        return this.CANTIDADMAXIMAPASAJEROS;
    }
    
    public String getDestino() {
        return this.destino.toUpperCase();
    }
    
    public abstract ArrayList<Pasajero> getPasajeros();
    
    public abstract void agregar(Pasajero pasajero);

    @Override
    public String toString() {
        return "Capacidad Máxima=" + CANTIDADMAXIMAPASAJEROS + 
                ", Destino=" + destino + ", Motor encendido=" + motorEncendido;
    }
    
    public static boolean sonIguales(Pasajero pasajero, Tren tren) {
        return tren.getPasajeros().contains(pasajero);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tren other = (Tren) obj;
        if (this.CANTIDADMAXIMAPASAJEROS != other.CANTIDADMAXIMAPASAJEROS) {
            return false;
        }
        if (this.motorEncendido != other.motorEncendido) {
            return false;
        }
        return Objects.equals(this.destino, other.destino);
    }
    
    
}
