package smartwatch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Organizador {
    
    public static List<Tarea> filtrarTareas(List<Tarea> tareas, FiltroTarea filtrador) {
        List<Tarea> aux = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (filtrador.test(tarea)) {
                aux.add(tarea);
            }
        }
        return aux;
    }
    
    public static void ordenarTareas(List<Tarea> tareas, Comparator<Tarea> criterio) {
        tareas.sort(criterio);
    }
    
    public static void aplicarAccion(List<Tarea> tareas, AccionTarea accion) {
        for (Tarea tarea : tareas) {
            accion.ejecutar(tarea);
        }
    }
}
