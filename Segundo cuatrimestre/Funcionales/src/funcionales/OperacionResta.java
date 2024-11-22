package funcionales;

public class OperacionResta<T> implements Operable<Integer> {

    @Override
    public Integer operar(Integer a, Integer b) {
        return a - b;
    }
    
    
}
