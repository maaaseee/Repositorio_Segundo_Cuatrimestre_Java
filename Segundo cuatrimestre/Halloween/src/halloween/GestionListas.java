package halloween;

import java.util.List;

public class GestionListas {
    
    public static void iniciarHalloween(List<? extends Criatura> lista) {
        for (Criatura c : lista) {
            c.asustar();
        }
    }
    
    // Upper Bound Wildcard
    public static void materializarLista(List<? extends Espectro> lista) {
        for (Espectro e : lista) {
            e.materializar();
        }
    }
    
    public static void liberarAterradores(List<? extends Aterrable> lista) {
        for (Aterrable at : lista) {
            at.aterrar();
        }
    }
    
    public static void agregarEspectro(List<? super Espectro> lista, Espectro nuevo) {
        lista.add(nuevo);
    }
    
    public static <T> void agregarElemento(List<? super T> lista, T nuevo) {
        lista.add(nuevo);
    }
}
