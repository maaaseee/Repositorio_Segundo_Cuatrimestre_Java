package ordenamiento;

import java.util.Comparator;

public class ComparadorPersonasNombreDesc implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        return p2.getNombre().compareTo(p1.getNombre());
    }
    
}
