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
    
    public void entrenadorConMasClientes(){
        PersonalTrainer trainerMasClientudo = null;
        
        if (entrenadores.isEmpty()) {
            return;
        }
        
        for (Entrenador entrenador : entrenadores) {
            if (entrenador instanceof PersonalTrainer perst){
                if (trainerMasClientudo == null || perst.compareClientesQ(trainerMasClientudo)) {
                    trainerMasClientudo = perst;
                }
            }
        }
        
        if (trainerMasClientudo != null) {
            trainerMasClientudo.mostrarInfo();
        } else {
            System.out.println("No hay Personal Trainers en este gimnasio.");
        }
    }
}
