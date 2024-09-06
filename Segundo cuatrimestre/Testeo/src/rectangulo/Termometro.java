package rectangulo;

public class Termometro {
    private double temperatura;
    private String tipoTemperatura;
    
    public Termometro(double temperatura, String tipo){
        this.temperatura = temperatura;
        this.tipoTemperatura = tipo;
    }
    
    public void convetirFahrenheit(){
        if ("Celsius".equals(this.tipoTemperatura)) {
            double fahrenheit = ((this.temperatura * 9 / 5) + 32);
            System.out.println("La nueva temperatura en Fahrenheit es: " 
                    + fahrenheit);
            this.temperatura = fahrenheit;
            this.tipoTemperatura = "Fahrenheit";
        } 
        else {
            System.out.println("La temperatura ya está en Fahrenheit.");
        }
    }
    
    public void convertirCelsius(){
        if("Fahrenheit".equals(this.tipoTemperatura)){
            double celsius = ((this.temperatura - 32) * 5 / 9);
            System.out.println("La nueva temperatura en Fahrenheit es: " 
                    + celsius);
            this.temperatura = celsius;
            this.tipoTemperatura = "Celsius";
        } else {
            System.out.println("La temperatura ya está en Celsius.");
        }
    }
}
