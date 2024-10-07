package integradorherencia;

public class CartaNumerica extends CartaPalo{
    private final int NUMERO;
    public static final int MIN_VALUE = 2;
    public static final int MAX_VALUE = 10;
    
    public CartaNumerica(Palo palo, int numero){
        super(palo);
        validarNumero(numero);
        this.NUMERO = numero;
    }
    
    @Override
    public String getFrente() {
        return this.NUMERO + " " + super.getFrente();
    }
    
    private void validarNumero(int numero){
        if (numero < MIN_VALUE || numero > MAX_VALUE) {
            throw new IllegalArgumentException("Número inválido");
        }
    }

}
