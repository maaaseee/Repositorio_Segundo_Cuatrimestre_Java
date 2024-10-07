package integradorpolimorfismo;

import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private ArrayList<Personaje> clientesCafeteria;
    
    public Cafeteria(String nombre){
        this.nombre = nombre;
        this.clientesCafeteria = new ArrayList<>();
    }
    
    public void agregarPersonaje(Personaje pj){
        this.clientesCafeteria.add(pj);
    }
    
    public void mostrarNombreClientes(){
        if (!this.clientesCafeteria.isEmpty()) {
            for (Personaje personaje : clientesCafeteria) {
                System.out.println(personaje.getNombre());
            } 
        } else {
            System.out.println("No hay clientes");
        }
    }
    
    public void hacerVolarClientes(){
        if (!this.clientesCafeteria.isEmpty()) {
            for (Personaje personaje : clientesCafeteria) {
                if (personaje instanceof Heroe heroe) {
                    heroe.volar();
                }
            }
        } 
        else {
            System.out.println("No hay clientes");
        }
    }
    
    public void hacerAtacarClientes(){
        if (!this.clientesCafeteria.isEmpty()) {
            for (Personaje personaje : clientesCafeteria) {
                if (personaje instanceof Villano villano) {
                    villano.atacar();
                }
            }
        } 
        else {
            System.out.println("No hay clientes");
        }
    }
    
    public void hacerBreakClientes(){
        for (Personaje personaje : clientesCafeteria) {
            switch (personaje) {
                case Villano villano -> villano.atacar();
                case Heroe heroe -> heroe.volar();
                default -> {
                }
            }
        }
    }
}
