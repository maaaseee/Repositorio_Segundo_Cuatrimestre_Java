package POSNET;

public class Main {

    public static void main(String[] args) {
        Tarjeta t1 = new Tarjeta(TipoRed.MASTERCARD, "HSBC", "5315100314841237", 30000, 
                "46745279", "Federico Gustavo", "Aieta", "1136491324", "federicoaieta@gmail.com");
        
        Ticket ticket1 = Posnet.efectuarPago(t1, 5, 20000);
        
        System.out.println(ticket1);
    }
}
