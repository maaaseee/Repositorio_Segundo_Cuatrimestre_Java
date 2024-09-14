package auto;

public class Main {

    public static void main(String[] args) {
        
        //Auto auto1 = new Auto("ABC890", "Fiat", 200000, "Gris oscuro", new Motor("bco988ds", 1.8, "Nafta"));
        //Auto auto2 = new Auto("ABC145", "Chevrolet", 205000, "Gris oscuro", new Motor("bco988ds", 1.8, "Nafta"));
        
        Estacionamiento est_shopping = new Estacionamiento();
        
        Auto auto1 = new Auto("ABC890", "Fiat", 200000, Color.GRIS, "adag4924", 1.8, "Nafta");
        Auto auto2 = new Auto("ABC145", "Chevrolet", 205000, Color.BLANCO, "dasd2412", 1.8, "Nafta");
        Auto auto3 = new Auto("VXL405", "Audi", 650000, Color.NEGRO, "hffg5234", 2.0, "Diesel");
       
        auto1.acelerar();
        
        System.out.println(auto1);
        
        est_shopping.estacionarAuto(auto1);
        est_shopping.estacionarAuto(auto2);
        est_shopping.estacionarAuto(auto3);
        
        int cantidad = est_shopping.cantidadAutos();
        
        System.out.println("Hay " + cantidad + " auto/s estacionado/s");
        
        est_shopping.listarAutos();
    }
}
