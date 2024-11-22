package pp_progii_zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    
    private String nombre;
    private List<Animal> animales;

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }
    
    public void agregarAnimal(Animal animalAg) {
        /*
        Se agrega un animal a la lista, verificando que no esté repetido, 
        ni que sea null.
        */
        if (animalAg == null) {
            throw new NullPointerException();
        }
        for (Animal animal : animales) {
            if (animalAg.equals(animal)) {
                throw new AnimalRepetidoException();
            }
        }
        animales.add(animalAg);
    }
    
    public void mostrarAnimales() {
        // Muestra todos los animales del zoologico.
        if (!(animales.isEmpty())) {
            System.out.println("Zoológico " + nombre);
            System.out.println("----------------------------------------------------------------------");
            for (Animal animal : animales) {
                System.out.println(animal);
                System.out.println("----------------------------------------------------------------------");
            }
        }
    }
    
    public void vacunarAnimales() {
        /*
        Se vacuna a todos los animales que PUEDAN SER VACUNADOS, 
        verificando que pertenezcan a ese grupo.
        */
        if (!(animales.isEmpty())) {
            System.out.println("Vacunando animales de zoológico: " + nombre);
            System.out.println("----------------------------------------------------------------------");
            for (Animal animal : animales) {
                if (animal instanceof Vacunable an) {
                    an.vacunar();
                } else {
                    System.out.println("Este animal no se puede vacunar:\n" + animal);
                }
                System.out.println("----------------------------------------------------------------------");
            }
        }
    }
}
