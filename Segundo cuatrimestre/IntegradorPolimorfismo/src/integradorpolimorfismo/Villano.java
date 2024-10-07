package integradorpolimorfismo;

public final class Villano extends Personaje {
    private String alterEgoVillano;
    
    public Villano(String nombre, Editorial editorial, String alterEgoVillano){
        super(nombre, editorial);
        this.alterEgoVillano = alterEgoVillano;
    }
    
    @Override
    public String getNombre(){
        return this.alterEgoVillano;
    }
    
    public void atacar(){
        System.out.println("El villano " + getNombre() + " está atacando.");
    }
}
