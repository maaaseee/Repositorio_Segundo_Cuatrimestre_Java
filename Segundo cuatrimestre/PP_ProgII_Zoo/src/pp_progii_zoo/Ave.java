package pp_progii_zoo;

public class Ave extends Animal implements Vacunable{
    
    private double envergaduraAlas;

    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }
    
    @Override
    public String toString() {
        return "Ave: [" + super.toString() + ", Envergadura de las alas: " + envergaduraAlas + "]";
    }
    
    @Override
    public void vacunar() {
        System.out.println("El animal: [" + super.toString() + "] ha sido vacunado.");
    }
}
