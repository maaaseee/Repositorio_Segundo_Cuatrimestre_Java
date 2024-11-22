package smartwatch;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Tarea> tareas = Arrays.asList(
            new Tarea("Estudiar para el parcial", false, LocalDate.of(2024, 11, 21), 240, 1),
            new Tarea("Hacer ejercicio", true, LocalDate.of(2024, 11, 20), 120, 2),
            new Tarea("Ir al médico", false, LocalDate.of(2024, 12, 28), 180, 1),
            new Tarea("Comprar una taza", true, LocalDate.of(2024, 12, 22), 30, 3)
        );

        //List<Tarea> completadas = Organizador.filtrarTareas(tareas, tarea -> tarea.isCompletada());
        
        // "Referencia a método"
        List<Tarea> completadas = Organizador.filtrarTareas(tareas, Tarea::isCompletada);
        
        System.out.println("Lista de tareas completadas\n");
        completadas.forEach(System.out::println);
        
        
        
        
        
        System.out.println("\nPrioridad tareas\n");
        /*Organizador.ordenarTareas(tareas, 
                (t1, t2) -> t1.getFechaVencimiento().compareTo(t2.getFechaVencimiento())
        );*/
        
        // En orden ascendente
        Organizador.ordenarTareas(tareas, Comparator.comparing(Tarea::getFechaVencimiento));
        
        tareas.forEach(System.out::println);
        
        System.out.println("\nOrden inverso\n");
        
        // En orden descendente
        Organizador.ordenarTareas(tareas, Comparator.comparing(Tarea::getFechaVencimiento).reversed());
        
        tareas.forEach(System.out::println);
        
        
        
        System.out.println("\nTareas a realizar\n");
        List<Tarea> pendientes = Organizador.filtrarTareas(tareas, t -> !t.isCompletada());

        Organizador.aplicarAccion(pendientes, t -> System.out.println("Recordá: " + t.getNombre()));
        
        System.out.println("Vencen hoy");
        List<Tarea> vencenHoy = Organizador.filtrarTareas(tareas, t -> t.getFechaVencimiento().equals(LocalDate.now()));
        
        Organizador.aplicarAccion(vencenHoy, t -> System.out.println("Recordá que " + t.getNombre() + ", vence hoy."));

    }

}
