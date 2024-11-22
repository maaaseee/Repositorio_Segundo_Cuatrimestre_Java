
package comodines;

import java.util.List;


public class Comodines {

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 3, 2, 4, 5, 6);
        List<String> apellidos = List.of("Perez", "Hernandez", "Aieta", "Forbes");
        
        mostrarLista(apellidos);
    }
    
    public static void mostrarLista(List<?> lista) {
        for (Object entero : lista) {
            System.out.println(entero);
            esperar(1);
        }
    }
    
    public static <T> void mostrarLista2(List<T> lista) {
        for (T obj : lista) {
            System.out.println(obj);
        }
    }
    
    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
