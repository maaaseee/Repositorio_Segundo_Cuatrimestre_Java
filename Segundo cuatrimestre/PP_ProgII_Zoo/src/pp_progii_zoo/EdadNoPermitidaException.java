package pp_progii_zoo;

public class EdadNoPermitidaException extends RuntimeException {
    private static final String MESSAGE = "La edad del animal no puede ser menor a 0.";
    
    public EdadNoPermitidaException() {
        super(MESSAGE);
    }
}
