package concesionario;

public class AutoRepetidoException extends RuntimeException {

    private static final String MESSAGE = "El auto que quiere ingresar ya se encuentra dentro del concesionario.";

    public AutoRepetidoException() {
        super(MESSAGE);
    }
}
