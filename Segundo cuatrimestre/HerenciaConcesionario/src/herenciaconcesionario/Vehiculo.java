package herenciaconcesionario;

public abstract class Vehiculo {
    String marca;
    String modelo;
    String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }
    
    public abstract void acelerar();
    
    public void encender(){
        if(checkMotor()){
            System.out.println("Se encendió el vehículo");
        }
    }
    
    public void frenar(){
        System.out.println("Frenando el vehículo...");
    }

    private boolean checkMotor(){
        System.out.println("ta joya");
        return true;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + '}';
    }
}
