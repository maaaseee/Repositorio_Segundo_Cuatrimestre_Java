package rectangulo;


public class Rectangulo {
    private double alto;
    private double ancho;
    
    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public double calcularArea(){
        return alto * ancho;
    }
    
    public double calcularPerimetro(){
        return (alto * 2) + (ancho * 2);
    }
    
    public boolean esCuadrado(){
        return alto == ancho;
    }
}
