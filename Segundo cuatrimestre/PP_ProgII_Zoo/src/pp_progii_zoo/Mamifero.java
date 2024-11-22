package pp_progii_zoo;

public class Mamifero extends Animal implements Vacunable {
    
    private double peso;
    private Dieta dieta;
    
    public Mamifero(String nombre, int edad, double peso, Dieta dieta) {
        super(nombre, edad);
        this.peso = peso;
        this.dieta = dieta;
    }
    
    @Override
    public String toString() {
        return "Mamífero: [" + super.toString() + ", Peso: " + peso + ", dieta: " + dieta + "]";
    }
    
    @Override
    public void vacunar() {
        System.out.println("El animal: [" + super.toString() + "] ha sido vacunado." );
    }
}
