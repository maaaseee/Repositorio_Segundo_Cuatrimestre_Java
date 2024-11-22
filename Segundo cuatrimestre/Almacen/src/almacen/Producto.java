package almacen;

public class Producto implements Comparable<Producto>{
    
    private final int ID;
    private String marca;
    private double precio;
    private Tipo tipo;

    public Producto(int ID, String marca, double precio, Tipo tipo) {
        this.ID = ID;
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double porc) {
        precio = precio + (precio * porc / 100);
    }
    @Override
    public String toString() {
        return "Productos{" + "ID=" + ID + ", marca=" + marca + ", precio=" + "%.2f".formatted(precio) + ", tipo=" + tipo + '}';
    }

    @Override
    public int compareTo(Producto o) {
        return Integer.compare(ID, o.ID);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Producto p) {
            return Integer.compare(ID, p.ID) == 0;
        }
        if (obj instanceof Tipo t) {
            return tipo.equals(t);
        }
        
        return false;
    }
    
    
    
    
    
    
    
    
    
    
}
