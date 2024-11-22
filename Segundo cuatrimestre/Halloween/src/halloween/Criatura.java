package halloween;

public class Criatura {
    private String nombre;
    private int energia;

    public Criatura(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Criatura{" + "nombre=" + nombre + ", energia=" + energia + '}';
    }
    
    public void asustar() {
        System.out.println("BOOOOO, soy " + nombre + ", y te asusto.");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }
}
