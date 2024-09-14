package POSNET;

public class Tarjeta {
    private final TipoRed tipoRed;
    private final String entidad;
    private String numTarjeta;
    private double saldoRestante;
    private Titular due�o;

    public Tarjeta(TipoRed tipo, String entidad, String numTarjeta, double saldoRestante, 
            String dni, String nombre, String apellido, String nroTel, String mail) {
        this.tipoRed = tipo;
        this.entidad = entidad;
        this.numTarjeta = numTarjeta;
        this.saldoRestante = saldoRestante;
        this.due�o = new Titular(dni, nombre, apellido, nroTel, mail);
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "tipo=" + tipoRed + ", entidad=" + entidad +
                ", numTarjeta=" + numTarjeta + ", saldoRestante=" +
                saldoRestante + ", due\u00f1o=" + due�o + '}';
    }
    
    public double getSaldo(){
        return this.saldoRestante;
    }
    
    public void cobrarPago(double cobro){
        this.saldoRestante = this.saldoRestante - cobro;
    }
    
    public String getTitular(){
        return this.due�o.getNombreTitular();
    }
}
