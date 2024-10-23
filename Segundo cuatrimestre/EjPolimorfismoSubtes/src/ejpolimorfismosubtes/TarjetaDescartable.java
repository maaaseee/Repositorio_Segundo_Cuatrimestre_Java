package ejpolimorfismosubtes;

public class TarjetaDescartable extends Tarjeta{
    private int cantidadViajes;
    private static final int LIM_VIAJES = 0;

    public TarjetaDescartable(Central central, int cantidadViajes) {
        super(central);
        this.cantidadViajes = cantidadViajes;
    }
    
    public int consultarViajes() {
        System.out.printf("La cantidad de viajes restantes de esta tarjeta es de %d viajes\n", this.cantidadViajes);
        return this.cantidadViajes;
    }

    @Override
    public void viajar() {
        if (!(checkSaldo() )) {
            throw new RuntimeException("Esta tarjeta ya no tiene viajes disponibles.");
        } 
        cobrarViaje();
    }
    
    @Override
    protected boolean checkSaldo() {
        return this.cantidadViajes > LIM_VIAJES;
    }

    @Override
    protected void cobrarViaje() {
        this.cantidadViajes--;
    }
    
    
}
