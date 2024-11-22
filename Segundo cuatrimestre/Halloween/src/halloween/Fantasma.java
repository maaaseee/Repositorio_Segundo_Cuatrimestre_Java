package halloween;

public class Fantasma extends Espectro{
    private double transparencia;
    
    public Fantasma(String nombre, int energia, int nivelEspiritual, double transparencia) {
        super(nombre, energia, nivelEspiritual);
        this.transparencia = transparencia;
    }
    
    void fantasmear() {
        System.out.println("Mi transparencia es del " + transparencia + "%, y floto por lo habitación.");
    }

    @Override
    public String toString() {
        return "Fantasma{" + "nombre=" + getNombre() + ", energia=" + 
                getEnergia() + "transparencia=" + transparencia + "nivelEspiritual=" + getNivelEspiritual() + '}';
    }
}
