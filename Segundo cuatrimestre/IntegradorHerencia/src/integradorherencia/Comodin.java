package integradorherencia;

public class Comodin extends Carta {
    private final boolean BLANCONEGRO;
    
    public Comodin(boolean tipo){
        this.BLANCONEGRO = tipo;
    }
    
    @Override
    public String getFrente() {
        return "Comodin " + (BLANCONEGRO ? "blanco y negro" : "de color");
    }
}
