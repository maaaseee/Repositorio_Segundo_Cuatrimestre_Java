package auto;

public class Motor {
    private String nroSerie;
    private double cilindrada;
    private String tipoCombustible;
    private int rpm;

    public Motor(String numero, double cilindrada, String tipo) {
        this.nroSerie = numero;
        this.cilindrada = cilindrada;
        this.tipoCombustible = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" + "nroSerie=" + nroSerie + ", cilindrada=" + cilindrada + ", tipoCombustible=" + tipoCombustible + ", rpm=" + rpm + '}';
    }
    
    public void subirRPM(){
        this.rpm += 1000;
    }
    
}
