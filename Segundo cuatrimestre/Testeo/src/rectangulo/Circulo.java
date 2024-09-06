package rectangulo;


public class Circulo {
    private double radio;
    
    public Circulo (double radio){
        this.radio = radio;
    }
    
    public void calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del círculo es igual a: " + area);
    }
    
    public void calcularCircunferencia(){
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del círculo es igual a: " 
                + circunferencia);
    }
    
    public void modificarRadio(double porcentaje){
        double modificacion = radio * (1 + (porcentaje / 100));
        System.out.println("El nuevo radio del círculo es igual a: " 
                + modificacion);
    }
}
