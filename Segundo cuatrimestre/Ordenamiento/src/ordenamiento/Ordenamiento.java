package ordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenamiento {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(55);
        numeros.add(56);
        numeros.add(57);
        
        List<String> nombres = new ArrayList<>();
        nombres.add("Leticia");
        nombres.add("Wanda");
        nombres.add("Pablo");
        nombres.add("Camila");
        nombres.add("Leandra");
        
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(46745279, "Federico", 'M', Nacionalidad.ARGENTINA));
        personas.add(new Persona(43248279, "Nahir", 'F', Nacionalidad.ARGENTINA));
        personas.add(new Persona(47724259, "Sofia", 'F', Nacionalidad.CHILE));
        personas.add(new Persona(41145577, "Mariano", 'M', Nacionalidad.URUGUAY));
        personas.add(new Persona(40481679, "Alejandro", 'M', Nacionalidad.BRASIL));
        
        listarElementos(personas);
        
        personas.sort(new ComparadorPersonasNombre());
        System.out.println("-".repeat(40));
        
        listarElementos(personas);
        
        // Clase anónima
        /*personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return Character.compare(p1.getGenero(), p2.getGenero());
            }
        });     */
        
        personas.sort((Persona p1, Persona p2) -> {
            return Character.compare(p1.getGenero(), p2.getGenero());
        });
    }

    public static <T> void listarElementos(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
