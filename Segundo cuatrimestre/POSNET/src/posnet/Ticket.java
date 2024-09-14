package POSNET;

public class Ticket {
    private String nombreCliente;
    private double montoTotal;
    private double montoCuota;

    public Ticket(String nombreCliente, double montoTotal, double montoCuota) {
        this.nombreCliente = nombreCliente;
        this.montoTotal = montoTotal;
        this.montoCuota = montoCuota;
    }

    @Override
    public String toString() {
        return "Ticket{" + "nombreCliente=" + nombreCliente + 
                String.format(", montoTotal=%.2f, montoCuota=%.2f}", montoTotal, montoCuota);
    }
    
}
