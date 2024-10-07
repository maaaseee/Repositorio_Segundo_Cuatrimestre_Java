package integradorherencia;

public class CartaFigura extends CartaPalo{
    private final char LETRA;
    public static final char[] LITERALES = {'A', 'J', 'Q', 'K'};
    
    public CartaFigura(Palo palo, char letra){
        super(palo);
        validarLetra(letra);
        this.LETRA = letra;
    }

    @Override
    public String getFrente() {
        return this.LETRA + " " + super.getFrente();
    }
    
    private static void validarLetra(char letra){
        int i = 0;
        while(i < LITERALES.length && letra != LITERALES[i]){
            i++;
        }
        if (i == LITERALES.length) {
            throw new IllegalArgumentException("Figura inválida");
        }
    }
}
