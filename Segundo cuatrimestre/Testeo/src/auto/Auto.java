package auto;

public class Auto {
    private String patente;
    private String marca;
    private double precio;
    private String color;
    private Motor motor;

    public Auto(String patente, String marca, double precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", precio=" + precio + ", color=" + color + '}';
    }
    
    
}
