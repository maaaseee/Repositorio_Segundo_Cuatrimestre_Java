package pp_progii_zoo;

public class AnimalRepetidoException extends RuntimeException {
    private static final String MESSAGE = "El animal que se desea ingresar, YA ESTÁ EN EL ZOOLÓGICO";
    
    public AnimalRepetidoException() {
        super(MESSAGE);
    }
}
