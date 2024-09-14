package POSNET;
import java.util.ArrayList;

public class Posnet {
    private final static int MAX_CUOTAS = 6;
    private final static double RECARGO = 0.03;
    private static ArrayList<Ticket> historial;
    
    public static Ticket efectuarPago(Tarjeta tarjeta, int cuotas, double costo){
        if (tarjeta.getSaldo() < costo && costo < 0 && cuotas > MAX_CUOTAS) {
            return null;
        }
        if (cuotas > 1) {
            int cuotasRedux = cuotas - 1;
            double costoConRecargo = costo * (cuotasRedux * RECARGO + 1);
            double montoEnCuotas = costoConRecargo / cuotas;
            tarjeta.cobrarPago(montoEnCuotas);
            return new Ticket(tarjeta.getTitular(), costoConRecargo, montoEnCuotas);
        } else {
            tarjeta.cobrarPago(costo);
            return new Ticket(tarjeta.getTitular(), costo, costo);
        }
    }
}
