package concesionario;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {

    private String nombre;
    private List<Auto> autos;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto autoAg) {
        if (autoAg == null) {
            throw new NullPointerException();
        }
        for (Auto auto : autos) {
            validarAuto(autoAg, auto);
        }
        autos.add(autoAg);
    }

    public void listarAutos() {
        System.out.println("Nombre: " + this.nombre);
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
    
    public int buscarAuto(Auto auto) {
        return autos.indexOf(auto);
    }

    private void validarAuto(Auto a1, Auto a2) {
        if (a1.equals(a2)) {
            throw new AutoRepetidoException();
        }
    }
}
