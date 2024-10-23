package sistemademercancia;

public class Servicio extends Mercancia {

    private String servicio;
    private double presupuesto;
    private double porcentajeDesc;
    private boolean enPromocion;

    public Servicio(Sistema sistMercancia, String codMercancia, String servicio,
            double presupuesto, double porcentajeDesc, boolean enPromocion) {
        super(sistMercancia, codMercancia);
        this.servicio = servicio;
        this.presupuesto = presupuesto;
        this.porcentajeDesc = porcentajeDesc;
        this.enPromocion = enPromocion;
    }

    @Override
    public double calcularPrecioFinal() {
        return enPromocion ? (presupuesto * calcularDescFinal()) : presupuesto;
    }

    private double calcularDescFinal() {
        double descuentoRedux = porcentajeDesc / 100;
        return 1 - descuentoRedux;
    }

    @Override
    public String toString() {
        return "Servicio{" + "servicio=" + servicio + ", presupuesto=" + presupuesto + ", porcentajeDesc=" + porcentajeDesc + ", enPromocion=" + enPromocion + '}';
    }

    @Override
    protected boolean checkDescuento(boolean oferta) {
        return this.enPromocion == oferta;
    }
}
