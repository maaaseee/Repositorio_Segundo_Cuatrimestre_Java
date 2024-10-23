package sistemademercancia;

public class CodYaExistenteException extends RuntimeException {
    public static final String MESSAGE = "El código de la mercancia ya fue ingresado en este sistema.";
    
    public CodYaExistenteException() {
        super(MESSAGE);
    }
}
