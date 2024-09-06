package rectangulo;


public class MainEjercicios {

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(12.5, 18.5);
        
        rec1.calcularArea();
        rec1.calcularPerimetro();
        System.out.println(rec1.esCuadrado()); 
        
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
        
        Libro lib1 = new Libro("El Principito", "Nomeacuerdojaja", 90, 90);
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
        reloj1.mostrarHora();
        
    }
    
}
