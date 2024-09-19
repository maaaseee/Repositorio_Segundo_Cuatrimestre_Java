package POSNET;

public class Posnet {
    private final static int MAX_CUOTAS = 6;
    private final static int MIN_CUOTAS = 1;
    private final static double RECARGO = 0.03;
    
    public Posnet(){   }
    
    /*public Ticket efectuarPago(Tarjeta tarjeta, int cuotas, double costo){
        if (tarjeta.getSaldo() < costo || costo < 0) {
            return null;
        }
        if (cuotas > MAX_CUOTAS || cuotas < MIN_CUOTAS) {
            if (cuotas > 1) {
                double costoConRecargo = costo * (1 + calcularPorcRecargo(cuotas));
                double montoEnCuotas = costoConRecargo / cuotas;
                tarjeta.cobrarPago(montoEnCuotas);
                return new Ticket(tarjeta.getTitular(), costoConRecargo, montoEnCuotas);
            } else {
                tarjeta.cobrarPago(costo);
                return new Ticket(tarjeta.getTitular(), costo, costo);   
            }
        } else {
            return null;
        }
    }*/
    
    public Ticket efectuarPago(Tarjeta tarjeta, int cuotas, double monto){
        try{
            validarDatos(tarjeta, cuotas, monto);
            double porcRecargo = monto * calcularPorcRecargo(cuotas);
            
            if (checkMonto(tarjeta, monto)) {
                tarjeta.debitar(monto);
                return new Ticket(tarjeta.getTitular(), porcRecargo, cuotas);
            }  
        } 
        catch (Exception ex) {
            System.out.println("No se pudo concretar el pago.");
        }
        return null;
    }   
    
    private boolean validarCuotas(int cuotas){
        if (cuotas < MIN_CUOTAS || cuotas > MAX_CUOTAS) {
            throw new IllegalArgumentException("Cuotas inválidas");
        }
        return true;
    }
    
    private boolean validarTarjeta(Tarjeta tarjeta){
        if (tarjeta == null) {
            throw new NullPointerException("Tarjeta nula");
        }
        return true;
    }
    
    private boolean validarMonto(double monto){
        if (monto <= 0) {
            throw new IllegalArgumentException("Monto inválido");
        }
        return true;
    }
    
    private boolean validarDatos(Tarjeta tarjeta, int cuotas, double monto){
        return validarTarjeta(tarjeta) && validarMonto(monto) && validarCuotas(cuotas);
    }
    
    private double calcularPorcRecargo(int cuotas){
        return (RECARGO * (cuotas - 1) + 1);
    }
    
    public void verTicket(Ticket tik){
        System.out.println(tik);
    }
    
    private boolean checkMonto(Tarjeta tarjeta, double monto){
        return tarjeta.puedoPagar(monto);
    }
}
