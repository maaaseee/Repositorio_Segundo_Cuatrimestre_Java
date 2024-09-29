package herenciaconcesionario;

public class Auto extends Vehiculo{
    boolean tieneGPS;

    public Auto(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }
    
    public void setGPS(){
        this.tieneGPS = true;   
    }
    
    public void ingresarRuta(String lugar){
        if (this.tieneGPS) {
            System.out.println("Dirigiendosé a " + lugar);
        } else{
            System.out.println("No hay GPS");
        }
    }
    
    @Override
    public void acelerar(){
        System.out.println("El auto está acelerando");
    }

    @Override
    public String toString() {
        return "Auto {" + "Marca=" + this.marca + ", Modelo=" + this.modelo +
                ", Patente=" + this.patente + ", tieneGPS=" + tieneGPS + '}';
    }
    
    

}
