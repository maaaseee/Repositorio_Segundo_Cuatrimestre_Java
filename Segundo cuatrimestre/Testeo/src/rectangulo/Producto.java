package rectangulo;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    private static final int MAX_DESC = 99;
    private static final int MIN_DESC = 0;
    
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = stock;
    }
    
    public void aplicarDescuento(double descuento){
        if (descuento < MAX_DESC && descuento > MIN_DESC) {
            double calculo = this.precio - (this.precio * (descuento / 100));
            System.out.printf("Después de aplicar un descuento del %.2f%%, el precio final queda en: $%.2f\n",
                    descuento, calculo);
            this.precio = calculo;  
        } else {
            System.out.println("No se puede aplicar ese descuento.");
        }
    }
    
    public void realizarVenta(int cantidadVentas){
        if (cantidadVentas <= 0) {
            System.out.println("No se puede vender una cantidad no"
                    + " existente de productos.");
            return;
        }
        
        if (cantidadVentas <= this.cantidadEnStock) {
            this.cantidadEnStock = this.cantidadEnStock - cantidadVentas;
        } else {
            System.out.println("La cantidad de ventas no puede "
                    + "exceder al stock actual.");
        }
    }
}
