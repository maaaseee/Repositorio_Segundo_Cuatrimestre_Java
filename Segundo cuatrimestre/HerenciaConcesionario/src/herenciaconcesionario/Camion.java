package herenciaconcesionario;

public class Camion extends Vehiculo{
    double carga;
    
    public Camion(String marca, String modelo, String patente, double carga){
        super(marca, modelo, patente);
        
        this.carga = carga;
    }
    
    @Override
    public void acelerar(){
        System.out.println("El camión está acelerando");
    }

    @Override
    public String toString() {
        return "Camion{" + "Marca=" + this.marca + ", Modelo=" + this.modelo +
                ", Patente=" + this.patente + ", Carga=" + carga + '}';
    }
    
    
}
