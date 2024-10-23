package ejpolimorfismosubtes;

public class TarjetaRecargable extends Tarjeta {
    private double saldo;
    protected static final double LIM_SALDO_NEG = -100;
    
    public TarjetaRecargable(Central central) {
        super(central);
    }
    
    protected double getPrecioViaje() {
        return getCentral().obtenerPrecioViaje();
    }

    @Override
    public void viajar(){
        if (!(checkSaldo()) ) {
            throw new RuntimeException("No se puede cubrir el costo del viaje con el saldo actual de la tarjeta.");
        }
        cobrarViaje();
    }
    
    @Override
    protected boolean checkSaldo() {
        return (this.saldo - getPrecioViaje()) > LIM_SALDO_NEG;
    }
    
    protected void cobrarViaje() {
        this.saldo -= getPrecioViaje();
    }
       
    public double consultarSaldo() {
        System.out.printf("El saldo actual de esta tarjeta es $%.2f\n", this.saldo);
        return this.saldo;
    }
    
    public void recargarSaldo(double cantidadRecargada) {
        if (!(cantidadRecargada > 0)) {
            throw new RuntimeException("No se puede cargar saldo negativo.");
        }
        this.saldo += cantidadRecargada;
    }
    
    protected double getSaldo() {
        return this.saldo;
    }

}
