package sistemademercancia;


public class LenCodMercanciaException extends RuntimeException {
    public static final String MESSAGE = 
            "El c�digo de mercancia no cumple con los requisitos de caracteres (Exactamente 7).";
    
    public LenCodMercanciaException() {
        super(MESSAGE);
    }
}
