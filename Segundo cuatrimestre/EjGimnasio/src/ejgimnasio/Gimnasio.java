package ejgimnasio;

import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private ArrayList<Entrenador> entrenadores;
    
    public Gimnasio(String nombre){
        this.nombre = nombre;
        this.entrenadores = new ArrayList<>();
    }
    
    public void mostrarSueldos(){
        if (!entrenadores.isEmpty()) {
            for (Entrenador entrenador : entrenadores) {
                entrenador.mostrarInfo();
            }
        }
    }
    
    public void agregarEntrenador(Entrenador trainer){
        entrenadores.add(trainer);
    }
    
    public PersonalTrainer entrenadorConMasClientes(){
        if (entrenadores.isEmpty()) {
            return null;
        }
        
        PersonalTrainer trainerEncontrado = buscarMayorQDeClientes();
        
        return trainerEncontrado != null ? trainerEncontrado : null;
    }
    
    private PersonalTrainer buscarMayorQDeClientes(){
        PersonalTrainer trainerMasClientudo = null;
        
        for (Entrenador entrenador : entrenadores) {
            if (entrenador instanceof PersonalTrainer trainer){
                if (trainerMasClientudo == null || trainer.compareClientesQ(trainerMasClientudo)) {
                    trainerMasClientudo = trainer;
                }
            }
        }
        return trainerMasClientudo;
    }
}
