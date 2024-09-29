package animal;

public abstract class Animal {
    String nombre;
    int edad;
    
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract void hacerSonido();
}
