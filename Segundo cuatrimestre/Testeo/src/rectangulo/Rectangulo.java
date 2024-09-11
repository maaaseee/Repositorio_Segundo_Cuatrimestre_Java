package rectangulo;


public class Rectangulo {
    private double alto;
    private double ancho;
    
    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public double calcularArea(){
        double area = this.alto * this.ancho;
        System.out.println("El area del rectángulo es igual a: " + area + "cm");
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro = (this.alto * 2) + (this.ancho * 2);
        System.out.println("El perímetro del rectángulo es igual a: " 
                + perimetro + "cm");
        return perimetro;
    }
    
    public boolean esCuadrado(){
        boolean verificacion = (this.alto == this.ancho);
        System.out.println((verificacion)?"Es cuadrado":"No es cuadrado");
        return verificacion;
    }
    
    public double getWidth(){
        return this.ancho;
    }
    
    public double getHeight(){
        return this.alto;
    }
    
    public void getInfo(){
        System.out.println("Alto: " + this.alto + "\nAncho: " + this.ancho);
    }
    
    public double sumWidth(Rectangulo rec2){
        return this.getWidth() + rec2.getWidth();
    }
    
    public double sumHeight(Rectangulo rec2){
        return this.getHeight() + rec2.getHeight();
    }
    
    public Rectangulo sumRectangle(Rectangulo rec2){
        double height = this.alto + rec2.getHeight();
        double width = this.ancho + rec2.getWidth();
        
        Rectangulo newRec = new Rectangulo(height, width);
        
        return newRec;
    }
    
    public Rectangulo sumRectangleSimpl(Rectangulo rec2){
        Rectangulo newRec = new Rectangulo(this.sumHeight(rec2),
                this.sumWidth(rec2));
        
        return newRec;
    }
    
    public void sumRectangleCompx(Rectangulo rec1, Rectangulo rec2){
        this.alto = rec1.sumHeight(rec2);
        this.ancho = rec1.sumWidth(rec2);
    }
    
    public static Rectangulo sumRectangle(Rectangulo rec1, Rectangulo rec2){
        Rectangulo newRec = new Rectangulo(Rectangulo.sumHeight(rec1, rec2),
                Rectangulo.sumWidth(rec1, rec2));
        
        return newRec;
    }
    
    public static double sumHeight(Rectangulo rec1, Rectangulo rec2){
        return rec1.alto + rec2.alto;
    }
    
    public static double sumWidth(Rectangulo rec1, Rectangulo rec2){
        return rec1.ancho + rec2.ancho;
    }
}
