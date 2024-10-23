package logisticaenvios;

import java.util.ArrayList;
import java.util.List;

public class EmpresaLogistica {
    private String nombre;
    private List<TransportadorDePaquetes> transportadores;

    public EmpresaLogistica(String nombre) {
        this.nombre = nombre;
        this.transportadores = new ArrayList<>();
    }
    
    public void agregarTransportador(TransportadorDePaquetes t) {
        if (t != null) {
            transportadores.add(t);
        }
    }
    
    public void iniciarEntregas() {
        System.out.printf("Empresa %s está iniciando las entregas...\n", this.nombre);
        for (TransportadorDePaquetes t : transportadores) {
            t.transporarPaquete();
        }
    }
}
