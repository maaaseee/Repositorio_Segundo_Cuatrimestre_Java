package almacen;

public class ItemAlreadyInListException extends RuntimeException {
    public static final String MESSAGE = "El item que quiere agregar, ya se encuentra en el almacen.";

    public ItemAlreadyInListException() {
        super(MESSAGE);
    }
    
    
}
