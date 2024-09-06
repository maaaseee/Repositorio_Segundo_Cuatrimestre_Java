package rectangulo;


public class Coche {
    private static final double MAX_COMBUST = 45;
    private static final int KM_POR_LT = 12;
    
    private String marca;
    private String modelo;
    private int kilometraje;
    private double combustibleRestante;
    
    public Coche(String marca, String modelo, int kilometraje, double combustibleRestante){
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.combustibleRestante = combustibleRestante;
    }
    
    public double calcularKilometros() {
        if (combustibleRestante > 0){
            return combustibleRestante * KM_POR_LT;
        }
        else {
            System.out.println("No hay combustible");
            return 0;
        }
    }
    
    public void recargarNafta(double cantidadDeNafta){
        if (cantidadDeNafta <= 0){
            System.out.println("No se puede descargar el combustible.");
            return;
        }
        
        if ((cantidadDeNafta + this.combustibleRestante) > MAX_COMBUST){
            this.combustibleRestante = MAX_COMBUST;
            System.out.println("Combustible recargado al tope.");
        } 
        else{
            this.combustibleRestante += cantidadDeNafta;
            System.out.println("Se recargo el combustible.");
        }
    }
    
    public void mostrarNafta(){
        System.out.println("Marca: " + this.marca +
                           "\nModelo: " + this.modelo +
                           "\nCombustible: " + this.combustibleRestante);
    }
}
