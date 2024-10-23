package sistemademercancia;

public abstract class Mercancia {

    protected String codMercancia;
    private Sistema sistMercancia;

    public Mercancia(Sistema sistMercancia, String codMercancia) {
        validarCodMercancia(codMercancia);
        this.codMercancia = codMercancia;
        this.sistMercancia = sistMercancia;
    }

    private void validarCodMercancia(String codigo) {
        if (codigo.length() != 7) {
            throw new LenCodMercanciaException();
        }
    }

    public abstract double calcularPrecioFinal();

    public boolean compareCodMercancia(String codMerc) {
        return codMercancia == codMerc;
    }

    protected abstract boolean checkDescuento(boolean oferta);
}
