package integradorlistas;

public class Dispositivo {
    private final String ID;
    private double precio;
    private TipoDispositivo tipo;

    public Dispositivo(String ID, double precio, TipoDispositivo tipo) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    public boolean checkDispositivo(TipoDispositivo tipo){
        return tipo.equals(this.tipo);
    }
    
    public TipoDispositivo getDispositivoType(){
        return this.tipo;
    }
    
    public boolean checkID(String ID){
        return ID.equals(this.ID);
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "ID=" + ID + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
}
