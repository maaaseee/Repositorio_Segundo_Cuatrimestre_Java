package metodosDefault2;

public interface Configurable {
    default void reiniciar() {
        System.out.println("Reiniciando configuración...");
    }
}
