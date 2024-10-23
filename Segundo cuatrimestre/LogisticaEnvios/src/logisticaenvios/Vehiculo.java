package logisticaenvios;

public abstract class Vehiculo {
    private String patente;
    private String marca;
    
    public Vehiculo(String patente, String marca) {
        this.patente = patente;
        this.marca = marca;
    }
    
    public void cargarPaquete() {
        System.out.println("Cargando el paquete...");
    }
    
    public void andarRapido() {
        System.out.println("Acelerando...");
    }
    
    public String getPatente() {
        return this.patente;
    }
}
