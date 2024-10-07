package integradorpolimorfismo;

public class IntegradorPolimorfismo {

    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria("Marvel's Coffee");
        cargarPersonajes(cafeteria);
        
        cafeteria.mostrarNombreClientes();
        
        System.out.println("---------------------------");
        cafeteria.hacerVolarClientes();
        System.out.println("---------------------------");
        cafeteria.hacerAtacarClientes();
        System.out.println("---------------------------");
    }
    
    public static void cargarPersonajes(Cafeteria cafeteria){
        cafeteria.agregarPersonaje(new Heroe("Clark Kent", Editorial.DC, "Superman"));
        cafeteria.agregarPersonaje(new Heroe("Peter Parker", Editorial.MARVEL, "Spiderman"));
        cafeteria.agregarPersonaje(new Villano("Norman Osborn", Editorial.MARVEL, "Duende Verde"));
        cafeteria.agregarPersonaje(new Villano("Jack Oswald White", Editorial.DC, "Joker"));
    }
}
