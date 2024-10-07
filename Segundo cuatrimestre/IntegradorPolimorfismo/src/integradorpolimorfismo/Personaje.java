package integradorpolimorfismo;

public abstract class Personaje {
    private final String NOMBRE;
    private Editorial editorial;
    
    public Personaje(String nombre, Editorial editorial){
        this.NOMBRE = nombre;
        this.editorial = editorial;
    }
    
    public abstract String getNombre();
}
