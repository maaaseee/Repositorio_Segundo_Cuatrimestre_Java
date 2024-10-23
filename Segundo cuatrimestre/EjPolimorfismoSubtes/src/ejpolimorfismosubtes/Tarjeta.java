package ejpolimorfismosubtes;

public abstract class Tarjeta {
    private Central central;
    
    public Tarjeta(Central central) {
        this.central = central;
    }
    
    public abstract void viajar();
    
    protected abstract boolean checkSaldo();
    
    protected abstract void cobrarViaje();
    
    public Central getCentral() {
        return this.central;
    }
}
