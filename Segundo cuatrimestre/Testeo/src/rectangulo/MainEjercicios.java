package rectangulo;


public class MainEjercicios {

    public static void main(String[] args) {
        // ANCHO - ALTO
        Rectangulo rec1 = new Rectangulo(100, 50);
        Rectangulo rec2 = new Rectangulo(30, 20);
        
        System.out.println("----------------------------------------");
        System.out.println("Rec 3");
        
        double width1 = rec1.getWidth() + rec2.getWidth();
        double height1 = rec1.getHeight() + rec2.getHeight();
        
        Rectangulo rec3 = new Rectangulo(height1, width1);
        
        rec3.getInfo();
        
        System.out.println("----------------------------------------");
        System.out.println("Rec 4");
        
        double width2 = rec1.sumWidth(rec2);
        double height2 = rec1.sumHeight(rec2);
        
        Rectangulo rec4 = new Rectangulo(height2, width2);
        
        rec4.getInfo();
        
        System.out.println("----------------------------------------");
        System.out.println("Rec 5");
        
        Rectangulo rec5 = rec1.sumRectangle(rec2);
        
        rec5.getInfo();
        
        System.out.println("----------------------------------------");
        System.out.println("Rec 6");
        
        Rectangulo rec6 = rec1.sumRectangleSimpl(rec2);
        
        rec6.getInfo();
        
        System.out.println("----------------------------------------");
        System.out.println("Rec 7");
        
        Rectangulo rec7 = new Rectangulo(0, 0);
        rec7.sumRectangleCompx(rec1, rec2);
        
        rec7.getInfo();
        
        System.out.println("----------------------------------------");
        System.out.println("Rec 8");
        
        Rectangulo rec8 = Rectangulo.sumRectangle(rec1, rec2);
        
        rec8.getInfo();
        
        /*rec1.calcularArea();
        rec1.calcularPerimetro();
        rec1.esCuadrado();
        
        Circulo circ1 = new Circulo(10);
        
        circ1.calcularArea();
        circ1.calcularCircunferencia(); 
        circ1.modificarRadio(150);
        
        Persona persn1 = new Persona("Marcela", 18, 1.6);
        
        System.out.println(persn1.esMayorDeEdad());
        persn1.calcularMasaCorporal(70);
        
        Coche fiatcito = new Coche("Fiat", "Chronos", 20134, 0);
        
        fiatcito.calcularKilometros();
        fiatcito.recargarNafta(0.1);
        fiatcito.mostrarNafta(); 
        
        Libro lib1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 90, 90);
        lib1.pasarPagina();
        lib1.mostrarLibro();
        
        lib1.finalizado(); 
        
        CuentaBancaria usuario = new CuentaBancaria("Alejandro Gomez", 40000.5);
        usuario.retirarDinero(20000);
        usuario.depositarDinero(50000);
        usuario.consultarSaldo(); 
        
        Termometro tem1 = new Termometro(69.8, "Fahrenheit");
        tem1.convertirCelsius();
        tem1.convetirFahrenheit(); 
        
        Producto prod1 = new Producto("Papa", 100, 40);
        prod1.aplicarDescuento(15);
        prod1.realizarVenta(40); 
        
        Pelota pelota1 = new Pelota("Adidas", 40);
        Pelota pelota2 = new Pelota("YPF", 37);
        
        pelota1.compararPelotas(pelota2); 
        
        Reloj reloj1 = new Reloj(12, 59, 59);
        reloj1.mostrarHora();
        reloj1.avanzarSegundo();
        reloj1.mostrarHora(); */
    }
}
