package herenciaconcesionario;

public class HerenciaConcesionario {

    public static void main(String[] args) {
        Concesionario quilmes = new Concesionario("Pepe Motores");
        Auto auto1 = new Auto("Fiat", "Regatta", "LKX584");
        Moto moto1 = new Moto("Yamaha", "FZ 25", "AXA124");
        Auto auto2 = new Auto("Audi", "Q2", "GSK141");
        Moto moto2 = new Moto("Royal Enfield", "Shotgun 650", "LMB154");
        Camion camioneta = new Camion("Ford", "Ybza 512", "KXM548", 4000.4);
        
        quilmes.agregarVehiculo(auto1);
        quilmes.agregarVehiculo(auto2);
        quilmes.agregarVehiculo(moto1);
        quilmes.agregarVehiculo(moto2);
        //quilmes.listarVehiculos();
        quilmes.listarAutos();
        
        
        auto1.acelerar();
        moto1.acelerar();
        camioneta.acelerar();
    }
}
