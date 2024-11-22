package bolillero;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class BolilleroGenerico<T> {
    private List<T> bolillero = new ArrayList<>();
    private Random random = new Random();
    
    public void agregarBolilla(T bolilla) {
        if (bolilla == null) {
            throw new NullPointerException("La bolilla es nula.");
        }
        
        bolillero.add(bolilla);
    }
    
    public T getBolillaReposicion() {
        verificarBolillero();
        
        return bolillero.get(getBolillaRandom());
    }
    
    public T getBolillaSinReposicion() {
        verificarBolillero();
        
        return bolillero.remove(getBolillaRandom());
    }
    
    private int getBolillaRandom() {
        return random.nextInt(getBolillasQ());
    }
    
    private int getBolillasQ() {
        return bolillero.size();
    }
    
    private void verificarBolillero() {
        if (!(quedanBolillas())) {
            throw new NoSuchElementException("No quedan bolillas en el bolillero");
        }
    }
    
    public boolean quedanBolillas() {
        return !bolillero.isEmpty();
    }
    
    public static <T> void cargarBolilleroGenerico(BolilleroGenerico<T> bolillero, T[] bolillas) {
        for (int i = 0; i < bolillas.length; i++) {
            bolillero.agregarBolilla(bolillas[i]);
        }
        System.out.println("Bolillero cargado!");
    }
}
