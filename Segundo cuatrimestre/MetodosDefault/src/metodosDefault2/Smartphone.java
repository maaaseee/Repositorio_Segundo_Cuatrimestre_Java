package metodosDefault2;

public class Smartphone extends DispositivoElectronico implements Conectable, Configurable {
    
    public Smartphone(String marca) {
        super(marca);
    }
    
    public void reiniciar() {
        System.out.println("Reiniciando el dispositivo: " + getMarca());
        super.reiniciar();
        Configurable.super.reiniciar();
        Conectable.super.reiniciar();
    }
    
    
}
