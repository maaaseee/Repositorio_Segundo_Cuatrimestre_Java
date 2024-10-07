package integradorherencia;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;
    // private static final char[] LITERALES = {'A', 'J', 'Q', 'K'};
    
    public Mazo(){
        this.cartas = new ArrayList<>();
        generarCartas();
    }
    
    private void crearFiguras(Palo palo){
        for (int i = 0; i < CartaFigura.LITERALES.length; i++) {
            cartas.add(new CartaFigura(palo, CartaFigura.LITERALES[i]));
        }
    }
    
    private void crearNumeros(Palo palo){
        for (int i = CartaNumerica.MIN_VALUE; i <= CartaNumerica.MAX_VALUE; i++) {
            cartas.add(new CartaNumerica(palo, i));
        }
    }
    
    private void crearComodines(){
        cartas.add(new Comodin(true));
        cartas.add(new Comodin(false));
    }
    
    private void generarCartas(){
        for (int i = 0; i < Palo.values().length; i++) {
            crearFiguras(Palo.values()[i]);
            crearNumeros(Palo.values()[i]);
        }
        crearComodines();
    }
    
    public void listarCartas(){
        for (Carta carta : cartas) {
            carta.mostrar();
        }
    }
    
    public void voltearCartas(){
        for (Carta carta : cartas) {
            carta.voltear();
        }
    }
    
    public void mezclarCartas(){
        Collections.shuffle(cartas);
    }
    
    @Override
    public String toString(){
        return "Mazo {Cantidad de cartas: " + cartas.size() + '}';
    }
}
