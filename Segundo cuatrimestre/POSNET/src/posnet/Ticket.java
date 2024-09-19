package POSNET;

public class Ticket {
    private String nombreCliente;
    private double montoTotal;
    private int cuotas;

    public Ticket(String nombreCliente, double montoTotal, int cuotas) {
        this.nombreCliente = nombreCliente;
        this.montoTotal = montoTotal;
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Ticket\nNombre del cliente = " + nombreCliente + 
                String.format(", Monto total = $%.2f, Monto de c/cuota = $%.2f", montoTotal, (montoTotal / cuotas));
    }
    
}
