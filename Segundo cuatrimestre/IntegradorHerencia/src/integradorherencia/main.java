package integradorherencia;

public class main {

    public static void main(String[] args) {
        Mazo mazito = new Mazo();
        
        /*mazito.crearFiguras(Palo.PICAS);
        mazito.crearNumeros(Palo.PICAS);
        mazito.crearComodines();*/
        mazito.listarCartas();
        mazito.voltearCartas();
        mazito.listarCartas();
    }
    
}
