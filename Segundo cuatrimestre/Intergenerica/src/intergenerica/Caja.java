package intergenerica;

public class Caja<T> implements Guardable<T> {
    
    private T elemento;

    @Override
    public void guardar(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public T recuperar() {
        return elemento;
    }
    
    
}
