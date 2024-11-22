package bolillero;

public class AutoF1 {
    
    private String piloto;
    private Escuderia escuderia;
    
    public AutoF1 (String piloto, Escuderia escuderia) {
        this.piloto = piloto;
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        return "AutoF1{" + "piloto: " + piloto + ", escuderia: " + escuderia + '}';
    }
    
    
}
