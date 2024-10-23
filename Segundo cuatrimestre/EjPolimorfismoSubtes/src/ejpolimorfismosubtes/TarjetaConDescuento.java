package ejpolimorfismosubtes;

public class TarjetaConDescuento extends TarjetaRecargable {
    private double porcDescuento;
    
    public TarjetaConDescuento(Central central, double porcDescuento) {
        super(central);
        this.porcDescuento = porcDescuento;
    }
    
    @Override
    protected double getPrecioViaje() {
        return super.getPrecioViaje() * (1 - porcDescuento);
    }
    
    @Override
    public void viajar(){
        if (!(checkSaldo())) {
            throw new RuntimeException("No se puede cubrir el costo del viaje con el saldo actual de la tarjeta.");
        }
        cobrarViaje();
    }
    
    @Override
    protected boolean checkSaldo() {
        return (getSaldo() - getPrecioViaje()) > LIM_SALDO_NEG;
    }
}
