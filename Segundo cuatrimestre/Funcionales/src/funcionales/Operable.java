package funcionales;

@FunctionalInterface
public interface Operable<T> {
    
    T operar(T a, T b);
}
