package ejpolimorfismosubtes;

public class main {

    public static void main(String[] args) {
        Central central = new Central("Central norte", 50);
        
        // PARTE A
        TarjetaRecargable tarjetaR1 = new TarjetaRecargable(central);
        
        tarjetaR1.viajar();
        tarjetaR1.consultarSaldo();
        tarjetaR1.recargarSaldo(500);
        tarjetaR1.consultarSaldo();
        
        // PARTE B
        System.out.println("---------------------------------------------------");
        
        TarjetaDescartable tarjetaD1 = new TarjetaDescartable(central, 10);
        
        tarjetaD1.viajar();
        tarjetaD1.consultarViajes();
        
        // PARTE C
        
        System.out.println("---------------------------------------------------");
        
        TarjetaConDescuento tarjetaRD1 = new TarjetaConDescuento(central, 0.50);
        
        tarjetaRD1.viajar();
        tarjetaRD1.consultarSaldo();
        tarjetaRD1.recargarSaldo(500);
        tarjetaRD1.consultarSaldo();
    }
    
}
