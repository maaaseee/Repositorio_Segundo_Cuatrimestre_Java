package auto;

public class Auto {
    private String patente;
    private String marca;
    private double precio;
    private Color color;
    private Motor motor;

    public Auto(String patente, String marca, double precio, Color color, 
            String nroMotor, double cilindrada, String tipoCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.motor = new Motor(nroMotor, cilindrada, tipoCombustible);
    }
    
    public void acelerar(){
        this.motor.subirRPM();
    }
    
    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", precio=" + precio + ", color=" + color + ", motor=" + motor + '}';
    }
    
    
}
