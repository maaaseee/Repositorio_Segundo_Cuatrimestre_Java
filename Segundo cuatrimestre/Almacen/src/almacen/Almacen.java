package almacen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Almacen <T> implements Almacenable<T> {
    private List<T> items = new LinkedList<>();

    @Override
    public void agregar(T item) {
        if (item == null) {
            throw new NullPointerException("El item que se intenta agregar es un Null");
        }
        if (items.contains(item)) {
            throw new ItemAlreadyInListException();
        }
        
        items.add(item);
    }

    @Override
    public T obtener(int indice) {
        validateIndex(indice);
        return items.get(indice);
    }

    @Override
    public void eliminar(int indice) {
        validateIndex(indice);
        items.remove(indice);
    }

    @Override
    public int tamanio() {
        return items.size();
    }
    
    private void validateIndex(int index) {
        if (index < 0 || index >= tamanio()) {
            throw new IndexOutOfBoundsException("El item que desea buscar no se encuentra en la lista.");
        }
    }

    @Override
    public Iterator<T> iterator() {
        if (!(items.isEmpty()) && items.get(0) instanceof Comparable) {
            return iteratorNatural();
        }
        return items.iterator();
    }
    
    public Iterator<T> iterator(Comparator<? super T> comparador) {
        if (!(items.isEmpty()) && items.get(0) instanceof Comparable) {
            return iteratorNatural(comparador);
        }
        return items.iterator();
    }
    
    private Iterator<T> iteratorNatural() {
        List<T> aux = new ArrayList<>(items);
        aux.sort(null);
        
        return aux.iterator();
    }
    
    private Iterator<T> iteratorNatural(Comparator<? super T> comparador) {
        List<T> aux = new ArrayList<>(items);
        aux.sort(comparador);
        
        return aux.iterator();
    }
    
    public void mostrarContenido() {
        Iterator<T> lista = iterator();
        
        if (!(lista.hasNext())) {
            throw new NullPointerException("La lista está vacía.");
        }
        
        while(lista.hasNext()) {
            System.out.println(lista.next());
        }
    }
    
    @Override
    public List<T> filtrar(Predicate<? super T> criterio) {
        List<T> toReturn = new ArrayList<>();
        for (T item : items) {
            if (criterio.test(item)) {
                toReturn.add(item);
            }
        }
        
        return toReturn;
    }

    @Override
    public void paraCadaElemento(Consumer<? super T> accion) {
        for (T item : items) {
            accion.accept(item);
        }
    }
    
    @Override
    public List<T> transformar(Function<? super T, ? extends T> transformacion) {
        List<T> toReturn = new ArrayList<>();
        for (T item : items) {
            toReturn.add(transformacion.apply(item));
        }
        
        return toReturn;
    }
}
