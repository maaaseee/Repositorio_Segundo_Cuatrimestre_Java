package integradorherencia;

public abstract class CartaPalo extends Carta {
    private final Palo PALO;
    
    public CartaPalo(Palo palo){
        super();
        this.PALO = palo;
    }
    
    protected Palo getPalo(){
        return this.PALO;
    }

    @Override
    public String getFrente() {
        return "de " + this.PALO;
    }
    
    
}
