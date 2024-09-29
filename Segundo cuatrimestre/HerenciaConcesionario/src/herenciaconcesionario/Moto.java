package herenciaconcesionario;

public class Moto extends Vehiculo{
    boolean eslingaPuesta;

    public Moto(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }

    public void bloquear(){
        if (!this.eslingaPuesta) {
            this.eslingaPuesta = true;
        }
    }
    
    @Override
    public void acelerar(){
        System.out.println("La moto está acelerando");
    }

    @Override
    public String toString() {
        return "Moto {" + "Marca=" + this.marca + ", Modelo=" + this.modelo +
                ", Patente=" + this.patente + ", EslingaPuesta=" + 
                eslingaPuesta + '}';
    }
    
    
}
