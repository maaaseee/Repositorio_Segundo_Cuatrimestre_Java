package logisticaenvios;

public class DronDeEntrega extends DispositivoElectronico implements TransportadorDePaquetes {
    private String marca;
    
    public DronDeEntrega(String marca) {
        this.marca = marca;
    }
    
    public void encender() {
        System.out.println("Encendiendo el dron...");
    }

    @Override
    public void transporarPaquete() {
        System.out.println("Soy un dron que está entregando un paquete.");
    }
    
}
