package rectangulo;


public class Rectangulo {
    private double alto;
    private double ancho;
    
    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public void calcularArea(){
        double area = this.alto * this.ancho;
        System.out.println("El area del rectángulo es igual a: " + area);
    }
    
    public void calcularPerimetro(){
        double perimetro = (this.alto * 2) + (this.ancho * 2);
        System.out.println("El perímetro del rectángulo es igual a: " 
                + perimetro);
    }
    
    public boolean esCuadrado(){
        return this.alto == this.ancho;
    }
}
