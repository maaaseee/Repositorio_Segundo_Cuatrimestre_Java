package logisticaenvios;

public class Delivery implements TransportadorDePaquetes {
    private String nombre;
    
    public Delivery(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void transporarPaquete() {
        System.out.printf("Soy %s, y estoy entregando el paquete.\n");
    }
    
}
