package rectangulo;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private static int nextNumeroDeCuenta = 10000;
    private final int NUMERO_DE_CUENTA;
    
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        this.NUMERO_DE_CUENTA = nextNumeroDeCuenta++;
    }
    
    public void retirarDinero(double retiro){
        if (retiro <= 0) {
            System.out.println("El retiro no puede ser menor o igual a 0");
            return;
        }
        
        if (retiro > this.saldo) {
            System.out.println("El retiro no puede ser mayor al saldo"
                    + " actual de la cuenta");
        } 
        else {
            this.saldo = this.saldo - retiro;
            System.out.println("Se retiró: " + retiro);
        }
    }
    
    public void depositarDinero(double ingreso){
        if (ingreso <= 0) {
            System.out.println("El ingreso no puede ser menor o igual a 0");
        } else {
            this.saldo = this.saldo + ingreso;
            System.out.println("Se ingresó: " + ingreso);
        }
    }
    
    public void consultarSaldo(){
        System.out.println("El saldo de la cuenta es: " + this.saldo);
    }
}
