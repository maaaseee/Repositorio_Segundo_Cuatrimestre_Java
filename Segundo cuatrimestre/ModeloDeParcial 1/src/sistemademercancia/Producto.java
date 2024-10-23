package sistemademercancia;

public class Producto extends Mercancia {

    private String producto;
    private double precioProducto;
    private double porcentajeDesc;
    private boolean esDescuentoEn2daUnidad;

    public Producto(Sistema sistMercancia, String codMercancia, String producto,
            double precioProd, double porcentajeDesc, boolean desc2DaUnidad) {
        super(sistMercancia, codMercancia);
        this.producto = producto;
        this.precioProducto = precioProd;
        this.porcentajeDesc = porcentajeDesc;
        this.esDescuentoEn2daUnidad = desc2DaUnidad;
    }

    @Override
    public double calcularPrecioFinal() {
        return esDescuentoEn2daUnidad ? (precioProducto * calcularDescFinal()) : precioProducto;
    }

    private double calcularDescFinal() {
        double descuentoRedux = (porcentajeDesc / 2) / 100;
        return 1 - descuentoRedux;
    }

    @Override
    public String toString() {
        return "Producto{" + "producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDesc=" + porcentajeDesc + ", esDescuentoEn2daUnidad=" + esDescuentoEn2daUnidad + '}';
    }

    @Override
    protected boolean checkDescuento(boolean oferta) {
        return this.esDescuentoEn2daUnidad == oferta;
    }

}
