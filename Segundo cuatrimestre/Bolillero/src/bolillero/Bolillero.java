package bolillero;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Bolillero {
    
    private List<Integer> bolillero = new ArrayList<>();
    private Random random = new Random();
    
    public void agregarBolilla(Integer numero) {
        if (numero == null) {
            throw new NullPointerException("La bolilla es nula.");
        }
        
        bolillero.add(numero);
    }
    
    public Integer getBolillaReposicion() {
        verificarBolillero();
        
        return bolillero.get(getBolillaRandom());
    }
    
    public Integer getBolillaSinReposicion() {
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
}
