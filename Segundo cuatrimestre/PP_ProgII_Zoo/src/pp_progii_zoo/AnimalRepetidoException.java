package pp_progii_zoo;

public class AnimalRepetidoException extends RuntimeException {
    private static final String MESSAGE = "El animal que se desea ingresar, YA EST� EN EL ZOOL�GICO";
    
    public AnimalRepetidoException() {
        super(MESSAGE);
    }
}
