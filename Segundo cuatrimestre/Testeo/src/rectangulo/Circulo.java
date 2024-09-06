package rectangulo;


public class Circulo {
    private double radio;
    
    public Circulo (double radio){
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double calcularCircunferencia(){
        return 2 * Math.PI * radio;
    }
    
    public double modificarRadio(double porcentaje){
        return radio * (1 + (porcentaje / 100));
    }
}
