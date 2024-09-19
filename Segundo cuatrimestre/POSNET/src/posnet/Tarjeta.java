package POSNET;

public class Tarjeta {
    private final TipoRed tipoRed;
    private final String entidad;
    private String numTarjeta;
    private double saldoRestante;
    private Titular due�o;

    public Tarjeta(TipoRed tipo, String entidad, String numTarjeta, double saldoRestante, 
            Titular due�o) {
        this.tipoRed = tipo;
        this.entidad = entidad;
        this.numTarjeta = numTarjeta;
        this.saldoRestante = saldoRestante;
        this.due�o = due�o;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "tipo=" + tipoRed + ", entidad=" + entidad +
                ", numTarjeta=" + numTarjeta + ", saldoRestante=" +
                saldoRestante + ", due\u00f1o=" + due�o + '}';
    }
    
    public boolean puedoPagar(double monto){
        return this.saldoRestante >= monto;
    }
    
    public void debitar(double monto){
        if(puedoPagar(monto)){
            this.saldoRestante -= monto;
        }
    }
    
    public String getTitular(){
        return this.due�o.getNombreCompletoTitular();
    }
}
