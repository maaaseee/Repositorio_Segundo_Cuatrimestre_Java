package rectangulo;

public class Pelota {
    private String marca;
    private double circunferencia;
    
    public Pelota(String marca, double circunferencia){
        this.marca = marca;
        this.circunferencia = circunferencia;
    }
    
    private double obtenerCircunferencia() {
        return this.circunferencia;
    }
    
    public void compararPelotas(Pelota comparacion){
        if (this.obtenerCircunferencia() == comparacion.obtenerCircunferencia()) {
            System.out.println("Tienen la misma circunferencia.");
        } else {
            System.out.println("Sus circunferencias son diferentes.");
        }
    }
    
    public void inflarPelota(double aire){
        if (aire > 0) {
            this.circunferencia = this.circunferencia + aire;
            System.out.println("Pelota cargada con éxito.");
        } else {
            System.out.println("No se puede desinflar la pelota.");
        }
    }
}
