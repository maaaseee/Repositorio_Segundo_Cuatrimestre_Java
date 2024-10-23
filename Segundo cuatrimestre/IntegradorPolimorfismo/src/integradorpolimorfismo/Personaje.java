package integradorpolimorfismo;

public abstract class Personaje {
    private String nombre;
    private Editorial editorial;
    
    public Personaje(String nombre, Editorial editorial){
        this.nombre = nombre;
        this.editorial = editorial;
    }
    
    public abstract String getNombre();
}
