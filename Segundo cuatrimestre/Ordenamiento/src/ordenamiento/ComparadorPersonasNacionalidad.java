package ordenamiento;

import java.util.Comparator;

public class ComparadorPersonasNacionalidad implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNacionalidad().name().compareTo(p2.getNacionalidad().name());
    }

}
