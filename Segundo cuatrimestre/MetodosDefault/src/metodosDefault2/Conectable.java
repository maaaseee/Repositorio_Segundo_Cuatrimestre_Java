package metodosDefault2;

public interface Conectable {
    default void reiniciar() {
        System.out.println("Conectando dispositivo...");
    }
}
