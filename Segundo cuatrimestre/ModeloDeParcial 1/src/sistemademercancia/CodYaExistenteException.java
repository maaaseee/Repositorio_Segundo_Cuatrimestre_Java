package sistemademercancia;

public class CodYaExistenteException extends RuntimeException {
    public static final String MESSAGE = "El c�digo de la mercancia ya fue ingresado en este sistema.";
    
    public CodYaExistenteException() {
        super(MESSAGE);
    }
}
