package almacen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GestorAlmacen {
    
    public static <T> void mostrarContenido(Almacenable<T> almacenable) {
        System.out.println("Contenido del almacen: ");
        for (T p : almacenable) {
            System.out.println(p);
        }
    }
    
    public static <T> void mostrarContenidoOrdenado(Almacenable<T> almacenable, Comparator<? super T> comparador) {
        Iterator<T> lista = almacenable.iterator(comparador);
        if (!(lista.hasNext())) {
            throw new NullPointerException("La lista está vacía.");
        }
        while(lista.hasNext()) {
            System.out.println(lista.next());
        }
    }
    
    public static <T> List<T> filtrarAlmacen(Almacenable<T> almacenable, Predicate<? super T> criterio) {
        return almacenable.filtrar(criterio);
    }
    
    public static <T> void buscarElementos(Almacenable<T> almacenable, Consumer<? super T> consumer) {
        System.out.println("Aplicando requisitos...");
        almacenable.paraCadaElemento(consumer);
    }
    
    public static <T> List<T> transformarAlmacen(Almacenable<T> almacenable, Function<? super T, ? extends T> modificacion) {
        List<T> modificados = almacenable.transformar(modificacion);
        modificados.forEach(System.out::println);
        return modificados;
    }
}
