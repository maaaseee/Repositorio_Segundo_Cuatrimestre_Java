package halloween;

public class Espectro extends Criatura implements Aterrable {
    private int nivelEspiritual;

    public Espectro(String nombre, int energia, int nivelEspiritual) {
        super(nombre, energia);
        this.nivelEspiritual = nivelEspiritual;
    }
    
    @Override
    public void aterrar() {
        System.out.println("Soy " + getNombre() + " y aterro a la gente.");
    }

    @Override
    public String toString() {
        return "Espectro{" + "nombre=" + getNombre() + ", energia=" + getEnergia() + "nivelEspiritual=" + nivelEspiritual + '}';
    }
    
    public int getNivelEspiritual() {
        return nivelEspiritual;
    }
    
    public void materializar() {
        System.out.println("Soy un espectro de nivel " + nivelEspiritual + ", y me materializo.");
    }
}
