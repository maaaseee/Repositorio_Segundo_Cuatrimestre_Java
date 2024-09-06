package rectangulo;


public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    
    public Persona(String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
    
    public void calcularMasaCorporal(double peso){
        double masaCorporal = peso / (Math.pow(this.altura, 2));
        System.out.println("Su índice de masa corporal es de: " + masaCorporal);
    }
}
