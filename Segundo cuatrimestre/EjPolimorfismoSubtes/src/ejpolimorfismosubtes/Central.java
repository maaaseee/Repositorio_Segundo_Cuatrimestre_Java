package ejpolimorfismosubtes;

public class Central {
    private double precioViaje;
    private String nombre;
    
    public Central(String nombre, double precioViaje) {
        this.nombre = nombre;
        this.precioViaje = precioViaje;
    }
    
    public void cambiarPrecioViaje(double nuevoPrecio){
        this.precioViaje = nuevoPrecio;
    }
    
    public double obtenerPrecioViaje(){
        return this.precioViaje;
    }
}
