package concesionario;

import java.util.Objects;

public class Auto {

    private String patente;
    private String marca;
    private String modelo;

    public Auto(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof String str) {
            return str.equals(patente);
        }
        if (o instanceof Auto a) {
            return patente.equals(a.patente) && marca.equals(a.marca);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(patente, marca);
    }

    @Override
    public String toString() {
        return "Auto {" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

}
