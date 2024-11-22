package pp_progii_zoo;


public class main {

    public static void main(String[] args) {
        Zoologico zoo1 = new Zoologico("Buenos aires");
        
        cargarZoo(zoo1);
        
        System.out.println("");
        zoo1.mostrarAnimales();
        System.out.println("");
        zoo1.vacunarAnimales();
    }
    
    public static void cargarZoo(Zoologico zoo) {
        Animal an1 = new Mamifero("Oveja", 10, 120.23, Dieta.HERBIVORO);
        Animal an2 = new Reptil("Dragón de Komodo", 5, "Granular", "Endotérmico");
        Animal an3 = new Ave("Tucán", 2, 41.2);
        
        // Crear animal con edad menor a 0:
        try {
            Animal an4 = new Ave("Tucán", -5, 41.2);
        } catch (EdadNoPermitidaException e) {
            System.err.println(e.getMessage());
        }
        
        
        // Agregando animales al zoo:
        try {
            zoo.agregarAnimal(an1);
            zoo.agregarAnimal(an2);
            zoo.agregarAnimal(an3);
        } catch (AnimalRepetidoException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("No se puede ingresar un null al zoológico...");
        }
        
        // Agregando un animal repetido:
        try {
            zoo.agregarAnimal(new Mamifero("Oveja", 10, 140.23, Dieta.HERBIVORO));
        } catch (AnimalRepetidoException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("No se puede ingresar un null al zoológico...");
        }
        
        // Agregando un null:
        try {
            zoo.agregarAnimal(null);
        } catch (AnimalRepetidoException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("No se puede ingresar un null al zoológico...");
        }
    }
    
}
