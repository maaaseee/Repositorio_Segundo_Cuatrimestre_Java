package POSNET;

public class Main {

    public static void main(String[] args) {
        Titular due�o = new Titular("46745279", "Federico Gustavo", "Aieta", "1136491324", "federicoaieta@gmail.com");
        Tarjeta t1 = new Tarjeta(TipoRed.Mastercard, "HSBC", "5315100314841237", 30000, due�o);
        
        Posnet psn = new Posnet();
        
        Ticket ticket1 = psn.efectuarPago(t1, 5, 20000);
        psn.verTicket(ticket1);
    }
}
