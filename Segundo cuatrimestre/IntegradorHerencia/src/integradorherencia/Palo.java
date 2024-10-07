package integradorherencia;

public enum Palo {
    CORAZON(ColorPalo.ROJO),
    DIAMANTE(ColorPalo.ROJO),
    TREBOL(ColorPalo.NEGRO),
    PICAS(ColorPalo.NEGRO);
    
    private ColorPalo color;
    
    private Palo(ColorPalo color){
        this.color = color;
    }
}
