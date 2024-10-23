package sistemademercancia;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private int numSistema;
    private List<Mercancia> listMercancia;

    public Sistema(int numSist) {
        this.numSistema = numSist;
        this.listMercancia = new ArrayList<>();
    }

    public Mercancia traerMercancia(String codMercancia) {
        if (!(listMercancia.isEmpty())) {
            int i = 0;

            while (i < listMercancia.size() && !(listMercancia.get(i).compareCodMercancia(codMercancia))) {
                i++;
            }
            return (i == listMercancia.size()) ? null : listMercancia.get(i);
        } else {
            System.out.println("No hay mercancias en este sistema.");
            return null;
        }
    }

    public ArrayList<Mercancia> traerMercancia(boolean enOferta) {
        if (!(listMercancia.isEmpty())) {
            ArrayList<Mercancia> listaMercDesc = new ArrayList<>();
            for (Mercancia mercancia : listMercancia) {
                if (mercancia.checkDescuento(enOferta)) {
                    listaMercDesc.add(mercancia);
                }
            }
            return !(listaMercDesc.isEmpty()) ? listaMercDesc : null;
        } else {
            System.out.println("No hay mercancias en este sistema.");
            return null;
        }
    }
    
    private void validarCodRepetido(String codMerc) {
        for (Mercancia mercancia : listMercancia) {
            if (mercancia.codMercancia.equals(codMerc)) {
                throw new CodYaExistenteException();
            }
        }
    }

    public void agregarProducto(String codMercancia, String producto,
            double precioProd, double porcentajeDesc, boolean desc2DaUnidad) {
        validarCodRepetido(codMercancia);
        Producto prod = new Producto(this, codMercancia, producto, precioProd, porcentajeDesc, desc2DaUnidad);
        listMercancia.add(prod);
    }

    public void agregarServicio(String codMercancia, String servicio,
            double presupuesto, double porcentajeDesc, boolean enPromocion) {
        validarCodRepetido(codMercancia);
        Servicio serv = new Servicio(this, codMercancia, servicio, presupuesto, porcentajeDesc, enPromocion);
        listMercancia.add(serv);
    }

}
