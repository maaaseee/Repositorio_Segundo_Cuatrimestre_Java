package integradorpolimorfismo;

public final class Heroe extends Personaje{
    private final String alterEgoHeroe;
    
    public Heroe(String nombre, Editorial editorial, String alterEgoHeroe){
        super(nombre, editorial);
        this.alterEgoHeroe = alterEgoHeroe;
    }
    
    @Override
    public String getNombre(){
        return this.alterEgoHeroe;
    }
    
    public void volar(){
        System.out.println("El heroe " + getNombre() + " está volando.");
    }
}
