package POSNET;

public class Tarjeta {
    private final TipoRed tipoRed;
    private final String entidad;
    private String numTarjeta;
    private double saldoRestante;
    private Titular dueño;

    public Tarjeta(TipoRed tipo, String entidad, String numTarjeta, double saldoRestante, 
            Titular dueño) {
        this.tipoRed = tipo;
        this.entidad = entidad;
        this.numTarjeta = numTarjeta;
        this.saldoRestante = saldoRestante;
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "tipo=" + tipoRed + ", entidad=" + entidad +
                ", numTarjeta=" + numTarjeta + ", saldoRestante=" +
                saldoRestante + ", due\u00f1o=" + dueño + '}';
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
        return this.dueño.getNombreCompletoTitular();
    }
}
