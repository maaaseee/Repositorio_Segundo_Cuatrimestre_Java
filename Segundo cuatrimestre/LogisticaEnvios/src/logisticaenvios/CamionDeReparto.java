package logisticaenvios;

public class CamionDeReparto extends Vehiculo implements TransportadorDePaquetes{

    public CamionDeReparto(String patente, String marca) {
        super(patente, marca);
    }
    
    @Override
    public void transporarPaquete() {
        System.out.printf("Soy el camión %s, y estoy yendo a entregar el paquete.\n", getPatente());
    }
    
}
