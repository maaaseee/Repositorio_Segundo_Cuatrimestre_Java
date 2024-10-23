package concesionario;

public class main {

    public static void main(String[] args) {
        Concesionario cons = new Concesionario("Zona norte");
        try {
            Auto a1 = new Auto("ADS942", "Fiat", "Chronos");
            cons.agregarAuto(a1);
            Auto a2 = new Auto("ADS942", "Fiat", "Chronos");
            cons.agregarAuto(a2);
        } 
        catch (NullPointerException e) {
            System.err.println("No se permite agregar un null al concesionario.");
        } 
        catch (AutoRepetidoException e) {
            System.err.println(e.getMessage());
        }
        
        cons.listarAutos();
    }
    
}
